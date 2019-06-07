package com.bae.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.bae.business.ClassroomService;

@Path("/Classroom")
public class ClassroomController {

	@Inject
	ClassroomService service;
	
	@Path("/GetAllClassrooms")
	@GET
	public String getAllClassrooms() {
		return service.getAllClassrooms();
		
	}
	
	@Path("/FindClassroom/{classroomID}")
	@GET
	public String findClassroom(@PathParam("classroomID") int classroomID) {
		return service.findClassroom(classroomID);
	}
	
	@Path("/CreateClassroom")
	@POST
	public String createClassroom(String classroom) {
		return service.createClassroom(classroom);
	}
	
	@Path("/DeleteClassroom")
	@DELETE
	public String deleteClassroom(int classroomID) {
		return service.deleteClassroom(classroomID);
	}
	
}

