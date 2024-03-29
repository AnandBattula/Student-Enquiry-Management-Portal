package com.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.StudentEnq;

public interface StudentEnqRepo extends JpaRepository<StudentEnq, Integer>{
	
	public List<StudentEnq> findByCid(Integer cid);

}
