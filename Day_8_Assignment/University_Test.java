package Day_8_Assignment;

public class University_Test {
	public static void main(String[] args) {
		Professor p = new Professor("Dr. Kumar");
		Department d = new Department("Computer Science");
		University u = new University(p, d);
		u.display();
	}
}
class Professor {
	String name;
	Professor(String name) {
	    this.name = name;
	}
}
class Department {
	String deptName;
	Department(String deptName) {
	    this.deptName = deptName;
	}
}
class University {
	Professor prof;
	Department dept;
	University(Professor prof, Department dept) {
	    this.prof = prof;
	    this.dept = dept;
	}
	void display() {
	    System.out.println("Professor: " + prof.name);
	    System.out.println("Department: " + dept.deptName);
	}
}