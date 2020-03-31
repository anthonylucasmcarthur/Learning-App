package src.main.java.dev.learning.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.learning.entities.Assignment;
import dev.learning.entities.Student;
import dev.learning.entities.Teacher;
import dev.learning.repositories.AssignmentRepo;
import dev.learning.repositories.StudentRepo;
import dev.learning.repositories.TeacherRepo;
import dev.learning.services.AssignmentServices;
import dev.learning.services.StudentServices;
import dev.learning.services.TeacherServices;

@Service
public class ServicesImplementation implements StudentServices, TeacherServices, AssignmentServices{

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
			t =	tr.findByUsername(username);
				
				if(t.getPassword().equals(password)){
				
				return t;	
					
				}else {
					System.out.println("Access Denied");
					return null;
				}}
		catch(NullPointerException n) {
			System.out.println("Invalid username");
			return null;
		}

			}
		return null;
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
		s =	sr.findByUsername(username);
			
			if(s.getPassword().equals(password)){
			
			return s;	
				
			}else {
				System.out.println("Access Denied");
				return null;
			}}
	catch(NullPointerException n) {
		System.out.println("Invalid username");
		return null;
	}

		}
	}

	@Override
	public Set<Student> viewStudents(Teacher teacher) {
		Set<Student> s = sr.viewStudents(teacher);
		return s;
		return null;
	}

	@Override
	public Set<Assignment> viewAssignmentByStudent(int sid) {
Set<Assignment> a;
		
		a = ar.findAssignmentByStudent(sid);
		
		return a;
		return null;
	}

	@Override
	public Student submitAssignment(Assignment a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Assignment AssignAssignment(Assignment a) {

 
		Assignment as;
	//	as = ar.createAssignment(description, duedate, weight)	
	Assignment as = ar.createAssignment(description, duedate, weight)
				
		
		return as;
	}

	@Override
	public Assignment gradeAssignment(Assignment a, double grade) {
		{ ar.save(a);
			Assignment a = ar.gradeAssignment(grade, comment) {
		}
		
			
		return a	}

	@Override
	public Set<Assignment> viewAssignment(Assignment a) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	@Override
	public Set<Assignment> viewAssignments(Student s) {
		// TODO Auto-generated method stub
>>>>>>> Stashed changes
		return null;
	}

	@Override
	public Teacher gradeAssignment(Assignment a, double grade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
<<<<<<< Updated upstream
	public Set<Assignment> viewAssignment(Assignment a) {
=======
	public Assignment gradeAssignment1(Assignment a, double grade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteAssignment(Assignment a) {
>>>>>>> Stashed changes
		// TODO Auto-generated method stub
		return null;
	}

}
