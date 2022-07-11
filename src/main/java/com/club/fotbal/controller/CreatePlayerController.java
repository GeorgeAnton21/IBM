package com.club.fotbal.controller;

import com.club.fotbal.model.Player;
import com.club.fotbal.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CreatePlayerController {

    @Autowired
    PlayerRepository playerRepository;

    @GetMapping(value = "/createPlayer")
    @ResponseBody
    public String createPlayer(){

        Player player = Player.builder()
                .namep("Tatarusanu")
                .salary(15000)
                .pozition("Portar")
                //.club("Steaua")
                .build();
        playerRepository.save(player);
        return "OK";
    }
}
