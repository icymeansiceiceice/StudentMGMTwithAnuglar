package com.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.entity.CourseET;


@Repository
public interface CourseRepo extends JpaRepository<CourseET,Integer > {

	
	
	
}
