package parte3;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee intern = new Employee("Ana", Employee.TypeEmployee.INTERN, "1001", 0.0);
        Employee staff = new Employee("Luis", Employee.TypeEmployee.STAFF, "1002", 0.0);
        Employee manager = new Employee("Sofia", Employee.TypeEmployee.MANAGER, "1003", 0.0);

        depositSalary(intern);
        depositSalary(staff);
        depositSalary(manager);

        printEmployeeInfo(intern);
        printEmployeeInfo(staff);
        printEmployeeInfo(manager);
    }

    public static void depositSalary(Employee employee) {
        double salary = 0.0;
        switch (employee.getType()) {
            case INTERN:
                salary = 3000.0;
                break;
            case STAFF:
                salary = 7000.0;
                break;
            case MANAGER:
                salary = 15000.0;
                break;
        }
        employee.getAccount().deposit(salary);
        System.out.println("Salario depositado a " + employee.getName() + ": " + salary);
    }

    public static void printEmployeeInfo(Employee employee) {
        System.out.println("Empleado: " + employee.getName());
        System.out.println("Cargo: " + employee.getType());
        System.out.println("Saldo en cuenta: " + employee.getAccount().getBalance());
        System.out.println("-----------------------------");
    }
}