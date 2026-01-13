package Day_3_Assignment;

import java.util.Scanner;

public class Employee1 {
	int id;
	String name;
	double salary;
	public void work() {
		System.out.println(name + " is working");
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of object need to be created");
		int object_number = sc.nextInt();
		for(int i = 0; i < object_number; i++) {
			Employee1 s = new Employee1();
			System.out.println("Enter the Employee id :");
			s.id = sc.nextInt();
			System.out.println("Enter the Employee name :");
			sc.nextLine();
			s.name = sc.nextLine();
			System.out.println("Enter the Employee salary :");
			s.salary = sc.nextDouble();
			s.work();
		}
	}
}
