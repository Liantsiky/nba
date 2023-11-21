package org.nba.service;

import java.util.ArrayList;
import java.util.List;

import org.nba.model.Statistique;
import org.nba.repository.StatistiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatistiqueService {
	
	@Autowired
	StatistiqueRepository statistiqueRepository;
	
	public List<Statistique> getAll(){
		List<Statistique> statistiques = new ArrayList<>();
		
		try {
			
			statistiqueRepository.findAll().forEach(statistiques::add);
			return statistiques;
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Statistique insert(Statistique entity)throws Exception{
		Statistique statistique = new Statistique();
		try {
			
			statistique.setId(entity.getId());
			statistique.setAction(entity.getAction());
			statistique.setJoueur(entity.getJoueur());
			statistique.setMatch(entity.getMatch());
			
			statistiqueRepository.save(statistique);
			
			return statistique;
			
		} catch (Exception e) {
			throw e;
		}
	}

}
