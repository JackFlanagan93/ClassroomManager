package com.bae.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
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
	
}

