package com.devgames.dslist.controllers;

import com.devgames.dslist.dto.GameListDto;
import com.devgames.dslist.dto.GameMinDTO;
import com.devgames.dslist.dto.ReplacementDto;
import com.devgames.dslist.projection.GameMinProjection;
import com.devgames.dslist.services.GameListService;
import com.devgames.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDto> findAll(){
        List<GameListDto> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDto body) {
        gameListService.mov(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
