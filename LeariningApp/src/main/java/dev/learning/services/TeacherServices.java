package dev.learning.services;

import java.util.Set;

import dev.learning.entities.Assignment;
import dev.learning.entities.Student;

import dev.learning.entities.Teacher;

public interface TeacherServices {

	public Teacher Tlogin(String username, String password);
	public Teacher commentT(Assignment a, String comment);
	
}
