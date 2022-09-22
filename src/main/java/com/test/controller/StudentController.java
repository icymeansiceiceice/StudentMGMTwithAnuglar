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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.StudentET;
import com.test.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService sservice;	
	
	@PostMapping("/sadd")
	@ResponseStatus(value = HttpStatus.CREATED)
	public StudentET add(@RequestBody StudentET et) {
		return sservice.add(et);
	}
	
	@GetMapping("/sshow")
	@ResponseStatus(value = HttpStatus.OK)	
	public List<StudentET> getall(){
		return sservice.getall();
	}
	
	@GetMapping("/ssearch")
	@ResponseStatus(value = HttpStatus.OK)	
	public List<StudentET> search(@RequestBody StudentET et){
		return sservice.search(et);
	}
	
	@GetMapping("/sgetbyId/{id}")
	@ResponseStatus(value = HttpStatus.OK)	
	public StudentET getbyid(@PathVariable("id")Integer id) {
		return sservice.getbyid(id);
	}
	
	@PutMapping("/supdate")
	@ResponseStatus(value = HttpStatus.CREATED)
	public StudentET update(@RequestBody StudentET et) {
		return sservice.update(et);
	}
	
	@DeleteMapping("/sdelete/{id}")
	@ResponseStatus(value = HttpStatus.OK)	
	public void delete(@PathVariable("id")Integer id) {
		sservice.deletbyID(id);
	}
	
}
