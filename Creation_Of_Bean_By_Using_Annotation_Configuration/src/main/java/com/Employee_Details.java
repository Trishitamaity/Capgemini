package com;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("Employee")
@ComponentScan(basePackages = "com")
public class Employee_Details {
	public Employee_Details() {
		System.out.println("Object is created");
	}
	public void Display_Employee_Details() {
		System.out.println("Employee name : Trishita Maity");
		System.out.println("Employee salary : 540000");
	}
}