package com.santt4na.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santt4na.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
