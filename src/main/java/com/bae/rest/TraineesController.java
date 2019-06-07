package com.bae.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.bae.business.TraineesService;

@Path("/Trainees")
public class TraineesController {

	@Inject
	TraineesService service;
	
	@Path("/GetAllTrainees")
	@GET
	public String getAllTrainees() {
		return service.getAllTrainees();
		
	}
	
	@Path("/FindTrainee/{traineeID}")
	@GET
	public String findTrainee(@PathParam("traineeID") int traineeID) {
		return service.findTrainee(traineeID);
	}
	
	@Path("/CreateTrainee")
	@POST
	public String createTrainee(String trainee) {
		return service.createTrainee(trainee);
	}
	
	@Path("/DeleteTrainee")
	@DELETE
	public String deleteTrainee(int traineeID) {
		return service.deleteTrainee(traineeID);
	}
	
}
