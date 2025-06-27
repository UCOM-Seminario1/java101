package parte5;

import parte3.Employee;
import parte3.Employee.TypeEmployee;
import java.util.List;
import java.util.Arrays;

public class PayrollManager2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ana", TypeEmployee.INTERN, "1001", 0.0);
        Employee e2 = new Employee("Luis", TypeEmployee.STAFF, "1002", 0.0);
        Employee e3 = new Employee("Sofia", TypeEmployee.MANAGER, "1003", 0.0);
        Employee e4 = new Employee("Carlos", TypeEmployee.STAFF, "1004", 0.0);
        Employee e5 = new Employee("Maria", TypeEmployee.INTERN, "1005", 0.0);

        List<Employee> empleadosPepito = Arrays.asList(e1, e2, e3, e4, e5);

        double bancoEmpresa = 15000.0;
        int index = 0;

        System.out.println("--- Proceso de pago con do-while y control de saldo ---");
        do {
            Employee emp = empleadosPepito.get(index);
            double salario = getSalaryByType(emp.getType());

            if (bancoEmpresa >= salario) {
                emp.getAccount().deposit(salario);
                bancoEmpresa -= salario;
                System.out.println("Pagado a " + emp.getName() + " (" + emp.getType() + "): " + salario);
            } else {
                System.out.println("No es suficiente el monto del banco para pagar a todos.");
                break;
            }
            index++;
        } while (index < empleadosPepito.size());

        System.out.println("\nSaldo restante del banco: " + bancoEmpresa);
        System.out.println("--- Saldos finales de empleados ---");
        for (Employee emp : empleadosPepito) {
            System.out.println(emp.getName() + " (" + emp.getType() + "): " + emp.getAccount().getBalance());
        }
    }

    private static double getSalaryByType(Employee.TypeEmployee type) {
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