package com.devcore.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcore.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
