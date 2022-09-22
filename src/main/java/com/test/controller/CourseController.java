package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.CourseET;
import com.test.service.CourseService;

@RestController
public class CourseController {
	
	
	@Autowired
	CourseService cservice;
	
	
	@PostMapping("/cadd")
	@ResponseStatus(value = HttpStatus.CREATED)
	public CourseET save (@RequestBody CourseET et ) {
		return cservice.addCourse(et);
	}
	
	
	

}
