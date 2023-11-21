package org.nba.controller;

import java.util.List;

import org.nba.model.Saison;
import org.nba.model.Statistique;
import org.nba.service.SaisonService;
import org.nba.service.StatistiqueService;
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
public class StatistiqueController {
	@Autowired
	ObjectMapper objectMapper;
	
	@Autowired
	StatistiqueService statistiqueService;
	

	@GetMapping("/statistiques")
	public ResponseEntity<String> getAllStatistiques() {
		try {
			List<Statistique> liste = statistiqueService.getAll();
			
			String json = objectMapper.writeValueAsString(liste);
			return new ResponseEntity<>(json,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

	@PostMapping("/statistiques")
	public ResponseEntity<String> createStatistique(@RequestBody Statistique statistique){
		try {
			Statistique _statistique = statistiqueService.insert(statistique);
			String json = objectMapper.writeValueAsString(_statistique);
			return new ResponseEntity<>(json,HttpStatus.CREATED);
		} catch(Exception e) {
			return new ResponseEntity<> (e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
