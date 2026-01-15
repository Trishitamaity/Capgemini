package Day_5_Assignment;

public class Human {
	String name;
	int age;
	char gender;
	public Human() {
	}
	public Human(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void print_human() {
		System.out.println("Human name is " + name);
		System.out.println("Age is " + age);
		System.out.println("Gender is " + gender);
	}
	public static void main(String[] args) {
		Employee e = new Employee("Trishita", 22, 'F', 234, 35000);
		Student s = new Student("Suvojit", 22, 'M', 96);
		e.print_human();
		s.print_human();
		e.print_employee();
		s.print_student();
	}
}
class Employee extends Human {
	int id;
	int salary;
	public Employee(String name, int age, char gender, int id, int salary) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.id = id;
		this.salary = salary;
	}
	public void print_employee() {
		print_human();
		System.out.println("Id is " + id);
		System.out.println("Salary is " + salary);
	}
}
class Student extends Human {
	float percentage;
	public Student(String name, int age, char gender, float percentage) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.percentage = percentage;
	}
	public void print_student() {
		print_human();
		System.out.println("Student percentage is " + percentage);
	}
}