package com.test.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.test.entity.StudentET;
import com.test.repo.StudentRepo;


@Service
public class StudentService {


	@Autowired
	StudentRepo repo;
	

	public StudentET add(StudentET et) {
		return repo.save(et);
	}
	
	public List<StudentET> search(StudentET et){
		
		if(et.getId() != null ) {
			return repo.findByIdLike(et.getId());
		}
		if(et.getName() != null && !et.getName().equals("")) {
			return repo.findByNameLike(et.getName());	
		}
		if(et.getCourse() != null && !et.getCourse().equals("")) {
			return repo.findByCourse(et.getCourse());
		}
		return (List<StudentET>)repo.findAll();
    }
	
	public  List<StudentET> getall(){
		return (List<StudentET>)repo.findAll();
	}
	
	public StudentET getbyid(Integer id) {
		return repo.findById(id).get();
	}
	
	public StudentET update(StudentET et) {
		return repo.save(et);
	}
	
	public void deletbyID(Integer id) {
		 repo.deleteById(id);
	}
	
	
	
	
	
	
	
	
	
	
}
