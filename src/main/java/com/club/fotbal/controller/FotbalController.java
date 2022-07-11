package com.club.fotbal.controller;

import com.club.fotbal.model.Club;
import com.club.fotbal.model.Player;
import com.club.fotbal.repository.ClubRepository;
import com.club.fotbal.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




import java.util.List;
import java.util.Scanner;


@Controller
public class FotbalController {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    ClubRepository clubRepository;

    @GetMapping(value = "/Player")
    public String Player(Model model) {
        List<Player> playerList = playerRepository.findAll();
        model.addAttribute("playerList", playerList);
        return "Player";
    }

    @GetMapping(value = "/Club")
    public String Club(Model model) {
        List<Club> clubList = clubRepository.findAll();
        model.addAttribute("clubList", clubList);
        return "Club";
    }
}