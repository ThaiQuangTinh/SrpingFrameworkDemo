package com.example.springdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestLayoutController {

    @GetMapping("/homeLayout")
    public String home(Model model) {
        model.addAttribute("titlePage", "Home Page");
        model.addAttribute("contentTemplate", "content_template");
        return "home_layout";
    }
}
