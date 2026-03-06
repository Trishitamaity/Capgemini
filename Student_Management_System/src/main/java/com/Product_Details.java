package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Product_Details {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product id");
		int id = sc.nextInt();
		System.out.println("Enter Product name");
		String name = sc.next();
		System.out.println("Enter Product price");
		Double price = sc.nextDouble();
		System.out.println("Enter Product discount");
		Double discount = sc.nextDouble();
		System.out.println("Enter Product brand");
		String brand = sc.next();
		System.out.println("Enter Product category");
		String category = sc.next();
		System.out.println("Enter Product quantity");
		int quantity = sc.nextInt();
		String insert = "insert into customer.product_details(Product_Name, Product_Price, Product_Discount, Brand, Category, Quantity) values (?, ?, ?, ?, ?, ?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded successfully");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("Connection successfully");
			PreparedStatement ps = connection.prepareStatement(insert);
			System.out.println("Before setting values: " + ps);
			ps.setString(1, name);
			ps.setDouble(2, price);
			ps.setDouble(3, discount);
			ps.setString(4, brand);
			ps.setString(5, category);
			ps.setInt(6, quantity);
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