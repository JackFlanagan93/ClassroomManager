package com.bae.business;

public interface ClassroomService_Interface {

	String getAllClassrooms();
	String findClassroom(String classroomID);
	String createClassroom(String classroomID);
	String deleteClassroom(int classroomID);
	String updateClassroom(int classroomID, String classroom);
	
}
