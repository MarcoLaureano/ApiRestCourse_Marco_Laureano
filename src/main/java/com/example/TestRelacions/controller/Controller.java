package com.example.TestRelacions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.TestRelacions.entities.Course;
import com.example.TestRelacions.entities.CourseMaterial;
import com.example.TestRelacions.repositories.CourseMaterialRepository;
import com.example.TestRelacions.repositories.CourseRepository;

@RestController
@RequestMapping("/Course")
public class Controller {
	@Autowired
	CourseRepository courseRepository;
	@Autowired
	CourseMaterialRepository cmRep;
	
	@GetMapping("cursos/{id}")
	public ResponseEntity<?> getCurs(@PathVariable long id) {
		Course curs = courseRepository.findById(id).orElse(null);
		if(curs == null) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(curs);
		}
	}
	
	@GetMapping("cursos")
	public ResponseEntity<?> getCursos(){
		List<Course> cursosLista = courseRepository.findAll();
		
		if(cursosLista.isEmpty()){
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(cursosLista);
		}
	}
	
	@GetMapping("cursosmaterial/{id}")
	public ResponseEntity<?> getCursmaterial(@PathVariable long id) {
		CourseMaterial cursmatId = cmRep.findById(id).orElse(null);
		if(cursmatId == null) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(cursmatId);
		}
	}
	
	@GetMapping("cursosmaterial")
	public ResponseEntity<?> getCursosmaterial(){
		List<CourseMaterial> cursosmat = cmRep.findAll();
		
		if(cursosmat.isEmpty()){
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(cursosmat);
		}
	}
}
