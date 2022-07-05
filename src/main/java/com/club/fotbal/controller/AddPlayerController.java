package com.club.fotbal.controller;


import com.club.fotbal.model.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class AddPlayerController {
    @GetMapping(value="AddPlayer") //acceseaza pagina
    public String Player(Model model){
        Player AddPlayer = Player.builder().build();
        model.addAttribute("Player", AddPlayer);
        return "AddPlayer";
    }

    @PostMapping(value="/AddPlayer")
    public String AddPlayer(@ModelAttribute Player Player){

        return "AddPlayer";
    }

    private void saveToDataBase(Player player) {
        //1000 save to database
    }
}