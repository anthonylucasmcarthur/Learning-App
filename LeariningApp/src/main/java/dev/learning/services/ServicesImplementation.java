package dev.learning.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.learning.entities.Assignment;
import dev.learning.entities.Student;
import dev.learning.entities.Teacher;
import dev.learning.repositories.AssignmentRepo;
import dev.learning.repositories.StudentRepo;
import dev.learning.repositories.TeacherRepo;

@Service
public class ServicesImplementation implements StudentServices, TeacherServices, AssignmentServices {

	@Autowired
	StudentRepo sr;

	@Autowired
	TeacherRepo tr;

	@Autowired
	AssignmentRepo ar;

	@Override
	public Teacher Tlogin(String username, String password) {
		Teacher t;
		try {
			t = tr.findByUsername(username);

			if (t.getPassword().equals(password)) {

				return t;

			} else {
				System.out.println("Invalid password");
				return null;
			}
		} catch (NullPointerException n) {
			System.out.println("Invalid username");
			return null;
		}

	}

	@Override
	public Assignment commentT(Assignment a, int aid, String comment) {
		Assignment tc = ar.comment(a, comment);
		return tc;
	}

	@Override
	public Student login(String username, String password) {
		Student s;
		try {
			s = sr.findByUsername(username);

			if (s.getPassword().equals(password)) {

				return s;

			} else {
				System.out.println("Invalid password");
				return null;
			}
		} catch (NullPointerException n) {
			System.out.println("Invalid username");
			return null;
		}

	}

	@Override
	public Set<Student> viewStudents(Teacher teacher) {
		Set<Student> s = teacher.getStudents();
		return s;
	}

	@Override
	public Set<Assignment> viewAssignmentByStudent(int sid) {
		Set<Assignment> a = ar.findAssignmentByStudent(sid);
		return a;
	}

	@Override
	public Student submitAssignment(Assignment a, int aid, String comment) {
		return ar.save(a);
	}

	
	@Override
	public Assignment AssignAssignment(Assignment a) {
		return ar.save(a);
	}

	@Override
	public Assignment gradeAssignment(Assignment a) {
		return ar.save(a);
	}

	@Override
	public Set<Assignment> viewAssignments(Student s) {
		Set<Assignment> sa = s.getAssignments();
		return sa;
	}

	@Override
	public boolean deleteAssignment(Assignment a) {
		ar.delete(a);
		return true;
	}

	@Override
	public Set<Assignment> viewAssignmentsT(Teacher t) {
		Set<Assignment> st = t.getAssignments();
		return st;
	}

	@Override
	public Assignment getAssignmentById(int aid) {
		Assignment a = ar.findById(aid);
		return a;
	}


}
