package com.devcore.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devcore.dslist.dto.GameListDTO;
import com.devcore.dslist.entities.GameList;
import com.devcore.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameLisRepository;

	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameLisRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)). toList();
	}
}
