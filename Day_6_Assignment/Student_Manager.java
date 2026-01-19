package Day_6_Assignment;

public class Student_Manager {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student(18, "Virat", 94);
		students[1] = new Student(45, "Rohit", 96);
		students[2] = new Student(7, "Dhoni", 32);
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].id);
			System.out.println(students[i].name);
		}
		for(Student s : students) {
			System.out.println(s.id);
			System.out.println(s.name);
		}
	}
}
class Student {
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
}