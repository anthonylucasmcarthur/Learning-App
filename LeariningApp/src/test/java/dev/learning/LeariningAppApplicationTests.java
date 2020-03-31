package dev.learning;

import java.util.Optional;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import dev.learning.entities.Assignment;
import dev.learning.entities.Student;
import dev.learning.entities.Teacher;
import dev.learning.repositories.AssignmentRepo;
import dev.learning.repositories.StudentRepo;
import dev.learning.repositories.TeacherRepo;



@SpringBootTest
class LeariningAppApplicationTests {



	@Autowired
	TeacherRepo tr;
	
	@Test // pass
	void testconnection() {
//		Optional<Teacher> teacher = tr.findById(1);
//		System.out.println(teacher);	
	}

	@Test // pass
	void findTeacherById() {
		Teacher teacher = tr.findById(1);
		System.out.println(teacher);	
	}
	
	@Test // pass
	void findByUsername() {
		Teacher teacher = tr.findByUsername("aran");
		System.out.println(teacher);	
	}
	
	@Autowired
	StudentRepo sr;
	
	@Test
	void testForiegnKey() {
//		Optional<Student> student = sr.findById(2);
//		System.out.println(student);
	}	
	
	@Test // passed
	void findStudentById() {
		Student student = sr.findById(2);
		System.out.println(student);
	}
	
	@Test // passed
	void findStudentByUsername() {
		Student student = sr.findByUsername("scol");
		System.out.println(student);
	}
	
	@Test // failed
	void findStudents() {
		Teacher teacher = tr.findById(1);
//		Set<Student> students = sr.viewStudentsTeacher(1);
//		System.out.println(students);
	}
	
	@Autowired
	AssignmentRepo ar;
	
	@Test // passed
	void testEntity() {
//		Optional<Assignment> assignment = ar.findById(1);
//		System.out.println(assignment);
	}
	
	@Test // passed
	void findAssignmentById() {
		Assignment assignment = ar.findById(1);
		System.out.println(assignment);
	}
	
	@Test // failed
	void createAssignment() {
		Assignment a = new Assignment();
		a.setDescription("Read War and Peace");
		a.setDuedate("4/3");
		a.setWeight(.1);
		Student student = sr.findById(2);
		a.setStudent(student);
		Teacher teacher = tr.findById(1);
		a.setTeacher(teacher);
		ar.save(a);
//		System.out.println(a);
//		Assignment assignment = ar.createAssignment(a);
//		System.out.println(assignment);
	}
	
	
	@Test // passed
	void updateAssignment() {
		Assignment assignment = ar.findById(1);
		assignment.setGrade(3.5);
		assignment.setComment("Good job");
		ar.save(assignment);
	}
	
	
	@Test // passed
	void deleteAssignment() {
		Assignment assignment = ar.findById(2);
		ar.delete(assignment);
	}
	
}
