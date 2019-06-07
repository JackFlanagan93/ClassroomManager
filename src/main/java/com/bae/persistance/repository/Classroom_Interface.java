package com.bae.persistance.repository;

public interface Classroom_Interface {

	String getAllClassrooms();
	String findClassroom(int classroomID);
	String createClassroom(String classroom);
	String deleteClassroom(int classroomID);
	String updateClassroom(int classroomID, String classroom);

}
