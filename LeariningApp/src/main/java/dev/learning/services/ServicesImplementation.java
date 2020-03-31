package dev.learning.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import dev.learning.entities.Assignment;
import dev.learning.entities.Student;
import dev.learning.entities.Teacher;
import dev.learning.repositories.AssignmentRepo;
import dev.learning.repositories.StudentRepo;
import dev.learning.repositories.TeacherRepo;

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
	public Teacher commentT(Assignment a, String comment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student login(String username, String password) {

		{

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
	}

	@Override
	public Set<Student> viewStudents(Teacher teacher) {
		Set<Student> s = sr.viewStudents(teacher);
		return s;
		
	}

	@Override
	public Set<Assignment> viewAssignmentByStudent(int sid) {
		Set<Assignment> a = ar.findAssignmentByStudent(sid);
		return a;
	
	}

	@Override
	public Student submitAssignment(Assignment a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Assignment AssignAssignment(Assignment a) {
//		String description = a.getDescription();
//		String duedate = a.getDuedate();
//		double weight = a.getWeight();
//		Assignment as = ar.createAssignment(description, duedate, weight);
		Assignment as = ar.createAssignment(a);
		
		return as;
	}

	@Override
	public Assignment gradeAssignment(Assignment a, double grade) {
		a.setGrade(grade);
		return a;
	}


	@Override
	public Set<Assignment> viewAssignments(Student s) {
		
		return null;
	}

	@Override
	public Set<Assignment> viewAssignments(Teacher t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteAssignment(Assignment a) {
		// TODO Auto-generated method stub
		return false;
	}

}
