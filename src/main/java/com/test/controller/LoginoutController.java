package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.UserET;
import com.test.service.LoginoutService;

@RestController
public class LoginoutController {

	
	@Autowired
	LoginoutService lservice;
	
	@GetMapping("/login")
	@ResponseStatus(value = HttpStatus.OK)
	public UserET login(UserET et) {
		return lservice.login(et);
	}
	
	
	
	
	
}
