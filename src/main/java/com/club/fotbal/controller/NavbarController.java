package com.club.fotbal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class NavbarController {
    @GetMapping(value="/Navbar")
    public String NavbarController(){
        return "Navbar";
    }
}