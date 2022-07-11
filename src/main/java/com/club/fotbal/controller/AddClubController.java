package com.club.fotbal.controller;

import com.club.fotbal.model.Club;
import com.club.fotbal.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller

public class AddClubController {

    @Autowired
    ClubRepository clubRepository;


    @GetMapping(value="/AddClub") //acceseaza pagina
    public String AddClub(Model model){
        Club myClub = Club.builder().build();
        model.addAttribute("club", myClub);
        return "AddClub";
    }

    @PostMapping(value="/submitClub")
    public String submitClub(@ModelAttribute Club club, Model model) {
        clubRepository.save(club);
        return "redirect:/Club";
    }
}
