package com.verizon.retail.customer.customercrud;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandler {
@ExceptionHandler(Exception.class)
public ResponseEntity<String> handlerException(Exception e){
	return new ResponseEntity<>("Global Exception Handling",HttpStatus.BAD_REQUEST);
}
}
