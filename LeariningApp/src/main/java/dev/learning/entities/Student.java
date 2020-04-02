package dev.learning.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table
public class Student {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "s_id")
	private int id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "firstname")
	private String firstname;
	
	
	@Column(name = "lastname")
	private String lastname;
	
	
	@Column(name = "password")
	private String password;


	@ManyToOne
	@JoinColumn(name = "t_id")
	private Teacher teacher;



	public Student() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}



	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", password=" + password + ", teacher=" + teacher + "]";
	}
	
	


	


	
	
	
	
}
