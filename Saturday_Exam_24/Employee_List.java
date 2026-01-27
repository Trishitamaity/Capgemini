package Saturday_Exam_24;
import java.util.ArrayList;
import java.util.List;

public class Employee_List {
	int id;
	String name;
	double salary;
	String department;
	public Employee_List(int id, String name, double salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public static List<Employee_List> find_Employee_by_Department(List<Employee_List> employees, String department){
		List<Employee_List> result = new ArrayList<>();
        for (Employee_List e : employees) {
            if (e.department.equals(department)) {
                result.add(e);
            }
        }
        return result;
	}
	public static List<Employee_List> find_Employee_by_Salary(List<Employee_List> employees, double salary){
		List<Employee_List> result = new ArrayList<>();
        for (Employee_List e : employees) {
            if (e.salary >= salary) {
                result.add(e);
            }
        }
        return result;
	}
	@Override
	public String toString() {
        return id + " " + name + " " + salary + " " + department;
    }
	public static void main(String[] args) {
		List<Employee_List> a1 = new ArrayList<Employee_List>();
		a1.add(new Employee_List(1, "Amit", 50000, "IT"));
        a1.add(new Employee_List(2, "Neha", 60000, "HR"));
        a1.add(new Employee_List(3, "Rahul", 70000, "IT"));
        a1.add(new Employee_List(4, "Sneha", 45000, "Finance"));
        System.out.println("Employees from IT Department:");
        List<Employee_List> department_list = find_Employee_by_Department(a1, "IT");
        for (Employee_List e : department_list) {
            System.out.println(e);
        }

        System.out.println("Employees with salary >= 60000:");
        List<Employee_List> salary_list = find_Employee_by_Salary(a1, 60000);
        for (Employee_List e : salary_list) {
            System.out.println(e);
        }
	}
}