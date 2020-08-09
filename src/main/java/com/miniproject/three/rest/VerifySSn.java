package com.miniproject.three.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.miniproject.three.dto.SsnDTO;
import com.miniproject.three.service.SSNService;

@RestController
public class VerifySSn {

	@Autowired
	private SSNService sevice;

	@GetMapping(value = "/GetSSnDetails/{ssno}/{state}")
	ResponseEntity<String> VerifySsn(@PathVariable("ssno") String ssno,@PathVariable("state") String state) {
		String validateSsno = sevice.ValidateSsno1(ssno, state);
		System.out.println("----------------------"+validateSsno);
		return new ResponseEntity<>(validateSsno, HttpStatus.OK);
	}
}
