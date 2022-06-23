package com.club.fotbal.controller;

import com.club.fotbal.model.Club;
import com.club.fotbal.model.Jucator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class FotbalController {
    private Object clubList;

    @GetMapping(value = "/jucator")
    public String Jucator(Model model) {

        List<Jucator> jucatorList = List.of(
                new Jucator("Tatarusanu", 3000, "Steaua Bucuresti", "Portar"),
                new Jucator("Messi", 9000, "Barcelona", "Atacant"),
                new Jucator("Ronaldo", 9001, "Realmadrid", "Atacant"),
                new Jucator("Mutu", 2000, "Otelu Galati", "Fundas"));

        model.addAttribute("jucatorList", jucatorList);

        return "Jucator";
    }

    @GetMapping(value = "/club")
    public String Club(Model model) {

        List<Club> clubList = List.of(
                new Club("Staua Bucuresti", 30, 1),
                new Club("Barcelona", 20, 4),
                new Club("Realmadrid", 40, 1),
                new Club("Otelu Galati", 25, 2));
        
        model.addAttribute("clubList", clubList);

        return "Club";
    }
}