package dev.learning.repositories;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.learning.entities.Student;
import dev.learning.entities.Teacher;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer>{

	public Student findById(int id);
	public Student findByUsername(String username);
	public Set<Student> findByTeacher(Teacher teacher);
	
}
