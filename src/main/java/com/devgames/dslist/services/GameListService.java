package com.devgames.dslist.services;

import com.devgames.dslist.dto.GameListDto;
import com.devgames.dslist.dto.GameMinDTO;
import com.devgames.dslist.entities.Game;
import com.devgames.dslist.entities.GameList;
import com.devgames.dslist.projection.GameMinProjection;
import com.devgames.dslist.repositories.GameListRepository;
import com.devgames.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll(){
       List<GameList> result = gameListRepository.findAll();
       return result.stream().map(x -> new GameListDto(x)).toList();
    }

    //dado uma lista, origem e destino, atualiza a posição da lista no banco de dados
    @Transactional
    public void mov(Long listId, int sourceIndex, int destinationIndex){

        List<GameMinProjection> list = gameRepository.searchByList(listId);
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex,obj);

        int mim = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = mim; i <= max; i++){
            gameListRepository.updateBelongingPosition(listId,list.get(i).getId(),i);
        }
    }
}
