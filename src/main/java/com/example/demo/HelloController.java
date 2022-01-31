package com.example.demo;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springdoc.api.annotations.ParameterObject;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@PostMapping(value = "/persons")
	public void create(@Parameter(in = ParameterIn.QUERY) Long id, @RequestBody Object o){

	}



}
