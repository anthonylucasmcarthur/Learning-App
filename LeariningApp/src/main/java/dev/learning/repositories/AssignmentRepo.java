package dev.learning.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssignmentRepo extends CrudRepository<Assignment, Integer>{
	
	public Assignment findById(int id);
	public Assignment createAssignment(String description, String duedate, double weight);
	public Set<Assignment> viewAssignments(Teacher teacher);
	public Set<Assignment> viewAssignments(Student student);
	public Assignment gradeAssignment(double grade, String comment);
	public boolean deleteAssignment(Assignment assignment);

}
