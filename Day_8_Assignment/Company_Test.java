package Day_8_Assignment;

public class Company_Test {
	public static void main(String[] args) {
		Employee_1 e = new Employee_1("Anita");
		Project p = new Project("AI System");
		Company c = new Company(e, p);
		c.showDetails();
	}
}
class Employee_1 {
	String empName;
	Employee_1(String empName) {
	    this.empName = empName;
	}
}
class Project {
	String projectName;
	Project(String projectName) {
	    this.projectName = projectName;
	}
}
class Company {
	Employee_1 employee;
	Project project;
	Company(Employee_1 employee, Project project) {
	    this.employee = employee;
	    this.project = project;
	}
	void showDetails() {
	    System.out.println("Employee Name: " + employee.empName);
	    System.out.println("Project Name: " + project.projectName);
	}
}