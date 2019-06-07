package com.bae.persistance.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.bae.persistance.domain.Trainees;
import com.bae.util.JSONUtil;

@Alternative
public class TraineesMapRepository implements Trainees_Interface {

	Map<Integer, Trainees> traineesMap = new HashMap<Integer, Trainees>();

	@Inject
	JSONUtil j1;

	@Override
	public String getAllTrainees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findTrainee(int traineeID) {
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
