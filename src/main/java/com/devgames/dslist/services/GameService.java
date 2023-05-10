package com.devgames.dslist.services;

import com.devgames.dslist.dto.GameDto;
import com.devgames.dslist.dto.GameMinDTO;
import com.devgames.dslist.entities.Game;
import com.devgames.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public GameDto findById(Long id){
        Game result = gameRepository.findById(id).get();
        return  new GameDto(result);
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
       List<Game> result = gameRepository.findAll();
       return result.stream().map(x -> new GameMinDTO(x)).toList();//transforma uma lista de games em uma lista de GamesMinDto
    }
}
