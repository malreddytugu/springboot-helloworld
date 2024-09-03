package com.javalearning.springboot.helloworld.handler;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.javalearning.springboot.helloworld.EmployeeNotFoundException;
import com.javalearning.springboot.helloworld.model.AppError;

@RestControllerAdvice
public class EmployeeExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<AppError> handleException(EmployeeNotFoundException exception){
		AppError error = new AppError(UUID.randomUUID().toString(), exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
