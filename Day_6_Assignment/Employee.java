package Day_6_Assignment;

public abstract class Employee {
	int id;
	String name;
	public Employee() {
	}
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public abstract void print();
	public static void main(String[] args) {
		Raju r = new Raju(10, "Raju", 100000.0);
		r.print();
		Employee e = new Raju(20, "Trishita", 1000000.0);
		e.print();
	}
}
class Raju extends Employee {
	double salary;
	public Raju(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}
	public void print() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
}