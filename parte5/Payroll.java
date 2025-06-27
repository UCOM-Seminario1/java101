package parte5;

import java.util.List;
import parte3.Employee;
import parte3.Employee.TypeEmployee;

public class Payroll {
    private List<Employee> employees;

    public Payroll(List<Employee> employees) {
        this.employees = employees;
    }

    public void processPayroll() {
        for (Employee employee : employees) {
            double salary = getSalaryByType(employee.getType());
            employee.getAccount().deposit(salary);
            System.out.println("Depósito de salario a " + employee.getName() + ": " + salary);
        }
    }

    private double getSalaryByType(Employee.TypeEmployee type) {
        switch (type) {
            case INTERN:
                return 3000.0;
            case STAFF:
                return 7000.0;
            case MANAGER:
                return 15000.0;
            default:
                return 0.0;
        }
    }
}