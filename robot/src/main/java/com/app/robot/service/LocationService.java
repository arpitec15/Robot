package com.app.robot.service;

import org.springframework.stereotype.Service;

import com.app.robot.dto.LocationDTO;

@Service
public interface LocationService {
	
	LocationDTO getLocation(String survivorId);
	
	
	
	
	

}
