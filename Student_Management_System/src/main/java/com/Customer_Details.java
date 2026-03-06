package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Customer_Details {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer id");
		int id = sc.nextInt();
		System.out.println("Enter Customer name");
		String name = sc.next();
		System.out.println("Enter Customer email");
		String email = sc.next();
		System.out.println("Enter Customer mobile_number");
		long mobile_number = sc.nextLong();
		System.out.println("Enter Customer gender");
		String gender = sc.next();
		System.out.println("Enter Customer address");
		String address = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		String insert = "insert into customer.customer_details(Customer_Name, Customer_Email_ID, Customer_Mobile_Number, Customer_Gender, Customer_Address, Password) values (?, ?, ?, ?, ?, ?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded successfully");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("Connection successfully");
			PreparedStatement ps = connection.prepareStatement(insert);
			System.out.println("Before setting values: " + ps);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setLong(3, mobile_number);
			ps.setString(4, gender);
			ps.setString(5, address);
			ps.setString(6, password);
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