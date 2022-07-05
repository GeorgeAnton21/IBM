package com.club.fotbal.controller;

import com.club.fotbal.model.Club;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class AddClubController {
    @GetMapping(value="AddClub") //acceseaza pagina
    public String Club(Model model){
        Club AddClub = Club.builder().build();
        model.addAttribute("Club", AddClub);
        return "AddClub";
    }

    @PostMapping(value="/AddClub")
    public String AddClub(@ModelAttribute Club club){

        return "AddClub";
    }

    private void saveToDataBase(Club club) {
        //1000 save to database
    }
}
