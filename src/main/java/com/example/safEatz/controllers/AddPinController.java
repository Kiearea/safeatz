package com.example.safEatz.controllers;

import com.example.safEatz.models.Pin;
import com.example.safEatz.models.data.PinDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class AddPinController {

    @Autowired
    private PinDao pinDao;

//want to add pins to the map and have them persist
//many pins for one user
    @RequestMapping(value="", method= RequestMethod.GET)
    public String addPinForm(Model model) {
        model.addAttribute("pin", new Pin());
        return "index";
    }

    @RequestMapping(value="", method= RequestMethod.POST)
    public String addPin(Model model, @ModelAttribute Pin pin) {
        pinDao.save(pin);

        return "redirect:/";
    }

}
