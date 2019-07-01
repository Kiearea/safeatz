package com.example.safEatz.controllers;

import com.example.safEatz.models.Pin;
import com.example.safEatz.models.data.PinDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("api")
public class ApiController {

    @Autowired
    private PinDao pinDao;

    @GetMapping("")
    @ResponseBody
    public List<Pin> getAllPins() {
        Iterable<Pin> itPins = pinDao.findAll();
        ArrayList<Pin> pins = new ArrayList<>();
        itPins.forEach(pins::add);
        return pins;
    }

}
