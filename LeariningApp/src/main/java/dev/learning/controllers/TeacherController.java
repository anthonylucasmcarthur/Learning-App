package dev.learning.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public Student login(@RequestBody Student student) {
		return si.login(student.getUsername(), student.getPassword());
	}

	@GetMapping(value = "/students", produces = "application/json")
	public Set<Student> getStudents(Teacher teacher) {
		return si.viewStudents(teacher);
	}
	
	@GetMapping(value = "/assignments", produces = "application/json")
	public Set<Assignment> getAssignmentsT(Teacher t) {
		return si.viewAssignmentsT(t);
	}
	
	

	

}
