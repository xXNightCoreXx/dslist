package com.devcore.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcore.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
