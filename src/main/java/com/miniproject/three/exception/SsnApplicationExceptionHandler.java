package com.miniproject.three.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class SsnApplicationExceptionHandler	 {
	
	
	@ExceptionHandler(value=SsnApplicationException.class)
	public  ResponseEntity<String> PhoneBookException() {
		String msg="Please enter your details correctly or try again later";
		return new ResponseEntity<>(msg,HttpStatus.BAD_REQUEST);
	}

}
