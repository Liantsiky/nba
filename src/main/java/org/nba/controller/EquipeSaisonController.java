package org.nba.controller;

import java.util.List;

import org.nba.model.EquipeSaison;
import org.nba.service.EquipeSaisonService;
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
public class EquipeSaisonController {
	@Autowired
	ObjectMapper objectMapper;
	
	@Autowired
	EquipeSaisonService equipeSaisonService;
	

	@GetMapping("/equipe_saisons")
	public ResponseEntity<String> getAllequipeSaisons() {
		try {
			List<EquipeSaison> liste = equipeSaisonService.getAll();
			
			String json = objectMapper.writeValueAsString(liste);
			return new ResponseEntity<>(json,HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

	@PostMapping("/equipe_saison")
	public ResponseEntity<String> createEquipeSaison(@RequestBody EquipeSaison equipeSaison){
		try {
			EquipeSaison _equipeSaison = equipeSaisonService.insert(equipeSaison);
			String json = objectMapper.writeValueAsString(_equipeSaison);
			return new ResponseEntity<>(json,HttpStatus.CREATED);
		} catch(Exception e) {
			return new ResponseEntity<> (e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
