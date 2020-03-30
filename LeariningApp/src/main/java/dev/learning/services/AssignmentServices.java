package dev.learning.services;

import java.util.Set;

import dev.learning.entities.Assignment;
import dev.learning.entities.Student;
import dev.learning.entities.Teacher;

public interface AssignmentServices {

	public Set<Assignment> viewAssignmentByStudent(int sid);
	public Student submitAssignment(Assignment a);
	public Assignment AssignAssignment(Assignment a);
	public Teacher gradeAssignment(Assignment a, double grade);
	public Set<Assignment> viewAssignment(Assignment a);
	
	
}
