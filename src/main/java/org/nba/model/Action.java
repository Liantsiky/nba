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
	@Column(name="id")
	String id;
	
	@Column(name="designation")
	String designation;
	
	@Column(name="point")
	int point;
	
	public String getId() {
		return id;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
}
