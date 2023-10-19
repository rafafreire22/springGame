package com.senai.rafaella.PrjGame.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.rafaella.PrjGame.entities.Jogo;
import com.senai.rafaella.PrjGame.repositories.jogoRepository;

@Service
public class JogoService {
	private final jogoRepository jogoRepository;
	
	@Autowired
	public JogoService(jogoRepository jogoRepository) {
		this.jogoRepository = jogoRepository;
	}
	
	public Jogo getJogoById(Long id) {
		return jogoRepository.findById(id).orElse(null);
	}
	public List<Jogo> getAllJogos(){
		return jogoRepository.findAll();
	}
	
	
}
