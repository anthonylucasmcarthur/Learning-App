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
import dev.learning.services.ServicesImplementation;



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
	
	@Test // passed
	void findStudents() {
		Teacher teacher = tr.findById(1);
		Set<Student> students = sr.findByTeacher(teacher);
		System.out.println(students);
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
	
	@Test //passed
	void createAssignment() {
		Assignment a = new Assignment();
//		a.setId(0);
		a.setDescription("Write an essay on Plato");
		a.setDuedate("4/17");
		a.setWeight(.3);
//		a.setGrade(0.0);
//		a.setComment("");
		Student student = sr.findById(2);
		a.setStudent(student);
		Teacher teacher = tr.findById(1);
		a.setTeacher(teacher);
		ar.save(a);
		System.out.println(a);
//		Assignment assignment = ar.createAssignment(a);
//		System.out.println(assignment);
	}
	
	@Test // passed
	void findByTeacher() {
		Teacher teacher = tr.findById(1);
		Set<Assignment> as = ar.findByTeacher(teacher);
		System.out.println(as);
	}
	
	@Test // passed
	void findByStudent() {
		Student s = sr.findById(2);
		Set<Assignment> as = ar.findByStudent(s);
		System.out.println(as);
	}
	
	@Test // passed
	void updateAssignment() {
		Assignment assignment = ar.findById(2);
		assignment.setSubmission("");
		assignment.setGrade(0.0);
		assignment.setComment("");
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
		System.out.println(s);
	}
	
	@Test // passed
	void viewStudents() {
		Teacher t = tr.findById(1);
		Set<Student> s = si.viewStudents(t);
		System.out.println(s);
	}
	

	@Test 
	void submitAssignment() {
		
	}
	
	@Test 
	void assignAssignment() {
		Assignment a = new Assignment();
		a.setId(5);
		a.setDescription("Read the Great Gatsby");
		a.setDuedate("4/4");
		a.setWeight(0.2);
		Student student = sr.findById(2);
		a.setStudent(student);
		Teacher teacher = tr.findById(1);
		a.setTeacher(teacher);
		si.AssignAssignment(a);
	}
	
	@Test // passed
	void gradeAssignment() {
		Assignment a = ar.findById(1);
		a.setGrade(3.0);
		a.setComment("Read more");
		si.AssignAssignment(a);
	}
	
	@Test // passed
	void viewAssignments() {
		Student s = sr.findById(2);
		Set<Assignment> a = si.viewAssignments(s);
		System.out.println(a);
	}
	
	@Test // passed
	void deleteAssign() {
		Assignment a = ar.findById(3);
		si.deleteAssignment(a);
	}
	
	@Test // passed
	void viewAssignmentsT() {
		Teacher t = tr.findById(1);
		Set<Assignment> a = si.viewAssignmentsT(t);
		System.out.println(a);
	}
	
	@Test // passed
	void getAssignmentById() {
		Assignment assignment = si.getAssignmentById(1);
		System.out.println(assignment);
	}
	
}
