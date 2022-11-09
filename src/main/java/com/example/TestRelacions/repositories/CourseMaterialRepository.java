package com.example.TestRelacions.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.TestRelacions.entities.CourseMaterial;

public interface CourseMaterialRepository extends CrudRepository<CourseMaterial, Long>{
	public List<CourseMaterial> findAll();
}
