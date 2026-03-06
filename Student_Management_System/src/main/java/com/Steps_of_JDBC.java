package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Steps_of_JDBC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		System.out.println("Enter employee name");
		String name = sc.next();
		System.out.println("Enter employee mobile number");
		long mobile_number = sc.nextLong();
		System.out.println("Enter employee department number");
		int department_number = sc.nextInt();
		System.out.println("Enter employee Salary");
		double salary = sc.nextDouble();
		String insert = "insert into iem.employee_details(emp_id, emp_name, emp_mobile_number, emp_deptno, emp_salary) values (?, ?, ?, ?, ?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded successfully");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("Connection successfully");
			PreparedStatement prepared_statement = connection.prepareStatement(insert);
			System.out.println("Before setting values: " + prepared_statement);
			prepared_statement.setInt(1, id);
			prepared_statement.setString(2, name);
			prepared_statement.setLong(3, mobile_number);
			prepared_statement.setInt(4, department_number);
			prepared_statement.setDouble(5, salary);
			System.out.println("After setting values: " + prepared_statement);
			System.out.println("Platform created");
			int result = prepared_statement.executeUpdate();
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