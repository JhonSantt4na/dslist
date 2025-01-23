package com.santt4na.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.santt4na.dslist.dto.GameDTO;
import com.santt4na.dslist.dto.GameMinDTO;
import com.santt4na.dslist.entities.Game;
import com.santt4na.dslist.projections.GameMinProjection;
import com.santt4na.dslist.repositories.GameRepository;

@Service
public class GameService {

   @Autowired
   private GameRepository gameRepository;

   @Transactional(readOnly = true)
   public GameDTO findById(Long id) {
      Game result = gameRepository.findById(id).get();
      GameDTO dto = new GameDTO(result);
      return dto;
   }

   @Transactional(readOnly = true)
   public List<GameMinDTO> findAll() {
      List<Game> result = gameRepository.findAll();
      List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
      return dto;
   }

   @Transactional(readOnly = true)
   public List<GameMinDTO> findByList(Long listId) {
      List<GameMinProjection> result = gameRepository.searchByList(listId);
      List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
      return dto;
   }

}