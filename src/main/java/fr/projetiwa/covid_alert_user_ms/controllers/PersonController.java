package fr.projetiwa.covid_alert_user_ms.controllers;


import fr.projetiwa.covid_alert_user_ms.models.Person;
import fr.projetiwa.covid_alert_user_ms.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonRepository personRepository ;

    @GetMapping
    public List<Person> list () {
        return personRepository.findAll(); }
    @GetMapping
    @RequestMapping("{id}")
    public Person get ( @PathVariable Long id ) {
        return personRepository.getOne(id); }
    @PostMapping
    @ResponseStatus ( HttpStatus.CREATED )
    public Person create(@RequestBody final Person person) {
        return personRepository.saveAndFlush(person); }

}
