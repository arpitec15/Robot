package com.app.robot.service.impl;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.robot.shared.*;
import com.app.robot.dto.LocationDTO;
import com.app.robot.dto.ResourcesDTO;
import com.app.robot.dto.SurvivorDTO;
import com.app.robot.entity.LocationEntity;
import com.app.robot.entity.ResourceEntity;
import com.app.robot.entity.SurvivorEntity;
import com.app.robot.repositories.LocationRepository;
import com.app.robot.repositories.ResourceRepository;
import com.app.robot.repositories.SurvivorRepository;
import com.app.robot.service.SurvivorDetailsService;

@Service
public class SurvivorDetailsServiceImpl implements SurvivorDetailsService {

	@Autowired
	SurvivorRepository survivorRepository;

	@Autowired
	LocationRepository locationRepository;

	@Autowired
	ResourceRepository resourceRepository;

	@Autowired
	Utils utils;

	@Override
	@Transactional
	public SurvivorDTO createSurvivor(SurvivorDTO survivor) {

		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		LocationDTO location = survivor.getLocation();
		location.setSurvivorDetails(survivor);
		location.setLocationId(utils.generateLocationId(10));

		LocationEntity locationEntity = modelMapper.map(location, LocationEntity.class);
		locationRepository.save(locationEntity);

		survivor.setLocation(location);

		ResourcesDTO resource = survivor.getResources();
		resource.setSurvivorDetails(survivor);
		resource.setResourceId(utils.generateResourceId(10));

		ResourceEntity resourceEntity = modelMapper.map(resource, ResourceEntity.class);
		resourceRepository.save(resourceEntity);

		survivor.setResources(resource);

		SurvivorEntity survivorEntity = modelMapper.map(survivor, SurvivorEntity.class);
		survivorEntity.setLocation(locationEntity);
		survivorEntity.setResources(resourceEntity);
		
		survivorEntity.setSurvivorId(utils.generateSurvivorId(10));
		survivorEntity.setInfected(survivor.isInfected());
		SurvivorEntity storedDetails = survivorRepository.save(survivorEntity);

		SurvivorDTO returnValue = modelMapper.map(storedDetails, SurvivorDTO.class);

		return returnValue;
	}

	@Override
	public SurvivorDTO updateSurvivor(String id, SurvivorDTO survivor) {

		ModelMapper modelMapper = new ModelMapper();
		SurvivorDTO returnValue = new SurvivorDTO();
		SurvivorEntity survivorEntity = survivorRepository.findBySurvivorId(id);

		LocationDTO location = survivor.getLocation();

		LocationEntity locationEntity = modelMapper.map(location, LocationEntity.class);
		locationEntity.setLocationId(utils.generateLocationId(10));
		locationRepository.save(locationEntity);

		if (survivorEntity != null) {
			survivorEntity.setLocation(locationEntity);
		}
		

		returnValue = modelMapper.map(survivorEntity, SurvivorDTO.class);

		return returnValue;
	}
	
	

}
