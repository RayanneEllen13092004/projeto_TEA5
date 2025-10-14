package com.projetoTEA5.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(){
        return "index";
    }

    @GetMapping("/tutor-cad")
    public String registerUser(){
        return  "tutor-cad";
    }

    @GetMapping("/tutor-login")
    public String login(){
        return "tutor-login";
    }
}
