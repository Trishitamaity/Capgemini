package Day_7_Assignment;

public interface EmployeeService {
	Employee[] getHighSalaryEmployees(Employee[] employees, double minSalary);
	double calculateAverageSalary(Employee[] employees);
	Employee getTopPaidEmployee(Employee[] employees);
	Employee[] getExperiencedEmployees(Employee[] employees, int minYears);
	Employee getTopPaidEmployeeByDepartment(Employee[] employees, String department);
	double getAverageSalaryByDepartment(Employee[] employees, String department);
}
class EmployeeServiceImp implements EmployeeService {
    public Employee[] getHighSalaryEmployees(Employee[] employees, double minSalary) {
        int count = 0;
        for (Employee e : employees) {
            if (e.salary >= minSalary) {
                count++;
            }
        }
        Employee[] result = new Employee[count];
        int j = 0;
        for (Employee e : employees) {
            if (e.salary >= minSalary) {
                result[j++] = e;
            }
        }
        return result;
    }
    public double calculateAverageSalary(Employee[] employees) {
        double sum = 0;
        for (Employee e : employees) {
            sum += e.salary;
        }
        return sum / employees.length;
    }
    public Employee getTopPaidEmployee(Employee[] employees) {
        Employee top = employees[0];
        for (Employee e : employees) {
            if (e.salary > top.salary) {
                top = e;
            }
        }
        return top;
    }
    public Employee[] getExperiencedEmployees(Employee[] employees, int minYears) {
        int count = 0;
        for (Employee e : employees) {
            if (e.experience >= minYears) {
                count++;
            }
        }
        Employee[] result = new Employee[count];
        int j = 0;
        for (Employee e : employees) {
            if (e.experience >= minYears) {
                result[j++] = e;
            }
        }
        return result;
    }
    public Employee getTopPaidEmployeeByDepartment(Employee[] employees, String department) {
        Employee top = null;
        for (Employee e : employees) {
            if (e.department.equalsIgnoreCase(department)) {
                if (top == null || e.salary > top.salary) {
                    top = e;
                }
            }
        }
        return top;
    }
    public double getAverageSalaryByDepartment(Employee[] employees, String department) {
        double sum = 0;
        int count = 0;
        for (Employee e : employees) {
            if (e.department.equalsIgnoreCase(department)) {
                sum += e.salary;
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }
}