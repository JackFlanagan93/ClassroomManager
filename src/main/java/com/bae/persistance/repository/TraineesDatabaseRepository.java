package com.bae.persistance.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.bae.persistance.domain.Classroom;
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

	@Transactional(REQUIRED)
	public String createTrainee(String trainee) {
		Trainees aTrainee = util.getObjectForJSON(trainee, Trainees.class);
		manager.persist(aTrainee);
		//manager.persist(util.getObjectForJSON(trainee, Trainees.class));
		
		return "{\"message\"; \"Trainee Has Been Succesfully Added\"}";
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
