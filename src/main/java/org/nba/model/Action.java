package org.nba.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="actions")
public class Action {

	@Id
	@Column(name="id_actions")
	String idAction;
	
	@Column(name="designation")
	String designation;
	
	@Column(name="point")
	int point;
	
	public String getIdAction() {
		return idAction;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setIdAction(String idAction) {
		this.idAction = idAction;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
}
