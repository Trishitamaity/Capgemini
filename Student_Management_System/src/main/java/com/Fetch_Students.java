package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Fetch_Students {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name or email or gender or stream or degree :");
        String input = sc.next();
		String select = "select * from student_details where Student_Name = ? or Student_Email_ID = ? or Student_Gender = ? or Student_Stream = ? or Student_Degree = ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver class loaded successfully");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system?user=root&password=root");
			System.out.println("Connection successfully");
			PreparedStatement ps = connection.prepareStatement(select);
			ps.setString(1, input);
			ps.setString(2, input);
			ps.setString(3, input);
			ps.setString(4, input);
			ps.setString(5, input);
			ResultSet resultset = ps.executeQuery();
			if(resultset.isBeforeFirst()) {
				while(resultset.next()) {
					System.out.println("Student id : " + resultset.getString("Student_ID"));
					System.out.println("Student name : " + resultset.getString("Student_Name"));
					System.out.println("Student percentage : " + resultset.getDouble("Student_Percentage"));
					System.out.println("Student stream : " + resultset.getString("Student_Stream"));
					System.out.println("Student degree : " + resultset.getString("Student_Degree"));
					System.out.println("Student email : " + resultset.getString("Student_Email_ID"));
					System.out.println("Student gender : " + resultset.getString("Student_Gender"));
					System.out.println("Student D_O_B : " + resultset.getString("Student_D_O_B"));
					System.out.println("Employee mobile number : " + resultset.getLong("Student_Mobile_Number"));
				}
			}else {
				System.out.println("No student found with this input");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}