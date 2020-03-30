package dev.learning.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.learning.entities.Assignment;
import dev.learning.services.ServicesImplementation;

@Component
@RestController
@RequestMapping("/assignment")
@CrossOrigin
public class AssignmentController {

	@Autowired
	private ServicesImplementation si;
	
	@PostMapping(value = "/create")
	public Assignment addAssignment(@RequestBody(required = true) Assignment a) {
		String description = a.getDescription();
		return si.AssignAssignment(a);
	}

	@PutMapping(value = "/grade/{id}", produces = "application/json")
	public Assignment gradeAssignment(@RequestBody(required = true) int id, double grade, String comment) {
		Assignment assignment = si.getAssignmentById(id);
		return si.gradeAssignment(assignment, grade);
	}

	@DeleteMapping(value = "/delete/{id}", produces = "application/json")
	public boolean deleteEmployee(@PathVariable("id") int id) {
		Assignment assignment = si.getAssignmentById(id);
		return si.deleteAssignment(assignment);
	}
}
