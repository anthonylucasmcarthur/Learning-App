package dev.learning.repositories;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.learning.entities.Assignment;
import dev.learning.entities.Student;
import dev.learning.entities.Teacher;

@Repository
public interface AssignmentRepo extends CrudRepository<Assignment, Integer>{
	
	public Assignment findById(int id);
	public Set<Assignment> findByTeacher(Teacher teacher);
	public Set<Assignment> findByStudent(Student student);


}
