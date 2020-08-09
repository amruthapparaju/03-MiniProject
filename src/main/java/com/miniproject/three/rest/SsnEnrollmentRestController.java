package com.miniproject.three.rest;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.three.dto.SsnDTO;
import com.miniproject.three.model.SsnModel;
import com.miniproject.three.service.SSNService;

@RestController
public class SsnEnrollmentRestController {

	@Autowired
	private SSNService service;

	@PostMapping(value = "/saveSSNDetails", consumes = { "application/json" })
	public ResponseEntity<String> Enroll(@RequestBody SsnModel ssndetails) {
		SsnDTO dto=new SsnDTO();
		BeanUtils.copyProperties(ssndetails, dto);
		String sSnSaveDetails = service.SSnSaveDetails(dto);
		String respmsg = "Your SSN is  Succusfully Enrolled your ssn number is :::"+sSnSaveDetails;
		return new ResponseEntity<>(respmsg, HttpStatus.CREATED);
	}

}
