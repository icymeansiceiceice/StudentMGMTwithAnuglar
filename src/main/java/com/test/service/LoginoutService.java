package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.UserET;
import com.test.repo.LoginoutRepo;

@Service
public class LoginoutService {
	
	@Autowired
	LoginoutRepo repo;
	
	
	
	public UserET login(UserET et) {
		return repo.findByIdAndName(et.getName(),et.getId());
	}

}
