package fr.projetiwa.covid_alert_user_ms.controllers;

import fr.projetiwa.covid_alert_user_ms.models.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/person/register")
    public String mainPage (Model model) {
        model.addAttribute("person", new Person());
        return "register";
    }
}
