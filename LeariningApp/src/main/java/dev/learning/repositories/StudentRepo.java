package dev.learning.repositories;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.learning.entities.Assignment;
import dev.learning.entities.Student;
import dev.learning.entities.Teacher;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer>{

	public Student findByid(int id);
	public Student findByUsername(String username);
	public Set<Student> viewStudents(Teacher teacher);
	//public Student save(Assignment a);
	
}
