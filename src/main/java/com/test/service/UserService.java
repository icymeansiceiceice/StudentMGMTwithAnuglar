package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.UserET;
import com.test.repo.UserRepo;

@Service
public class UserService {

		@Autowired
		UserRepo repo;
		
		public UserET add(UserET et) {
			return repo.save(et);
		}
		
		public List<UserET> getAll(){
			return (List<UserET>)repo.findAll();
		}
		
		public List<UserET> search(UserET et){
			if(et.getId() !=null) {
				return repo.findByidLike(et.getId());
			}
			if(!et.getName().equals("") && et.getName() != null) {
				return repo.findBynameLike(et.getName());
			}
			return repo.findByIdAndName(et.getName(),et.getId());
		}
		
		
		public UserET getbyId(Integer id) {
			return repo.getById(id);
		}
		
		public UserET update(UserET et) {
			return repo.save(et);
		}
		
		public void deletebyId(Integer id) {
			repo.deleteById(id);
		}
		
		
		
		
		
		
		
	
}
