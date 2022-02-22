package com.app.robot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.robot.entity.ResourceEntity;
import com.app.robot.entity.SurvivorEntity;

@Repository
public interface ResourceRepository extends JpaRepository<ResourceEntity, Long> {

//	ResourceEntity findBySurvivorEntity(SurvivorEntity survivorEntity);

//	ResourceEntity findBySurvivorDetailsR(SurvivorEntity survivorEntity);
}
