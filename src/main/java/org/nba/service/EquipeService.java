package org.nba.service;

import java.util.ArrayList;
import java.util.List;
import org.nba.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.nba.model.Equipe;

@Service
public class EquipeService {
	
	@Autowired
	EquipeRepository equipeRepo;
	
	public List<Equipe> getAll()throws Exception {
		List<Equipe> equipes = new ArrayList<>();
		
		try {
			
			equipeRepo.findAll().forEach(equipes::add);
			
			return equipes;
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Equipe insert(Equipe entity) throws Exception {
		try {
			
			Equipe equipe = new Equipe();
			
//			equipe.setId(entity.getId());
			equipe.setNomEquipe(entity.getNomEquipe());
			
			equipeRepo.save(equipe);
			
			return equipe;
			
		} catch (Exception e) {
			throw e;
		}
	}
	
}
