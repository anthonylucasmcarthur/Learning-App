package dev.learning.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class Teacher {
		@GeneratedValue
		@Id
		@Column(name = "t_id")
		private int id;
		
		
		@Column(name = "firstname")
		private String firstname;
		
		
		@Column(name = "lastname")
		private String lastname;
		
		
		@Column(name = "username")
		private String username;
	
		
		@Column(name = "password")
		private String password;


		
		public Teacher(int id,  String firstname, String lastname, String username, String password) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.username = username;
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


