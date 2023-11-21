package org.nba.service;

import java.util.ArrayList;
import java.util.List;
import org.nba.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.nba.model.Equipe;

@Service
public class EquipeService {
	
	@Autowired
	EquipeRepository equipeRepo;
	
	// An object to transform an entity to json value
	@Autowired
	ObjectMapper objectMapper;
	
	public ResponseEntity<List<Equipe>> getAll() {
		List<Equipe> equipes = new ArrayList<>();
		
		try {
			
			equipeRepo.findAll().forEach(equipes::add);
			return new ResponseEntity<>(equipes, HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<String> insert(Equipe entity){
		try {
			
			Equipe equipe = new Equipe();
			
			equipe.setId(entity.getId());
			equipe.setNomEquipe(entity.getNomEquipe());
			
			String response = objectMapper.writeValueAsString(equipe);
			
			return new ResponseEntity<String>(response, HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
