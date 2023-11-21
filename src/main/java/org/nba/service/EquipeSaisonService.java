package org.nba.service;

import java.util.ArrayList;
import java.util.List;

import org.nba.model.EquipeSaison;
import org.nba.repository.EquipeSaisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipeSaisonService {
	
	@Autowired
	EquipeSaisonRepository equipeSaisonRepo;
	
	public List<EquipeSaison> getAll() throws Exception{
		List<EquipeSaison> equipes = new ArrayList<>();
		
		try {
			
			equipeSaisonRepo.findAll().forEach(equipes::add);
			return equipes;
			
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public EquipeSaison insert(EquipeSaison entity) throws Exception{
		try {
			
			EquipeSaison equipeSaison = new EquipeSaison();
			
			equipeSaison.setId(entity.getId());
			equipeSaison.setJoueur(entity.getJoueur());
			equipeSaison.setEquipe(entity.getEquipe());
			equipeSaison.setNumeroJoueur(entity.getNumeroJoueur());
			equipeSaison.setSaison(entity.getSaison());
			
			equipeSaisonRepo.save(equipeSaison);
			
			return equipeSaison;
			
		} catch (Exception e) {
			throw e;
		}
	}

}
