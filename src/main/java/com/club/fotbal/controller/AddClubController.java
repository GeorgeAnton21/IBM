package com.club.fotbal.controller;

import com.club.fotbal.model.Club;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class AddClubController {
    @GetMapping(value="/AddClub") //acceseaza pagina
    public String AddClub(Model model){
        Club myClub = Club.builder().build();
        model.addAttribute("club", myClub);
        return "AddClub";
    }

    @PostMapping(value="/submitClub")
    public String submitClub(@ModelAttribute Club club){
        System.out.println(club.toString());
        saveToDataBase(club);
        return "Club";
    }

    private void saveToDataBase(Club club) {
        //1000 save to database
    }
}
