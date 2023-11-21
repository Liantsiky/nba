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
	@Column(name="id")
	int id;
	
	@Column(name="edition")
	int edition;
	
	@Column(name="anneedebut")
	LocalDate anneeDebut;
	
	@Column(name="anneeFin")
	LocalDate anneeFin;
	
	public int getId() {
		return id;
	}
	
	public int getEdition() {
		return edition;
	}
	
	public LocalDate getAnneeDebut() {
		return anneeDebut;
	}
	
	public LocalDate getAnneeFin() {
		return anneeFin;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setEdition(int edition) {
		this.edition = edition;
	}
	
	public void setAnneeDebut(LocalDate anneeDebut) {
		this.anneeDebut = anneeDebut;
	}
	
	public void setAnneeFin(LocalDate anneeFin) {
		this.anneeFin = anneeFin;
	}
	
}
