package org.nba.controller;

import java.util.List;

import org.nba.model.EquipeSaison;
import org.nba.model.Match;
import org.nba.service.EquipeSaisonService;
import org.nba.service.MatchService;
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
public class MatchController {
	@Autowired
	ObjectMapper objectMapper;
	
	@Autowired
	MatchService matchService;
	

	@GetMapping("/matchs")
	public ResponseEntity<String> getAllMatch() {
		try {
			List<Match> liste = matchService.getAll();
			
			String json = objectMapper.writeValueAsString(liste);
			return new ResponseEntity<>(json,HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

	@PostMapping("/matchs")
	public ResponseEntity<String> createMatch(@RequestBody Match match){
		try {
			Match _match = matchService.insert(match);
			String json = objectMapper.writeValueAsString(_match);
			return new ResponseEntity<>(json,HttpStatus.CREATED);
		} catch(Exception e) {
			return new ResponseEntity<> (e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
