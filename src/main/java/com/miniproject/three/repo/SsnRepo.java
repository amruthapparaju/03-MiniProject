package com.miniproject.three.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniproject.three.entity.SsnEntity;

public interface SsnRepo extends JpaRepository<SsnEntity, Serializable> {
	
	
	public SsnEntity  findBySsnNoAndStateName(String ssnNo,String stateName);
	

}
