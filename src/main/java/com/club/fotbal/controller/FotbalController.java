package com.club.fotbal.controller;

import com.club.fotbal.model.Club;
import com.club.fotbal.model.Jucatori;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class FotbalController {
    private Object clubList;

    @GetMapping(value = "/Jucatori")
    @ResponseBody
    public String Jucatori(Model model) {

        List<Jucatori> jucatoriList = List.of(
                new Jucatori("Tatarusanu", 3000, "Steaua Bucuresti", "Portar"),
                new Jucatori("Messi", 9000, "Barcelona", "Atacant"),
                new Jucatori("Ronaldo", 9001, "Realmadrid", "Atacant"),
                new Jucatori("Mutu", 2000, "Otelu Galati", "Fundas"));

        model.addAttribute("jucatoriList", jucatoriList);

        return "Jucatori";
    }

    @GetMapping(value = "/Club")
    @ResponseBody
    public String Club(Model model) {

        List<Club> ClubList = List.of(
                new Club("Staua Bucuresti", 30, 1),
                new Club("Barcelona", 20, 4),
                new Club("Realmadrid", 40, 1),
                new Club("Otelu Galati", 25, 2));
        
        model.addAttribute("clubList", clubList);

        return "Club";
    }
}