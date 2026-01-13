package Day_3_Assignment;

public class Employee {
	int id;
	String name;
	double salary;
	public void work() {
		System.out.println(name + " is working");
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	public void initialize(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 101;
		e1.name = "Trishita ";
		e1.salary = 10.524;
		Employee e2 = new Employee();
		e2.id = 102;
		e2.name = "Suvojit ";
		e2.salary = 20.524;
		Employee e3 = new Employee();
		e3.id = 103;
		e3.name = "Kuchu ";
		e3.salary = 30.524;
		Employee e4 = new Employee();
		e4.initialize(21, "Kuchi", 54153.32);
		e1.work();
		e2.work();
		e3.work();
		e4.work();
	}
}
