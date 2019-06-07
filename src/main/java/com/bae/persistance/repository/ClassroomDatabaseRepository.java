package com.bae.persistance.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.bae.persistance.domain.Classroom;
import com.bae.util.JSONUtil;

@Default
public class ClassroomDatabaseRepository implements Classroom_Interface {

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
		return "{\"message\"; \"Classroom Has Been Succesfully Added\"}";
	}

	@Transactional(REQUIRED)
	public String deleteClassroom(int classroomID) {
		Classroom classroomToDelete = util.getObjectForJSON(findClassroom(classroomID), Classroom.class);

		if (manager.contains(manager.find(Classroom.class, classroomID))) {

			manager.remove(manager.find(Classroom.class, classroomID));
		}
		return "{\"message\": \"Classroom sucessfully deleted\"}";
	}

	
	@Transactional(REQUIRED)
	public String updateClassroom(int classroomID, String classroom) {

		Classroom transClassroom = util.getObjectForJSON(classroom, Classroom.class);
		Classroom oldClassroom = manager.find(Classroom.class, classroomID);

		if (oldClassroom != null) {
			oldClassroom.setTrainer(transClassroom.getTrainer());
			manager.persist(oldClassroom);

		}

		return "{\"message\": \"Classroom Updated Succesfully\"}";
	}
}
