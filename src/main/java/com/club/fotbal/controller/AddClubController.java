package com.club.fotbal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class AddClubController {
    @GetMapping(value="/AddClub")
    public String Club(){
        return "AddClub";
        }
}
