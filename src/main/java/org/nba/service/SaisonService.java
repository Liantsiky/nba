package org.nba.service;

import java.util.ArrayList;
import java.util.List;

import org.nba.model.Saison;
import org.nba.repository.SaisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaisonService {
	
	@Autowired
	SaisonRepository saisonRepository;
	
	public List<Saison> getAll() throws Exception{
		List<Saison> saisons = new ArrayList<>();
		
		try {
			
			saisonRepository.findAll().forEach(saisons::add);
			return saisons;
			
		} catch (Exception e) {
			throw e;
		}
	}
	
	public Saison insert(Saison entity)throws Exception{
		Saison saison = new Saison();
		
		try {
			
			saison.setId(entity.getId());
			saison.setEdition(entity.getEdition());
			saison.setAnneeDebut(entity.getAnneeDebut());
			saison.setAnneeFin(entity.getAnneeFin());
			
			saisonRepository.save(saison);
			
			return saison;
			
		} catch (Exception e) {
			throw e;
		}
	}

}
