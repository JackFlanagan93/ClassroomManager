package com.bae.business;

public interface TraineesService_Interface {

	String getAllTrainees();
	String findTrainee(String traineeID);
	String createTrainee(String traineeID);
	String deleteTrainee(int traineeID);
	String updateTrainee(int traineeID, String trainee);
	
}
