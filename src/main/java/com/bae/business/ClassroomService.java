package com.bae.business;

import javax.inject.Inject;

import com.bae.persistance.repository.Classroom_Interface;
import com.bae.util.JSONUtil;

public class ClassroomService implements ClassroomService_Interface {

	@Inject
	private JSONUtil util;

	@Inject
	Classroom_Interface Classroom;

	@Override
	public String getAllClassrooms() {

		return Classroom.getAllClassrooms();
	}

	@Override
	public String findClassroom(int classroomID) {
		return Classroom.findClassroom(classroomID);

	}

	@Override
	public String createClassroom(String classroom) {
		return Classroom.createClassroom(classroom);
	}

	@Override
	public String deleteClassroom(int classroomID) {
		return Classroom.deleteClassroom(classroomID);
	}

	@Override
	public String updateClassroom(int classroomID, String classroom) {
		return Classroom.updateClassroom(classroomID, classroom);
	}

}
