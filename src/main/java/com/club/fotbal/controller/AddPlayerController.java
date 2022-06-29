package com.club.fotbal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class AddPlayerController {
    @GetMapping(value="/AddPlayer")
    public String Player(){
        return "AddPlayer";
    }
}