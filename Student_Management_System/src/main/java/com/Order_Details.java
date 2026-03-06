package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Order_Details {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter order id");
		int order_id = sc.nextInt();
		System.out.println("Enter customer id");
		int customer_id = sc.nextInt();
		System.out.println("Enter product id");
		int product_id = sc.nextInt();
		System.out.println("Enter price");
		Double price = sc.nextDouble();
		System.out.println("Enter address");
		String address = sc.next();
		String insert = "insert into customer.order_details(Customer_ID, Product_ID, Price, Address) values (?, ?, ?, ?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded successfully");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("Connection successfully");
			PreparedStatement ps = connection.prepareStatement(insert);
			System.out.println("Before setting values: " + ps);
			ps.setInt(1, customer_id);
			ps.setInt(2, product_id);
			ps.setDouble(3, price);
			ps.setString(4, address);
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