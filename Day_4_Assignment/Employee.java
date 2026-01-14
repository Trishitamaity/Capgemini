package Day_4_Assignment;

public class Employee {
    private int empId;
    private double salary;
    private String password;
    public Employee() {
    }
    public Employee(int empId, double salary, String password) {
        this.empId = empId;
        this.salary = salary;
        this.password = password;
    }
    public double getSalary(String password) {
        if (this.password.equals(password)) {
            return salary;
        } else {
            System.out.println("Invalid password");
            return 0;
        }
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(501, 45000, "emp@123");
        double s = e1.getSalary("emp@123");
        System.out.println(s);
    }
}