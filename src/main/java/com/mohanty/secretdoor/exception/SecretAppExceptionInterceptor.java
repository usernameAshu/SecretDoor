package com.mohanty.secretdoor.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class SecretAppExceptionInterceptor extends ResponseEntityExceptionHandler {
 
	@ExceptionHandler(SecretAppException.class)
	public ResponseEntity<Object> handleAllException( SecretAppException exception ) {
		SecretExceptionResponse exceptionResponse = new SecretExceptionResponse(exception.getMessage(),
														exception.getHint(), exception.getSupport());
		
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
