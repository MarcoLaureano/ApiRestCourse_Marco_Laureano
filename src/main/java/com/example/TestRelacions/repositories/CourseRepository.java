package com.example.TestRelacions.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.TestRelacions.entities.Course;

public interface CourseRepository extends CrudRepository<Course, Long>{
	public List<Course> findAll();
}
