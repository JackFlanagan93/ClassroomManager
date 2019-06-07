package com.bae.persistance.repository;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bae.util.JSONUtil;

@Default
public class TraineesDatabaseRepository implements Trainees_Interface {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;
	
	
	public String getAllTrainees() {
		// TODO Auto-generated method stub
		return "getAllTrainees";
	}

	public String findTrainee(String traineeID) {
		// TODO Auto-generated method stub
		return null;
	}

	public String createTrainee(String traineeID) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteTrainee(int traineeID) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateTrainee(int traineeID, String trainee) {
		// TODO Auto-generated method stub
		return null;
	}

}
