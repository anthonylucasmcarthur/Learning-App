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
import dev.learning.entities.Student;
import dev.learning.services.ServicesImplementation;

@Component
@RestController
@RequestMapping("/assignment")
@CrossOrigin
public class AssignmentController {

	@Autowired
	private ServicesImplementation si;

	@PostMapping(value = "/create")
	public Assignment addAssignment(@RequestBody(required = true) String description, String duedate, double weight) {
		Assignment a = new Assignment();
		a.setDescription(description);
		a.setDuedate(duedate);
		a.setWeight(weight);
		return si.AssignAssignment(a);
	}

	@PutMapping(value = "/grade/{id}", produces = "application/json")
	public Assignment gradeAssignment(@RequestBody(required = true) int id, double grade, String comment) {
		Assignment assignment = si.getAssignmentById(id);
		assignment.setGrade(grade);
		assignment.setComment(comment);
		return si.gradeAssignment(assignment);
	}

	@PutMapping(value = "/comment/{id}", produces = "application/json")
	public Assignment CommentT(@RequestBody(required = true) int id, String comment) {
		Assignment assignment = si.getAssignmentById(id);
		String c = assignment.getComment();
		assignment.setComment(c);
		return si.commentT(assignment, id, c);
	}

	@PutMapping(value = "/submit/{id}", produces = "application/json")
	public Student submitAssignment(@RequestBody(required = true) Assignment a, int aid, String comment) {
		Assignment assignment = si.getAssignmentById(aid);
		assignment.getComment();
		return si.submitAssignment(assignment, aid, comment);
	}

	@DeleteMapping(value = "delete/{id}", produces = "application/json")
	public boolean delete(@PathVariable("id") int id) {
		Assignment assignment = si.getAssignmentById(id);
		return si.deleteAssignment(assignment);
	}

}
