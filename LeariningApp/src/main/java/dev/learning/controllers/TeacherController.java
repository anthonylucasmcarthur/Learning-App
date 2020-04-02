package dev.learning.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.learning.entities.Assignment;
import dev.learning.entities.Student;
import dev.learning.entities.Teacher;
import dev.learning.services.ServicesImplementation;

@Component
@RestController
@RequestMapping("/teacher")
@CrossOrigin
public class TeacherController {

	@Autowired
	private ServicesImplementation si;

	@PostMapping(value = "/login")
	public Teacher login(@RequestBody Teacher teacher) {
		System.out.println(teacher);
		return si.Tlogin(teacher.getUsername(), teacher.getPassword());
	}

	@GetMapping(value = "/students/{id}", produces = "application/json")
	public Set<Student> getStudents(@PathVariable("id")int id) {
		Teacher teacher = si.getTeacherById(id);
		return si.viewStudents(teacher);
	}
	
	@GetMapping(value = "/assignments/{id}", produces = "application/json")
	public Set<Assignment> getAssignmentsT(@PathVariable("id")int id) {
		Teacher t = si.getTeacherById(id);
		return si.viewAssignmentsT(t);
	}
	
	

	

}
