package org.nba.controller;

import java.util.List;

import org.nba.model.Saison;
import org.nba.service.SaisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DataFormatReaders.Match;

@RestController
@RequestMapping(name="/api")
public class SaisonController {
	@Autowired
	ObjectMapper objectMapper;
	
	@Autowired
	SaisonService saisonService;
	

	@GetMapping("saisons")
	public ResponseEntity<String> getAllMatch() {
		try {
			List<Saison> liste = saisonService.getAll();
			
			String json = objectMapper.writeValueAsString(liste);
			return new ResponseEntity<>(json,HttpStatus.OK);
			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

	@PostMapping("/saisons")
	public ResponseEntity<String> createSaison(@RequestBody Saison saison){
		try {
			Saison _saison = saisonService.insert(saison);
			String json = objectMapper.writeValueAsString(_saison);
			return new ResponseEntity<>(json,HttpStatus.CREATED);
		} catch(Exception e) {
			return new ResponseEntity<> (e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
