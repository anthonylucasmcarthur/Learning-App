package dev.learning.services;

import java.util.Set;

import dev.learning.entities.Student;
import dev.learning.entities.Teacher;

public interface StudentServices {

	
	public Student login(String username, String password);
	public Set<Student> viewStudents(Teacher teacher);
	public Student getStudentById(int id);
	
	
}
