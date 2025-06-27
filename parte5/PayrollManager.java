package parte5;

import parte3.Employee;
import parte3.Employee.TypeEmployee;
import java.util.List;
import java.util.Arrays;

public class PayrollManager {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ana", TypeEmployee.INTERN, "1001", 0.0);
        Employee e2 = new Employee("Luis", TypeEmployee.STAFF, "1002", 0.0);
        Employee e3 = new Employee("Sofia", TypeEmployee.MANAGER, "1003", 0.0);
        Employee e4 = new Employee("Carlos", TypeEmployee.STAFF, "1004", 0.0);
        Employee e5 = new Employee("Maria", TypeEmployee.INTERN, "1005", 0.0);

        List<Employee> empleadosPepito = Arrays.asList(e1, e2, e3, e4, e5);

        Payroll payroll = new Payroll(empleadosPepito);
        payroll.processPayroll();
        
        
        // mostrar el mismo proceso utilizando un bucle while
        System.out.println("\n--- Proceso con bucle while ---");
        int index = 0;
        while (index < empleadosPepito.size()) {
            Employee emp = empleadosPepito.get(index);
            System.out.println(emp.getName() + " (" + emp.getType() + "): " + emp.getAccount().getBalance());
            index++;            
        }


        // Mostrar saldo final de cada empleado
        // System.out.println("\n--- Saldos finales ---");
        // for (Employee emp : empleadosPepito) {
        //     System.out.println(emp.getName() + " (" + emp.getType() + "): " + emp.getAccount().getBalance());
        // }

     
}
}