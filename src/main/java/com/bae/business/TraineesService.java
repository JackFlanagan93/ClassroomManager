package com.bae.business;

import javax.inject.Inject;

import com.bae.persistance.repository.Trainees_Interface;
import com.bae.util.JSONUtil;

public class TraineesService implements TraineesService_Interface{

	@Inject
	private JSONUtil util;
	
	@Inject
	Trainees_Interface trainees;
	
	@Override
	public String getAllTrainees() {
		return trainees.getAllTrainees();
	}

	@Override
	public String findTrainee(String traineeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createTrainee(String traineeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteTrainee(int traineeID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateTrainee(int traineeID, String trainee) {
		// TODO Auto-generated method stub
		return null;
	}

}
