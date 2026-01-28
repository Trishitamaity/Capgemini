package Enum;
import java.util.*;

public class Employee {
	int id;
	String name;
	double salary;
	public Employee() {
		
	}
	public Employee(int id, String name, double salary) {
		this.id =  id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
	    return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
	}
	public static void main(String[] args) {
		ArrayList<Employee> employee_list = new ArrayList<>();
		employee_list.add(new Employee(1, "Trishita Maity", 45000.676));
		employee_list.add(new Employee(2, "Suvojit Maity", 55000.566));
		employee_list.add(new Employee(3, "Srijita Maity", 95000.600));
		Collections.sort(employee_list, (e1, e2) -> e1.id - e2.id);
		for (Employee e : employee_list) {
			System.out.println(e);
		}
	}
}