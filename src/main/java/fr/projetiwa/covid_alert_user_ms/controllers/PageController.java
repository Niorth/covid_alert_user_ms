package fr.projetiwa.covid_alert_user_ms.controllers;

import fr.projetiwa.covid_alert_user_ms.models.Person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@CrossOrigin
public class PageController {
    @GetMapping("/person/index")
    public String accueil () {
        return "index";
    }

}
