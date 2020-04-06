package dev.learning.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "assign")
public class Assignment {

	@Id
	@GeneratedValue
	@Column(name = "a_id")
	private int id;
	
	@Column(name = "description")
	private String description;
	
	
	@Column(name = "duedate")
	private String duedate;
	
	@Column(name = "weight")
	private double weight;
	
	@Column(name = "submission")
	private String submission;
	
	@Column(name = "grade")
	private double grade;
	
	@Column(name = "comment")
	private String comment;
	
	
	@JoinColumn(name = "t_id")
	@ManyToOne
	private Teacher teacher;
	
	
	@JoinColumn(name = "s_id")
	@ManyToOne
	private Student student;

	public Assignment() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuedate() {
		return duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	
	public String getSubmission() {
		return submission;
	}

	public void setSubmission(String submission) {
		this.submission = submission;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Assignment [id=" + id + ", description=" + description + ", duedate=" + duedate + ", weight=" + weight
				+ ", submission=" + submission + ", grade=" + grade + ", comment=" + comment + ", teacher=" + teacher
				+ ", student=" + student + "]";
	}

	

	

	

	
	
	
	
	
}

