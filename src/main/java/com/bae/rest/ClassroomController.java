package com.bae.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

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
	
}
