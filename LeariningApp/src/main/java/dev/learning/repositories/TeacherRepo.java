package dev.learning.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.learning.entities.Teacher;

@Repository
public interface TeacherRepo extends CrudRepository<Teacher, Integer> {
	
	public Teacher findById(int id);
	public Teacher findByUsername(String userneame);
	
	
	
}
