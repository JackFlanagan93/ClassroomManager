package com.bae.persistance.repository;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.bae.util.JSONUtil;

@Default
public class ClassroomDatabaseRepository implements Classroom_Interface{
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;
	
	
	public String getAllClassrooms() {
		// TODO Auto-generated method stub
		return "getAllClassrooms";
	}

	public String findClassroom(String classroomID) {
		// TODO Auto-generated method stub
		return null;
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
