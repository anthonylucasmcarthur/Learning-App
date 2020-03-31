package dev.learning.services;

import java.util.Set;

import dev.learning.entities.Assignment;
import dev.learning.entities.Student;
import dev.learning.entities.Teacher;

public interface AssignmentServices {
	
	public Assignment AssignAssignment(Assignment a);
	public Assignment submitAssignment(Assignment a, int aid, String comment);
	public Set<Assignment> viewAssignments(Student s);
	public Set<Assignment> viewAssignmentsT(Teacher t);
	public Set<Assignment> viewAssignmentByStudent(int sid);
	public Assignment gradeAssignment(Assignment a);
	public boolean deleteAssignment(Assignment a);
	public Assignment commentT(Assignment a, int aid, String comment);
	public Assignment getAssignmentById(int aid);
}
