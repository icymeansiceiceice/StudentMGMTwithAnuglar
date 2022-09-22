package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.CourseET;
import com.test.repo.CourseRepo;

@Service
public class CourseService {
	
	@Autowired
	CourseRepo repo;
	
	public CourseET addCourse(CourseET course) {
		return repo.save(course);
	}
	
	
	

}
