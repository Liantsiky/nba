package org.nba.service;

import java.util.ArrayList;
import java.util.List;

import org.nba.model.Joueur;
import org.nba.repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class JoueurService {
	
	@Autowired
	JoueurRepository joueurRepo;
	
	// An object to transform an entity to json value
	@Autowired
	ObjectMapper objectMapper;
	
	public ResponseEntity<List<Joueur>> getAll() {
		List<Joueur> joueurs = new ArrayList<>();
		
		try {
			
			joueurRepo.findAll().forEach(joueurs::add);
			return new ResponseEntity<>(joueurs, HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public ResponseEntity<String> insert(Joueur entity){
		try {
			
			Joueur joueur = new Joueur();
			
			joueur.setId(entity.getId());
			joueur.setNomPrenom(entity.getNomPrenom());
			
			String response = objectMapper.writeValueAsString(joueur);
			
			return new ResponseEntity<String>(response, HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
