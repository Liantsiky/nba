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
	@Column(name="id")
	int id;
	
	@ManyToOne
	@JoinColumn(name="match_id")
	Match match;
	
	@ManyToOne
	@JoinColumn(name="joueur_id")
	Joueur joueur;
	
	@ManyToOne
	@JoinColumn(name="action_id")
	Action action;
	
	public int getId() {
		return id;
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
	
	public void setId(int id) {
		this.id = id;
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
