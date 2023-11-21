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
@Table(name="statistique")
public class Statistique {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_statistique")
	Integer idStatistique;
	
	@ManyToOne
	@JoinColumn(name="id_matchs")
	Match match;
	
	@ManyToOne
	@JoinColumn(name="id_joueur")
	Joueur joueur;
	
	@ManyToOne
	@JoinColumn(name="id_actions")
	Action action;
	
	public Integer getIdStatistique() {
		return idStatistique;
	}
	
	public Action getAction() {
		return action;
	}
	public Joueur getJoueur() {
		return joueur;
	}
	
	public Match getMatch() {
		return match;
	}
	
	public void setIdStatistique(Integer idStatistique) {
		this.idStatistique = idStatistique;
	}
	
	public void setAction(Action action) {
		this.action = action;
	}
	
	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}
	
	public void setMatch(Match match) {
		this.match = match;
	}
	
}
