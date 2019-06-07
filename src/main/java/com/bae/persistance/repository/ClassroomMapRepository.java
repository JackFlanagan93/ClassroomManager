package com.bae.persistance.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.bae.persistance.domain.Classroom;
import com.bae.util.JSONUtil;

@Alternative
public class ClassroomMapRepository implements Classroom_Interface{

	Map<Integer, Classroom> classroomMap = new HashMap<Integer, Classroom>();
	
	@Inject
	JSONUtil j1;
	
	@Override
	public String getAllClassrooms() {
		// TODO Auto-generated method stub
		return "getAllClassrooms";
	}

	@Override
	public String findClassroom(int classroomID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createClassroom(String classroom) {
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
