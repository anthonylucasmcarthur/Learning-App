package dev.learning.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table
public class Teacher {
		@GeneratedValue
		@Id
		@Column(name = "t_id")
		private int id;
		
		@Column(name = "username")
		private String username;
		
		@Column(name = "firstname")
		private String firstname;
		
		
		@Column(name = "lastname")
		private String lastname;
		
		
		@Column(name = "password")
		private String password;


		@OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
		private Set<Student> students = new HashSet<Student>();
		
		
		@OneToMany(mappedBy = "assignements", fetch = FetchType.LAZY)
		private Set<Assignment> assignments = new HashSet<Assignment>();
		
		
		public Teacher(int id, String username, String firstname, String lastname, String password) {
			super();
			this.id = id;
			this.username = username;
			this.firstname = firstname;
			this.lastname = lastname;
			this.password = password;
		}


		public Teacher() {
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


		@Override
		public String toString() {
			return "Teacher [id=" + id + ", username=" + username + ", firstname=" + firstname + ", lastname="
					+ lastname + ", password=" + password + "]";
		}


		


		
	
		
	
}


