package dev.learning.services;

import java.util.Set;

import dev.learning.entities.Assignment;
import dev.learning.entities.Student;
import dev.learning.entities.Teacher;

public interface AssignmentServices {
	
	public Assignment AssignAssignment(Assignment a);
	public Student submitAssignment(Assignment a);
	public Assignment getAssignmentById(int id);
	public Set<Assignment> viewAssignments(Student s);
	public Set<Assignment> viewAssignments(Teacher t);
	public Set<Assignment> viewAssignmentByStudent(int sid);
	public Assignment gradeAssignment(Assignment a, double grade);
	public boolean deleteAssignment(Assignment a);
	
	
}
