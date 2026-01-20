package Day_7_Assignment;

public class Main_Class {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(1, "Virat", 90000, "IT", 8),
            new Employee(2, "Rohit", 85000, "HR", 6),
            new Employee(3, "Dhoni", 95000, "IT", 12),
            new Employee(4, "Rahul", 70000, "HR", 4)
        };
        EmployeeService service = new EmployeeServiceImp();
        System.out.println("High Salary Employees:");
        for (Employee e : service.getHighSalaryEmployees(employees, 88000)) {
            System.out.println(e.name);
        }
        System.out.println("Average Salary: " + service.calculateAverageSalary(employees));
        System.out.println("Top Paid Employee: " + service.getTopPaidEmployee(employees).name);
        System.out.println("Experienced Employees:");
        for (Employee e : service.getExperiencedEmployees(employees, 5)) {
            System.out.println(e.name);
        }
        Employee topIT = service.getTopPaidEmployeeByDepartment(employees, "IT");
        System.out.println("Top Paid IT Employee: " + topIT.name);
        System.out.println("Average Salary (HR): " + service.getAverageSalaryByDepartment(employees, "HR"));
    }
}