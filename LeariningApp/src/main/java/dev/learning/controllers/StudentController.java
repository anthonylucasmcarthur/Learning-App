package dev.learning.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
	
	@Autowired
	private ServicesImplementation si;
	
	@PostMapping(value = "/login")
	public Teacher loginT(@RequestBody Student student) {
		return si.Tlogin(student.getUsername(), student.getPassword());
	}

	@GetMapping(value = "/assignments", produces = "application/json")
	public Set<Assignment> getAssignments(Student student) {
		return si.viewAssignments(student);
	}

}
