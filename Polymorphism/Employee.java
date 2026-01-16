package Polymorphism;

public class Employee {
	int id;
	String name;
	double salary;
	String department;
	public Employee(int id) {
		this.id = id;
	}
	public Employee(int id, String name) {
		this(id);
		this.name = name;
	}
	public Employee(int id, String name, double salary) {
		this(id, name);
		this.salary = salary;
	}
	public Employee(int id, String name, double salary, String department) {
		this(id, name, salary);
		this.department = department;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee(544);
		System.out.println(e1.id);
		Employee e2 = new Employee(345, "Trishita", 54423.766, "Development");
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.salary);
		System.out.println(e2.department);
	}
}