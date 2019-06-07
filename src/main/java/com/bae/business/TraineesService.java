package com.bae.business;

import javax.inject.Inject;

import com.bae.persistance.repository.Trainees_Interface;
import com.bae.util.JSONUtil;

public class TraineesService implements TraineesService_Interface{

	@Inject
	private JSONUtil util;
	
	@Inject
	Trainees_Interface Trainees;
	
	@Override
	public String getAllTrainees() {
		return Trainees.getAllTrainees();
	}

	@Override
	public String findTrainee(int traineeID) {
		return Trainees.findTrainee(traineeID);

	}

	@Override
	public String createTrainee(String trainee) {
		return Trainees.createTrainee(trainee);
	}

	@Override
	public String deleteTrainee(int traineeID) {
		return Trainees.deleteTrainee(traineeID);
	}

	@Override
	public String updateTrainee(int traineeID, String trainee) {
		return Trainees.updateTrainee(traineeID, trainee);
	}

}
