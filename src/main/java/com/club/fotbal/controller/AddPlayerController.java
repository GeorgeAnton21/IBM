package com.club.fotbal.controller;


import com.club.fotbal.model.Club;
import com.club.fotbal.model.Player;
import com.club.fotbal.repository.ClubRepository;
import com.club.fotbal.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller

public class AddPlayerController {

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    ClubRepository clubRepository;

    @GetMapping(value="/AddPlayer") //acceseaza pagina
    public String AddPlayer(Model model){
        Player myPlayer = Player.builder().build();
        model.addAttribute("player", myPlayer);

        List<Club> clubList = clubRepository.findAll();
        model.addAttribute("clubList", clubList);

        return "AddPlayer";
    }

    @PostMapping(value="/submitPlayer")
    public String submitPlayer(@ModelAttribute Player player, Model model){
        playerRepository.save(player);
        return "redirect:/Player";
    }

    @PostMapping(value= "/editPlayer")
    public String editPlayer(@RequestParam("playerId") int id, Model model){
     Player player = playerRepository.findById(id).get();

        model.addAttribute("player", player );

        List<Club> clubList = clubRepository.findAll();
        model.addAttribute("clubList", clubList);
        return "AddPlayer";
    }

    @PostMapping(value = "/deletePlayer")
    public String deletePlayer(@RequestParam("playerId") int id){
        playerRepository.deleteById(id);
        return "redirect:/Player";
    }
}
