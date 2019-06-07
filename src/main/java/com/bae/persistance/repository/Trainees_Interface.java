package com.bae.persistance.repository;

public interface Trainees_Interface {

	String getAllTrainees();
	String findTrainee(int traineeID);
	String createTrainee(String trainee);
	String deleteTrainee(int traineeID);
	String updateTrainee(int traineeID, String trainee);
	
}
