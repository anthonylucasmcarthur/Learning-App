package dev.learning.services;


import dev.learning.entities.Teacher;

public interface TeacherServices {

	public Teacher Tlogin(String username, String password);
	public Teacher getTeacherById(int id);
	
	
}
