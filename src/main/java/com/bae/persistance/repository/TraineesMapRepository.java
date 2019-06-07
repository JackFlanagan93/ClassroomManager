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
		
		return j1.getJSONForObject(traineesMap.values());
	}

	@Override
	public String findTrainee(int traineeID) {
		return j1.getJSONForObject(traineesMap.get(traineeID));
	}

	@Override
	public String createTrainee(String trainee) {
		Trainees a1 = j1.getObjectForJSON(trainee, Trainees.class);
		traineesMap.put(a1.getTraineeId(), a1);
		return ("Account Created : " + j1.getJSONForObject(traineesMap.get(a1.getTraineeId())));
				
	}

	@Override
	public String deleteTrainee(int traineeID) {
		traineesMap.remove(traineeID);	
		return "Trainee Removed";
	}

	@Override
	public String updateTrainee(int traineeID, String trainee) {
		Trainees t_update = j1.getObjectForJSON(trainee, Trainees.class);

		if (traineesMap.containsKey(traineeID)) {
			traineesMap.replace(traineeID, t_update);
			return "Trainee Updated : " + j1.getJSONForObject(traineesMap.values());
		} 
	return "This has not been updated";
	}

}
