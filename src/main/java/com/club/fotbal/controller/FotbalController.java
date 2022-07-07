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
                new Player(1,"Tatarusanu", 3000, "Steaua Bucuresti", "Portar"),
                new Player(2,"Messi", 9000, "Barcelona", "Atacant"),
                new Player(3,"Ronaldo", 9001, "Realmadrid", "Atacant"),
                new Player(4,"Mutu", 2000, "Otelu Galati", "Fundas"));

        model.addAttribute("Player", playerList);

        return "Player";
    }

    @GetMapping(value = "/Club")
    public String Club(Model model) {
    Club myClub = Club.builder()
            .id(1)
            .name("Steaua Bucuresti")
            .players(30)
            .league(1)

            .id(2)
            .name("Barcelona")
            .players(20)
            .league(4)

            .id(3)
            .name("Realmadrid")
            .players(40)
            .league(1)

            .id(4)
            .name("Otelu Galati")
            .players(25)
            .league(2)
            .build();
        List<Club>clubList = List.of(
                new Club(1, "Steaua Bucuresti", 30, 1),
                new Club(2,"Barcelona", 20, 4),
                new Club(3,"Realmadrid", 40, 1),
                new Club(4,"Otelu Galati", 25, 2));

        model.addAttribute("Club", clubList);
        return "Club";
    }
}