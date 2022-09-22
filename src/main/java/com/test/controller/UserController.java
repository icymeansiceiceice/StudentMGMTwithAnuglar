package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.UserET;
import com.test.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService uservice;
	
	@PostMapping("/uadd")
	@ResponseStatus(value = HttpStatus.CREATED)
	public UserET add (@RequestBody UserET et) {
		return uservice.add(et);
	}
	
	@GetMapping("/ushow")
	@ResponseStatus(value = HttpStatus.OK)
	public List<UserET> getAll(){
		return uservice.getAll();
	}
	
	
	@GetMapping("/usearch")
	@ResponseStatus(value = HttpStatus.OK)
	public List<UserET> search(@RequestBody UserET et){
		return uservice.search(et);
	}
	
	@GetMapping("/ugetbyId/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public UserET getbyID(@PathVariable("id") Integer id) {
		return uservice.getbyId(id);
	}
	
	
	@PutMapping("/uupdate")
	@ResponseStatus(value = HttpStatus.CREATED)
	public UserET update(@RequestBody UserET et) {
		return uservice.add(et);
	}
	
	@DeleteMapping("/udelete/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable("id") Integer id) {
		uservice.deletebyId(id);
	}
	
	
	
				
}
