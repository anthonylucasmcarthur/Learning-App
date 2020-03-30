package dev.revature.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "assignment")
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
	
	@Column(name = "grade")
	private double grade;
	
	@Column(name = "comment")
	private String comment;
	
	@ManyToOne
	@JoinColumn(name = "t_id")
	private int tid;
	
	@ManyToOne
	@JoinColumn(name = "s_id")
	private int sid;

	public Assignment(int id, String description, String duedate, double weight, double grade, String comment, int tid,
			int sid) {
		super();
		this.id = id;
		this.description = description;
		this.duedate = duedate;
		this.weight = weight;
		this.grade = grade;
		this.comment = comment;
		this.tid = tid;
		this.sid = sid;
	}

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

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Assignment [id=" + id + ", description=" + description + ", duedate=" + duedate + ", weight=" + weight
				+ ", grade=" + grade + ", comment=" + comment + ", tid=" + tid + ", sid=" + sid + "]";
	}
	
	
	
	
}

