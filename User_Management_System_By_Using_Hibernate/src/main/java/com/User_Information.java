package com;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "User_Information_Table")
public class User_Information {
	@Id
	@Column(name = "User_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "User_Name", nullable = false)
	private String name;
	@Column(name = "User_Email", nullable = false, unique = true)
	private String email;
	@Column(name = "User_Mobile_Number", nullable = false, unique = true, length = 10)
	private long mobile_number;
	@Column(name = "User_Gender", nullable = false)
	private String gender;
	public User_Information() {
	}
	public User_Information(int id, String name, String email, long mobile_number, String gender) {
		this.id  = id;
		this.name = name;
		this.email = email;
		this.mobile_number = mobile_number;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "User_Information [id=" + id + ", name=" + name + ", email=" + email + ", mobile_number=" + mobile_number + ", gender=" + gender + "]";
	}
}