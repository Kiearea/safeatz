package com.example.safEatz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DetailController {

    @RequestMapping(value = "detail")
    public String index(Model model) {

    return "detail";
    }
}


