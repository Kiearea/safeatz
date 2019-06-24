package com.example.safEatz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignupController {

    @RequestMapping(value = "signup")
    public String index(Model model) {

        return "signup";
    }

}


