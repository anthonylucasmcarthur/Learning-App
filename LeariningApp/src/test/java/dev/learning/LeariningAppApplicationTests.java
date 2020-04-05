package dev.learning;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import dev.learning.entities.Student;
import dev.learning.repositories.StudentRepo;

@SpringBootTest
class LeariningAppApplicationTests {

	@Autowired
	StudentRepo sr;
	
	@Test
	void contextLoads() {
		Student student = sr.findByid(1);
		System.out.println(student);
	}
<<<<<<< Updated upstream
=======
	
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
		a.setId(0);
		a.setDescription("Read War and Peace");
		a.setDuedate("4/3");
		a.setWeight(.1);
		a.setGrade(3.0);
		a.setComment("Faster");
		Student student = sr.findById(2);
		a.setStudent(student);
		Teacher teacher = tr.findById(1);
		a.setTeacher(teacher);
		ar.save(a);
//		System.out.println(a);
//		Assignment assignment = ar.createAssignment(a);
//		System.out.println(assignment);
	}
	
	@Test //failed
	void findAssignmentByStudent() {
		Set<Assignment> as = ar.findAssignmentsForStudent(1);
		System.out.println(as);
	}
	
	@Test // passed
	void updateAssignment() {
		Assignment assignment = ar.findById(1);
		assignment.setGrade(3.0);
		assignment.setComment("Good job");
		ar.save(assignment);
	}
	
	
	@Test // passed
	void deleteAssignment() {
		Assignment assignment = ar.findById(2);
		ar.delete(assignment);
	}
	
	
	
	
	@Autowired
	ServicesImplementation si;
	
	@Test // passed
	void teacherLogin() {
		Teacher t = si.Tlogin("aran", "12345");
		System.out.println(t);
	}
	
	@Test 
	void comment() {
		
	}
	
	@Test // passed
	void login() {
		Student s = si.login("scol", "12345");
		System.out.println(t);
	}
	
	@Test // failed
	void viewStudents() {
		Teacher t = tr.findById(1);
		Set<Student> s = t.getStudents();
		System.out.println(s);
	}
	
>>>>>>> Stashed changes

}
