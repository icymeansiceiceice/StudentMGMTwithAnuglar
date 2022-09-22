package com.test.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.test.entity.StudentET;

@Repository
public interface StudentRepo  extends JpaRepository<StudentET,Integer>{

		
	List<StudentET> findByIdLike(Integer Id);
	
	List<StudentET> findByNameLike(String Name);
	  
	List<StudentET> findByIdAndName(Integer Id,String Name);
	
	@Query(value = "select s.* from student s join coursedetail cd on s.sid = cd.studentid join \r\n"
			+ "course c on c.cid = cd.courseid where c.name like :course ",nativeQuery = true) 
	List<StudentET> findByCourse(String course);
	
	
	
	
	
	
	
}
