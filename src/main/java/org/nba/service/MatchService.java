package org.nba.service;

import java.util.ArrayList;
import java.util.List;

import org.nba.model.Match;
import org.nba.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MatchService {
	
	@Autowired
	MatchRepository matchRepository;
	
	public List<Match> getAll()throws Exception{
		
		List<Match> matches = new ArrayList<>();
		
		try {
			
			matchRepository.findAll().forEach(matches::add);
			return matches;
			
		} catch (Exception e) {
			throw e;
		}
		
	}
	
	public Match insert(Match entity)throws Exception{
		Match match = new Match();
		try {
			
			match.setId(entity.getId());
			match.setDateMatch(entity.getDateMatch());
			match.setEquipe1(entity.getEquipe1());
			match.setEquipe2(entity.getEquipe2());
			match.setSaison(entity.getSaison());
			
			matchRepository.save(match);
			
			return match;
			
		} catch (Exception e) {
			throw e;
		}
	}

}
