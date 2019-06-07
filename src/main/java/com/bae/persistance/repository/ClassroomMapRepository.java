package com.bae.persistance.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.bae.persistance.domain.Classroom;
import com.bae.util.JSONUtil;

@Alternative
public class ClassroomMapRepository implements Classroom_Interface {

	Map<Integer, Classroom> classroomMap = new HashMap<Integer, Classroom>();

	@Inject
	JSONUtil j1;

	@Override
	public String getAllClassrooms() {
		return j1.getJSONForObject(classroomMap.values());
	}

	@Override
	public String findClassroom(int classroomID) {
		return j1.getJSONForObject(classroomMap.get(classroomID));
	}

	@Override
	public String createClassroom(String classroom) {
		Classroom a1 = j1.getObjectForJSON(classroom, Classroom.class);
		classroomMap.put(a1.getClassroomId(), a1);
		return "Account Created";
	}

	@Override
	public String deleteClassroom(int classroomID) {
		classroomMap.remove(classroomID);
		return "Classroom Removed";
	}

	@Override
	public String updateClassroom(int classroomID, String classroom) {
		Classroom c_update = j1.getObjectForJSON(classroom, Classroom.class);

		if (classroomMap.containsKey(classroomID)) {
			classroomMap.replace(classroomID, c_update);
			return "Trainee Updated : " + j1.getJSONForObject(classroomMap.values());
		}
		return "This has not been updated";
	}

}
