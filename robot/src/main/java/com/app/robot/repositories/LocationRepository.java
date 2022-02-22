package com.app.robot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.robot.entity.LocationEntity;
import com.app.robot.entity.SurvivorEntity;

@Repository
public interface LocationRepository extends JpaRepository<LocationEntity, Long> {

//	LocationEntity findBySurvivorDetails(SurvivorEntity survivorDetails);
	

}
