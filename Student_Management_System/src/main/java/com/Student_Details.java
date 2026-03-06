package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Student_Details {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id");
		int id = sc.nextInt();
		System.out.println("Enter Student name");
		String name = sc.next();
		System.out.println("Enter Student percentage");
		double percentage = sc.nextDouble();
		System.out.println("Enter Student stream");
		String stream = sc.next();
		System.out.println("Enter Student degree");
		String degree = sc.next();
		System.out.println("Enter Student email");
		String email = sc.next();
		System.out.println("Enter Student gender");
		String gender = sc.next();
		System.out.println("Enter Student date_of_birth");
		String date_of_birth = sc.next();
		System.out.println("Enter Student mobile_number");
		long mobile_number = sc.nextLong();
		String insert = "insert into student_management_system.student_details(Student_Name, Student_Percentage, Student_Stream, Student_Degree, Student_Email_ID, Student_Gender, Student_D_O_B, Student_Mobile_Number) values (?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded successfully");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("Connection successfully");
			PreparedStatement ps = connection.prepareStatement(insert);
			System.out.println("Before setting values: " + ps);
			ps.setString(1, name);
			ps.setDouble(2, percentage);
			ps.setString(3, stream);
			ps.setString(4, degree);
			ps.setString(5, email);
			ps.setString(6, gender);
			ps.setString(7, date_of_birth);
			ps.setLong(8, mobile_number);
			System.out.println("After setting values: " + ps);
			System.out.println("Platform created");
			int result = ps.executeUpdate();
			if(result != 0) {
				System.out.println("Data inserted successfully");
			}else {
				System.out.println("No data inserted");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}