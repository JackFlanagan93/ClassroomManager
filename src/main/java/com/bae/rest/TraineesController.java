package com.bae.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.bae.business.TraineesService;

@Path("/Trainees")
public class TraineesController {

	@Inject
	TraineesService service;
	
	@Path("/GetAllAccounts")
	@GET
	public String getAllTrainees() {
		return service.getAllTrainees();
		
	}
	
	
	
}
