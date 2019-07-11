package com.me.ssmanno.controller;

import com.me.ssmanno.pojo.Person;
import com.me.ssmanno.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("personList")
    public String personList(Model model) {
        List<Person> list = personService.findAll();
        model.addAttribute("list",list);
        return "person";
    }
}
