package com.devgames.dslist.controllers;

import com.devgames.dslist.dto.GameMinDTO;
import com.devgames.dslist.entities.Game;
import com.devgames.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameMinDTO>> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return  ResponseEntity.ok().body(result);
    }

}
