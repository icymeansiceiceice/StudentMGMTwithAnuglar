package com.test.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.entity.UserET;


@Repository
public interface UserRepo extends JpaRepository<UserET,Integer> {

	
		List<UserET> findByidLike(Integer id);
		
		List<UserET> findBynameLike(String name);
		
		List<UserET> findByIdAndName(String Name,Integer Id);
		
}
