package org.nba.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="matchs")
public class Match {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_matchs")
	Integer idMatch;
	
	@ManyToOne
	@JoinColumn(name="id_saison")
	Saison saison;
	
	@ManyToOne
	@JoinColumn(name="id_equipe1")
	Equipe equipe1;
	
	@ManyToOne
	@JoinColumn(name="id_equipe2")
	Equipe equipe2;
	
	@Column(name="datematch")
	LocalDate dateMatch;
	
	public Integer getIdMatch() {
		return idMatch;
	}
	
	public Saison getSaison() {
		return saison;
	}
	
	public Equipe getEquipe1() {
		return equipe1;
	}
	
	public Equipe getEquipe2() {
		return equipe2;
	}
	
	public LocalDate getDateMatch() {
		return dateMatch;
	}
	
	public void setIdMatch(Integer idMatch) {
		this.idMatch = idMatch;
	}
	
	public void setEquipe1(Equipe equipe1) {
		this.equipe1 = equipe1;
	}
	
	public void setEquipe2(Equipe equipe2) {
		this.equipe2 = equipe2;
	}
	
	public void setSaison(Saison saison) {
		this.saison = saison;
	}
	
	public void setDateMatch(LocalDate dateMatch) {
		this.dateMatch = dateMatch;
	}
	
	
}
