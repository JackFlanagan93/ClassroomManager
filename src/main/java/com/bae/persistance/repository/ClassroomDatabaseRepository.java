package com.bae.persistance.repository;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	public String createClassroom(String classroomID) {
		// TODO Auto-generated method stub
		return null;
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
