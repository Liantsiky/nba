package org.nba.service;

import java.util.ArrayList;
import java.util.List;

import org.nba.model.EquipeSaison;
import org.nba.repository.EquipeSaisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EquipeSaisonService {
	
	@Autowired
	EquipeSaisonRepository equipeSaisonRepo;
	
	// An object to transform an entity to json value
	@Autowired
	ObjectMapper objectMapper;
	
	public ResponseEntity<List<EquipeSaison>> getAll() {
		List<EquipeSaison> equipes = new ArrayList<>();
		
		try {
			
			equipeSaisonRepo.findAll().forEach(equipes::add);
			return new ResponseEntity<>(equipes, HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<String> insert(EquipeSaison entity){
		try {
			
			EquipeSaison equipeSaison = new EquipeSaison();
			
			equipeSaison.setId(entity.getId());
			equipeSaison.setJoueur(entity.getJoueur());
			equipeSaison.setEquipe(entity.getEquipe());
			equipeSaison.setNumeroJoueur(entity.getNumeroJoueur());
			equipeSaison.setSaison(entity.getSaison());
			
			String response = objectMapper.writeValueAsString(equipeSaison);
			
			return new ResponseEntity<String>(response, HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
