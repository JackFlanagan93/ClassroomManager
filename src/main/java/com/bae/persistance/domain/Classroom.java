package com.bae.persistance.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int classroomID;
	@Column(length=50)
	private String trainer;

	public Classroom() {
		// TODO Auto-generated constructor stub
	}

	public Classroom(int classroomId, String trainer) {
		this.classroomID = classroomId;
		this.trainer = trainer;
	}

	public int getClassroomId() {
		return classroomID;
	}

	public void setClassroomId(int classroomId) {
		this.classroomID = classroomId;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

}
