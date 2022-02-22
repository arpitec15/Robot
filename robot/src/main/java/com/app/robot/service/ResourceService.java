package com.app.robot.service;

import org.springframework.stereotype.Service;

import com.app.robot.dto.ResourcesDTO;

@Service
public interface ResourceService {

	ResourcesDTO getResources(String survivorId);

}
