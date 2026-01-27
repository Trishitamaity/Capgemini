package Enum;
import java.util.*;

public class LIST {
	public static void display(List<Student> sList) {
		for (Student student : sList) {
			System.out.print(student.id + " ");
			System.out.print(student.nameString + " ");
			System.out.print(student.marks + " ");
			System.out.println();
			}
		System.out.println();
	}
	public static void passfailCount(List<Student> sList) {
		int pass = 0;
		int fail = 0;
		for (Student student : sList) {
			if (student.marks >= 40) {
				pass++;
			} else {
				fail++;
			}
		}
		System.out.println("The number of students who passed are : " + pass);
		System.out.println("The number of students who failed are : " + fail);
		System.out.println();
		System.out.println();
	}
	public static Student topper(List<Student> sList) {
		Student student1 = null;
		int max = 0;
		for (Student student : sList) {
			if (student.marks > max) {
				max = student.marks;
				student1 = student;
			}
		}
		return student1;
	}
	public static void find(List<Student> sList, String name) {
		int c = 0;
		for (Student student : sList) {
			if (student.nameString.equals(name)) {
				System.out.println("The student details are found :");
				System.out.print(student.id + " ");
				System.out.print(student.nameString + " ");
				System.out.print(student.marks + " ");
				System.out.println();
				c = 1;
				break;
			}
		}
		if (c == 0) {
			System.out.println("Student does not exist in the database...");
			System.out.println();
		}
		System.out.println();
	}
	public static void pass(List<Student> sList) {
		System.out.println("Students who passed are :");
		for (Student student : sList) {
			if (student.marks >= 40) {
				System.out.print(student.id + " ");
				System.out.print(student.nameString + " ");
				System.out.print(student.marks + " ");
				System.out.println();
				
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Student> sList = new ArrayList<Student>();
		sList.add(new Student(1, "DEV", 90));
		sList.add(new Student(2, "RAM", 100));
		sList.add(new Student(3, "SHYAM", 70));
		display(sList);
		pass(sList);
		Student s1 = topper(sList);
		System.out.println("The topper is " + s1.nameString + " with id " + s1.id + " and marks " + s1.marks);
		System.out.println();
		System.out.print("Enter the name of the student whose details are to be found : ");
		String name = scanner.nextLine();
		System.out.println();
		System.out.println();
		find(sList, name);
		passfailCount(sList);
		scanner.close();
	}
}