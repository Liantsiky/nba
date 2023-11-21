package org.nba.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="joueur")
public class Joueur {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="nomprenom")
	String nomPrenom;
	
	public int getId() {
		return id;
	}
	
	public String getNomPrenom() {
		return nomPrenom;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNomPrenom(String nomPrenom) {
		this.nomPrenom = nomPrenom;
	}
	
}
