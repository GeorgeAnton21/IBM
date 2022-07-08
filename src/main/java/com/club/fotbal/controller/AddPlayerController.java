package com.club.fotbal.controller;


import com.club.fotbal.model.Player;
import com.club.fotbal.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class AddPlayerController {

    @Autowired
    PlayerRepository playerRepository;

    @GetMapping(value="/AddPlayer") //acceseaza pagina
    public String AddPlayer(Model model){
        Player myPlayer = Player.builder().build();
        model.addAttribute("player", myPlayer);
        return "AddPlayer";
    }

    @PostMapping(value="/submitPlayer")
    public String submitPlayer(@ModelAttribute Player player){
        System.out.println(player.toString());
        saveToDataBase(player);
        return "Player";
    }

    private void saveToDataBase(Player player){
        playerRepository.save(player);
    }
}