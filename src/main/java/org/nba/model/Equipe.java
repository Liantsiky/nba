package org.nba.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="equipe")
public class Equipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="nomequipe")
	String nomEquipe;
	
	public int getId() {
		return id;
	}
	
	public String getNomEquipe() {
		return nomEquipe;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}
	
}