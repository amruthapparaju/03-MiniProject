package com.miniproject.three.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.miniproject.three.entity.StateEntity;

public interface StateRepositery extends JpaRepository<StateEntity, Serializable> {
	
	@Query(value ="SELECT stateName from  StateEntity ")
	public  List<String> findState();
	 

}
