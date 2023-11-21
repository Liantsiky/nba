package org.nba.service;

import java.util.ArrayList;
import java.util.List;

import org.nba.model.Joueur;
import org.nba.repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoueurService {
	
	@Autowired
	JoueurRepository joueurRepo;
	
	public List<Joueur> getAll()throws Exception {
		List<Joueur> joueurs = new ArrayList<>();
		
		try {
			
			joueurRepo.findAll().forEach(joueurs::add);
			return joueurs;
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Joueur insert(Joueur entity){
		try {
			
			Joueur joueur = new Joueur();
			
//			joueur.setId(entity.getId());
			joueur.setNomPrenom(entity.getNomPrenom());
			
			joueurRepo.save(joueur);
			
			return joueur;
			
		} catch (Exception e) {
			throw e;
		}
	}

}
