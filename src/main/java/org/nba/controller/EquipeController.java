package org.nba.controller;

import java.util.ArrayList;
import java.util.List;

import org.nba.model.Equipe;
import org.nba.repository.EquipeRepository;
import org.nba.service.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vehicule.vehicule.model.Vehicule;

@RestController
@RequestMapping(path="/api")
public class EquipeController {

	@Autowired
	EquipeService equipeService;
	
	@Autowired
	ObjectMapper objectMapper;
	
	@GetMapping("/equipes")
	public ResponseEntity<String> getAllEquipe() {
		try {
			List<Equipe> liste = equipeService.getAll();
			
			String json = objectMapper.writeValueAsString(liste);
			return new ResponseEntity<>(json,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

	@PostMapping("/equipes")
	public ResponseEntity<String> createEquipe(@RequestBody Equipe equipe){
		try {
			Equipe _equipe = equipeService.insert(_equipe);
			String json = objectMapper.writeValueAsString(equipe);
			return new ResponseEntity<>(json,HttpStatus.CREATED);
		} catch(Exception e) {
			return new ResponseEntity<> (e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
