package com;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name = "Customer_Information_Table")
public class Customer_Information {
	@Id
	@Column(name = "Customer_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Customer_Name", nullable = false)
    private String name;
	@Column(name = "Customer_Email", nullable = false, unique = true)
    private String email;
	@Column(name = "Customer_Phone_Number", nullable = false, unique = true, length = 10)
    private String phone_number;
	@Column(name = "Customer_Gender", nullable = false)
    private String gender;
	@Column(name = "Customer_Address", nullable = false)
    private String address;
    public Customer_Information() {
    }
    public Customer_Information(int id, String name, String email, String phone_number, String gender, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone_number = phone_number;
		this.gender = gender;
		this.address = address;
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
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer_Information [id =" + id + ", name =" + name + ", email =" + email + ", phone_number =" + phone_number + ", gender =" + gender + ", address =" + address + "]";
	}
}