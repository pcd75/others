package com.nath.sma.controller;


import org.springframework.web.bind.annotation.GetMapping;
import com.nath.sma.entity.Aboutus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller

public class AboutUsController{

    @GetMapping("/aboutus")
    public String show(Model model, Aboutus aboutus){
        model.addAttribute("aboutus", aboutus);
        return "aboutus";
    }

}