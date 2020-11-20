package fr.projetiwa.covid_alert_user_ms.controllers;

import fr.projetiwa.covid_alert_user_ms.models.Person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @GetMapping("/person/register")
    public String mainPage (Model model) {
        model.addAttribute("person", new Person());
        return "register";
    }

    @GetMapping
    @CrossOrigin(origins = "*")
    public String accueil () {
        return "index";
    }

}
