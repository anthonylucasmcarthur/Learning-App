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
		Teacher t = si.Tlogin("scol", "12345");
		System.out.println(t);
	}
	
	@Test // failed
	void viewStudents() {
		Teacher t = tr.findById(1);
		Set<Student> s = t.getStudents();
		System.out.println(s);
	}
	

	@Test // failed
	void submitAssignment() {
		
	}
	
	@Test // failed
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
	
	@Test // failed
	void viewAssignments() {
		Student s = sr.findById(2);
		Set<Assignment> a = s.getAssignments();
		System.out.println(a);
	}
	
	@Test // passed
	void deleteAssign() {
		Assignment a = ar.findById(3);
		si.deleteAssignment(a);
	}
	
	@Test // failed
	void viewAssignmentsT() {
		Teacher t = tr.findById(1);
		Set<Assignment> a = t.getAssignments();
		System.out.println(a);
	}
	
	@Test // passed
	void getAssignmentById() {
		Assignment assignment = si.getAssignmentById(1);
		System.out.println(assignment);
	}
	
}
