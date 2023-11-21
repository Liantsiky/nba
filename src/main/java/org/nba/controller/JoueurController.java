package org.nba.controller;

import java.util.List;

import org.nba.model.Joueur;
import org.nba.service.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping(path="/api")
public class JoueurController {
	@Autowired
	ObjectMapper objectMapper;
	
	@Autowired
	JoueurService joueurService;
	

	@GetMapping("/joueurs")
	public ResponseEntity<String> getAllJoueur() {
		try {
			List<Joueur> liste = joueurService.getAll();
			
			String json = objectMapper.writeValueAsString(liste);
			return new ResponseEntity<>(json,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

	@PostMapping("/joueurs")
	public ResponseEntity<String> createJoueur(@RequestBody Joueur joueur){
		try {
			Joueur _joueur = joueurService.insert(joueur);
			String json = objectMapper.writeValueAsString(_joueur);
			return new ResponseEntity<>(json,HttpStatus.CREATED);
		} catch(Exception e) {
			return new ResponseEntity<> (e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
