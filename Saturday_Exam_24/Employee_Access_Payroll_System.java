package Saturday_Exam_24;

abstract class Employee implements Payroll {
    private int employee_id;
    private String name;
    private String role;
    private double salary;
    public Employee(int employee_id, String name, String role, double salary) throws Invalid_Salary_Exception {
        if (salary <= 0) {
            throw new Invalid_Salary_Exception("Salary must be greater than zero");
        }
        this.employee_id = employee_id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }
    public int get_Employee_Id() {
        return employee_id;
    }
    public String get_Name() {
        return name;
    }
    public String get_Role() {
        return role;
    }
    protected double get_Salary() {
        return salary;
    }
    public void set_Salary(double salary, String HR) throws Invalid_Salary_Exception {
    	if (!HR.equalsIgnoreCase("HR")) {
            throw new Unauthorized_Access_Exception("Only HR can modify salary");
        }
        if (salary <= 0) {
            throw new Invalid_Salary_Exception("Invalid salary amount");
        }
        this.salary = salary;
    }
    public void display() {
        System.out.println("ID: " + employee_id);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
    }
}
class Fulltime_Employee extends Employee {
    public Fulltime_Employee(int id, String name, String role, double salary) throws Invalid_Salary_Exception {
        super(id, name, role, salary);
    }
    @Override
    public double calculate_Salary() {
    	double salary = get_Salary() + (get_Salary() * 0.10);
        return salary;
    }
    @Override
    public double calculate_Salary(double bonus) {
    	double salary = calculate_Salary() + bonus;
        return salary;
    }
}
class Contract_Employee extends Employee {
    public Contract_Employee(int id, String name, String role, double salary) throws Invalid_Salary_Exception {
        super(id, name, role, salary);
    }
    @Override
    public double calculate_Salary() {
        return get_Salary();
    }
    @Override
    public double calculate_Salary(double bonus) {
    	double salary = get_Salary() + bonus;
        return salary;
    }
}
class Unauthorized_Access_Exception extends RuntimeException {
    public Unauthorized_Access_Exception(String message) {
        super(message);
    }
}
class Invalid_Salary_Exception extends Exception {
    public Invalid_Salary_Exception(String message) {
        super(message);
    }
}
public class Employee_Access_Payroll_System {
	public static void main(String[] args) {
		try {
            Employee e1 = new Fulltime_Employee(101, "Amit", "Developer", 50000);
            Employee e2 = new Contract_Employee(102, "Riya", "Tester", 30000);
            System.out.println(e1.get_Name() + " Salary: " + e1.calculate_Salary(5000));
            System.out.println(e2.get_Name() + " Salary: " + e2.calculate_Salary(2000));
            e1.set_Salary(60000, "HR");
            e1.display();
            e2.set_Salary(40000, "Manager");
        } catch (Invalid_Salary_Exception e) {
            System.out.println("InvalidSalaryException: " + e.getMessage());
        } catch (Unauthorized_Access_Exception e) {
            System.out.println("UnauthorizedAccessException: " + e.getMessage());
        }finally{
        	System.out.println("Program continues normally");
        }
	}
}