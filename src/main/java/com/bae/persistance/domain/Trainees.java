package com.bae.persistance.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainees {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int traineeID;
	@Column(length=50)
	private String traineeName;

	public Trainees() {
		// TODO Auto-generated constructor stub
	}

	public Trainees(int traineeId, String traineeName) {
		this.traineeID = traineeId;
		this.traineeName = traineeName;
	}

	public int getTraineeId() {
		return traineeID;
	}

	public void setTraineeId(int traineeId) {
		this.traineeID = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

}
