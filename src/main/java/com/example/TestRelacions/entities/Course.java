package com.example.TestRelacions.entities;

import java.util.List;

import javax.persistence.*;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	String title;

	@OneToMany(mappedBy = "course")
	private List<CourseMaterial>  courseMaterial;
	
	public Course(String title, List<CourseMaterial> courseMaterial) {
		super();
		this.title = title;
		this.courseMaterial = courseMaterial;
	}

	public Course() {

	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public List<CourseMaterial> getCourseMaterial() {
		return courseMaterial;
	}
	
	public void setCourseMaterial(List<CourseMaterial> courseMaterial) {
		this.courseMaterial = courseMaterial;
	}
	
}
