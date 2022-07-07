package com.club.fotbal.controller;


import com.club.fotbal.model.Club;
import com.club.fotbal.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CreateClubController {

    @Autowired
    ClubRepository clubRepository;

    @GetMapping(value = "/createClub")
    @ResponseBody
    public String createClub() {

        Club club = Club.builder()
                .name("Steaua")
                .players(28)
                .league(2)
                .build();
        clubRepository.save(club);
        return "OK";
    }


    /*@GetMapping(value = "/showClub")
    @ResponseBody
    public String showClub() {
        List<Club> clubList = clubRepository.findAll();
        for (Club c : clubList) {
            System.out.println(c.toString());
        }
        return "OK";
    }*/
}


