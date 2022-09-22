package com.test.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.entity.UserET;

@Repository
public interface LoginoutRepo extends JpaRepository<UserET,Integer> {

	
	UserET findByIdAndName(String Name,Integer Id);
	
	
}
