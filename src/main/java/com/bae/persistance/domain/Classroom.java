package com.bae.persistance.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int classroomId;
	@Column(length=50)
	private String trainer;

	public Classroom() {
		// TODO Auto-generated constructor stub
	}

	public Classroom(int classroomId, String trainer) {
		this.classroomId = classroomId;
		this.trainer = trainer;
	}

	public int getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(int classroomId) {
		this.classroomId = classroomId;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

}