package com.bae.persistance.repository;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.bae.persistance.domain.Trainees;
import com.bae.util.JSONUtil;

@Default
public class TraineesDatabaseRepository implements Trainees_Interface {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;
	
	
	public String getAllTrainees() {
		Query query = manager.createQuery("SELECT a FROM Trainees a", Trainees.class);
		return util.getJSONForObject(query.getResultList());
	}

	public String findTrainee(int traineeID) {
		return util.getJSONForObject(manager.find(Trainees.class, traineeID));
		
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
