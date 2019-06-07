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
public class ClassroomDatabaseRepository implements Classroom_Interface{
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;
	
	
	public String getAllClassrooms() {
		Query query = manager.createQuery("SELECT c FROM Classroom c", Classroom.class);
		return util.getJSONForObject(query.getResultList());
	}

	public String findClassroom(int classroomID) {
		return util.getJSONForObject(manager.find(Classroom.class, classroomID));
	}

	@Transactional(REQUIRED)
	public String createClassroom(String classroom) {
		Classroom aclassroom = util.getObjectForJSON(classroom, Classroom.class);
		manager.persist(aclassroom);
		//manager.persist(util.getObjectForJSON(classroom, Classroom.class));		
		return "{\"message\"; \"Classroom Has Been Succesfully Added\"}";
	}

	public String deleteClassroom(int classroomID) {
		// TODO Auto-generated method stub
		return null;
	}

	public String updateClassroom(int classroomID, String classroom) {
		// TODO Auto-generated method stub
		return null;
	}

}
