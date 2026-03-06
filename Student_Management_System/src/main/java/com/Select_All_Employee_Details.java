package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Select_All_Employee_Details {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee salary :");
        Double salary = sc.nextDouble();
		String select = "select * from employee_details where emp_salary > ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded successfully");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/iem?user=root&password=root");
			System.out.println("Connection successfully");
			PreparedStatement ps = connection.prepareStatement(select);
			ps.setDouble(1, salary);
			ResultSet resultset = ps.executeQuery();
			if(resultset.isBeforeFirst()) {
				while(resultset.next()) {
					System.out.println("Employee name : " + resultset.getString("emp_name"));
					System.out.println("Employee salary : " + resultset.getDouble("emp_salary"));
					System.out.println("Employee department number : " + resultset.getInt("emp_deptno"));
					System.out.println("Employee mobile number : " + resultset.getLong("emp_mobile_number"));
				}
			}else {
				System.out.println("No data present");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}