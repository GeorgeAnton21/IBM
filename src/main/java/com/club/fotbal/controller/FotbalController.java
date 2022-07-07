package com.club.fotbal.controller;

import com.club.fotbal.model.Club;
import com.club.fotbal.model.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class FotbalController {
    private Object clubList;

    @GetMapping(value = "/Player")
    public String Player(Model model) {
    //Player myPlayer = Player.builder().build();
        List<Player> playerList = List.of(
                new Player("Tatarusanu", 3000, "Steaua Bucuresti", "Portar"),
                new Player("Messi", 9000, "Barcelona", "Atacant"),
                new Player("Ronaldo", 9001, "Realmadrid", "Atacant"),
                new Player("Mutu", 2000, "Otelu Galati", "Fundas"));

        model.addAttribute("Player", playerList);

        return "Player";
    }

    @GetMapping(value = "/Club")
    public String Club(Model model) {
    //Club myClub = Club.builder().build();
        List<Club> clubList = List.of(
                new Club("Steaua Bucuresti", 30, 1),
                new Club("Barcelona", 20, 4),
                new Club("Realmadrid", 40, 1),
                new Club("Otelu Galati", 25, 2));

        model.addAttribute("Club", clubList);
        return "Club";
    }
}