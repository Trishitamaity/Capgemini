package Day_8_Assignment;
import java.util.Objects;

public class Employee {
	int id;
	String name;
	double salary;
	String department;
	public Employee( int id, String name, double salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary, department);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null || obj.getClass() != this.getClass()) {
			return false;
		}else {
			Employee e = (Employee) obj;
			if(this.id == e.id && this.name == e.name) {
				return true;
			}
			return false;
		}
	}
	@Override
	public String toString() {
		return "Id: " + id + "  Name: " + name + "  Salary: " + salary + "  Department: " + department;
	}
	public static void main(String[] args) {
		Employee e = new Employee(51, "Trishita", 35000.25, "Developer");
		System.out.println(e);
		Employee[] employees = {
	            new Employee(1, "Virat", 90000, "IT"),
	            new Employee(2, "Rohit", 85000, "HR"),
	            new Employee(3, "Dhoni", 95000, "IT"),
	            new Employee(4, "Rahul", 70000, "HR")
	        };
		for(int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
		Employee e1 = new Employee(21, "Suvojit", 97000, "HR");
		Employee e2 = new Employee(21, "Trishita", 51000, "IT");
		Employee e3 = e1;
		Employee e4 = null;
		Employee obj = new Employee(31, "Raju", 78000, "HR");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e2.hashCode() == e3.hashCode());
		System.out.println(e1.getClass() == e3.getClass());
		System.out.println(e1.equals(e4));
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
	}
}