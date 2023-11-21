package org.nba.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="equipesaison")
public class EquipeSaison {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@ManyToOne
	@JoinColumn(name="joueur_id")
	Joueur joueur;
	
	@ManyToOne
	@JoinColumn(name="equipe_id")
	Equipe equipe;
	
	@ManyToOne
	@JoinColumn(name="saison_id")
	Saison saison;
	
	@Column(name="numerojoueur")
	int numeroJoueur;
	
	public int getId() {
		return id;
	}
	
	public Joueur getJoueur() {
		return joueur;
	}
	
	public Equipe getEquipe() {
		return equipe;
	}
	
	public Saison getSaison() {
		return saison;
	}
	
	public int getNumeroJoueur() {
		return numeroJoueur;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}
	
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
	public void setSaison(Saison saison) {
		this.saison = saison;
	}
	
	public void setNumeroJoueur(int numeroJoueur) {
		this.numeroJoueur = numeroJoueur;
	}
	
}
