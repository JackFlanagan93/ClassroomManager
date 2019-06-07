package com.bae.business;

import javax.inject.Inject;

import com.bae.persistance.repository.Classroom_Interface;
import com.bae.persistance.repository.Trainees_Interface;
import com.bae.util.JSONUtil;

public class ClassroomService implements ClassroomService_Interface{

	@Inject
	private JSONUtil util;
	
	@Inject
	Classroom_Interface classroom;
	
	@Override
	public String getAllClassrooms() {
		
		return classroom.getAllClassrooms();
	}

	@Override
	public String findClassroom(String classroomID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createClassroom(String classroomID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteClassroom(int classroomID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateClassroom(int classroomID, String classroom) {
		// TODO Auto-generated method stub
		return null;
	}

}
