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
	@Column(name="id_joueur")
	Integer idJoueur;
	
	@Column(name="nomprenom")
	String nomPrenom;
	
	public Integer getIdJoueur() {
		return idJoueur;
	}
	
	public String getNomPrenom() {
		return nomPrenom;
	}
	
	public void setIdJoueur(Integer idJoueur) {
		this.idJoueur = idJoueur;
	}
	
	public void setNomPrenom(String nomPrenom) {
		this.nomPrenom = nomPrenom;
	}
	
}
