package org.nba.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="saison")
public class Saison {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_saison")
	Integer idSaison;
	
	@Column(name="edition")
	int edition;
	
	@Column(name="anneedebut")
	int anneeDebut;
	
	@Column(name="anneeFin")
	int anneeFin;
	
	public int getIdSaison() {
		return idSaison;
	}
	
	public int getEdition() {
		return edition;
	}
	
	public int getAnneeDebut() {
		return anneeDebut;
	}
	
	public int getAnneeFin() {
		return anneeFin;
	}
	
	public void setIdSaison(Integer id) {
		this.idSaison = id;
	}
	
	public void setEdition(int edition) {
		this.edition = edition;
	}
	
	public void setAnneeDebut(int anneeDebut) throws Exception{
		if(anneeDebut < 0) throw new Exception("Annee debut de saison invalide");
		this.anneeDebut = anneeDebut;
	}
	
	public void setAnneeFin(int anneeFin) throws Exception{
		if(anneeFin < 0) throw new Exception("Annee fin de saison invalide");
		else if(anneeFin - this.getAnneeDebut() > 1 || anneeFin < this.getAnneeDebut()) {
			throw new Exception("L'espace etre l'annee de fin de saison et debut ne doit etre que de 1 annee");
		}
		this.anneeFin = anneeFin;
	}
	
}
