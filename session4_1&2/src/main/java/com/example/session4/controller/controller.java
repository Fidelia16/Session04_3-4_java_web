package com.example.session4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller")
public class controller {
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("message","Hello Spring MVC");
        return "hello";

    }
}
