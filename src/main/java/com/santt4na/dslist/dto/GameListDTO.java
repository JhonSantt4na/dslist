package com.santt4na.dslist.dto;

import com.santt4na.dslist.entities.GameList;

public class GameListDTO {

   private Long id;
   private String name;

   public GameListDTO() {
   }

   public GameListDTO(GameList entity) {
      id = entity.getId();
      name = entity.getName();
   }

   // Sem o Beans usamos somente os Getters
   public Long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

}
