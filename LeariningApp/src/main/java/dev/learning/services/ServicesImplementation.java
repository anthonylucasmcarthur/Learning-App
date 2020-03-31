package dev.learning.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< Updated upstream
=======
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
>>>>>>> Stashed changes

import dev.learning.entities.Assignment;
import dev.learning.entities.Student;
import dev.learning.entities.Teacher;
import dev.learning.repositories.AssignmentRepo;
import dev.learning.repositories.StudentRepo;
import dev.learning.repositories.TeacherRepo;
<<<<<<< Updated upstream

=======
@Component
@Service
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
		
		Assignment tc = ar.comment(a, comment);
		
		return tc;
	}
=======
//		
//		Assignment tc = ar.comment(a, comment);
		
		return ar.comment(a, comment);	}
>>>>>>> Stashed changes

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

<<<<<<< Updated upstream
	@Override
	public Set<Student> viewStudents(Teacher teacher) {
		Set<Student> s = sr.viewStudents(teacher);
		return s;
		
	}

	@Override
	public Set<Assignment> viewAssignmentByStudent(int sid) {
		Set<Assignment> a = ar.findAssignmentByStudent(sid);
		return a;
=======
//	@Override
//	public Set<Student> viewStudents(Teacher teacher) {
//		Set<Student> s = sr.viewStudents(teacher);
//		return s;
//		
//	}

	@Override
	public Set<Assignment> viewAssignmentByStudent(int sid) {
	//	Set<Assignment> a = ar.findAssignmentByStudent(sid);
		return ar.findAssignmentByStudent(sid);
>>>>>>> Stashed changes
	
	}

	@Override
	public Student submitAssignment(Assignment a, int aid, String comment) {
		ar.save(a);
		return null;
	}

	@Override
	public Assignment AssignAssignment(Assignment a) {
//		String description = a.getDescription();
//		String duedate = a.getDuedate();
//		double weight = a.getWeight();
	//Assignment as = ar.createAssignment(description, duedate, weight);
<<<<<<< Updated upstream
		Assignment as = ar.createAssignment(a);
		
		return as;
=======
		//Assignment as = ar.createAssignment(a);
		
		return ar.createAssignment(a);
>>>>>>> Stashed changes
	}

	@Override
	public Assignment gradeAssignment(Assignment a, double grade) {
		a.setGrade(grade);
		return a;
	}


	@Override
	public Set<Assignment> viewAssignments(Student s) {
		
		Set<Assignment> sa = ar.viewAssignments(s);
		return sa;
	}

//	@Override
//	public Set<Assignment> viewAssignmentsT(Teacher t) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public boolean deleteAssignment(Assignment a) {
		
		ar.delete(a);
		
		return false;
	}

	@Override
	public Set<Assignment> viewAssignmentsT(Teacher t) {
	
		Set<Assignment> st = ar.viewAssignmentsT(t);
		return st;
	}

	public Assignment getAssignmentById(int aid) {
		a = ar.findById(aid);
		
		return a;
	}
//	@Override
//	public Assignment commentT(Assignment a, String comment) {
//		
//		Assignment ac = ar.comment(a, comment);
//		
//		
//		return ac;
//	}

}
