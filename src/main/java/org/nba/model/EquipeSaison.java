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
	@Column(name="id_equipesaison")
	Integer idEquipeSaison;
	
	@ManyToOne
	@JoinColumn(nullable = false, name="id_joueur")
	Joueur joueur;
	
	@ManyToOne
	@JoinColumn(nullable = false, name="id_equipe")
	Equipe equipe;
//	
	@ManyToOne
	@JoinColumn(nullable= false, name="id_saison")
	Saison saison;
	
	@Column(name="numerojoueur")
	int numeroJoueur;
	
	public Integer getIdEquipeSaison() {
		return idEquipeSaison;
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
	
	public void setIdEquipeSaison(Integer idEquipeSaison) {
		this.idEquipeSaison = idEquipeSaison;
	}
	
	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}
	
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
//	
	public void setSaison(Saison saison) {
		this.saison = saison;
	}
	
	public void setNumeroJoueur(int numeroJoueur) {
		this.numeroJoueur = numeroJoueur;
	}
	
}
