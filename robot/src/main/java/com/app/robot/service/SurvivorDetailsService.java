package com.app.robot.service;

import org.springframework.stereotype.Service;

import com.app.robot.dto.SurvivorDTO;

@Service
public interface SurvivorDetailsService {
	
	SurvivorDTO createSurvivor(SurvivorDTO survivor);

	SurvivorDTO updateSurvivor(String id, SurvivorDTO survivorDTO);
	
	

}
