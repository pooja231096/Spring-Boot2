package com.verizon.retail.customer.customercrud;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
@GetMapping("/{id}")
public String printData(@PathVariable("id") String id,@RequestParam("name") String name) throws Exception{
	System.out.println(id+" "+name);
	throw new Exception("Caused and Exception");
}

@PostMapping(produces=MediaType.APPLICATION_XML_VALUE)
public Customer saveCustomer(@RequestBody @Valid Customer obj)
{
	return obj;
}
@ExceptionHandler(NullPointerException.class)
public ResponseEntity<String> handleException(NullPointerException e) throws Exception{
	return new ResponseEntity<String>("NullPointerException occured",HttpStatus.BAD_REQUEST);
}
}

