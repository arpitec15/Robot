package com.app.robot.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.robot.dto.SurvivorDTO;
import com.app.robot.service.SurvivorDetailsService;
import com.app.robot.ui.model.request.SurvivorRequestModel;
import com.app.robot.ui.model.response.SurvivorResponseModel;

@RestController
@RequestMapping("survivors")
public class SurvivorController {

	@Autowired
	SurvivorDetailsService survivorService;

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public SurvivorResponseModel createSurvivor(@RequestBody SurvivorRequestModel survivorDetails) {

		SurvivorResponseModel returnValue = new SurvivorResponseModel();

		ModelMapper modelMapper = new ModelMapper();

		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		SurvivorDTO survivorDTO = modelMapper.map(survivorDetails, SurvivorDTO.class);

		SurvivorDTO createdSurvivor = survivorService.createSurvivor(survivorDTO);

		returnValue = modelMapper.map(createdSurvivor, SurvivorResponseModel.class);
		return returnValue;

	}

	@PutMapping(path = "/{id}", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public SurvivorResponseModel updateUser(@PathVariable String id,
			@RequestBody SurvivorRequestModel survivorDetails) {

		SurvivorResponseModel returnValue = new SurvivorResponseModel();

		SurvivorDTO survivorDTO = new SurvivorDTO();
		ModelMapper modelMapper = new ModelMapper();
		survivorDTO = modelMapper.map(survivorDetails, SurvivorDTO.class);

		SurvivorDTO updatedSurvivor = survivorService.updateSurvivor(id, survivorDTO);

		returnValue = modelMapper.map(updatedSurvivor, SurvivorResponseModel.class);
		return returnValue;
	}

}
