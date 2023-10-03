package cz.czechitas.java2webapps.lekce3.controller;

import cz.czechitas.java2webapps.lekce3.entity.Address;
import cz.czechitas.java2webapps.lekce3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class cviceni1Controller {

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        Address address = new Address();
        address.setCity("Praha");
        address.setStreet("Nová 5");
        address.setZipCode("45211");
        Person person = new Person();
        person.setAddress(address);
        person.setDateOfBirth(LocalDate.of(1991, 4, 1));
        person.setLastName("Česká");
        person.setFirstName("Anežka");
        person.setPhotoUrl("https://thispersondoesnotexist.com/");

        modelAndView.addObject("person", person);

        return modelAndView;
    }
}
