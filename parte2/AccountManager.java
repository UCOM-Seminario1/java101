package parte2;

public class AccountManager {
    public static void main(String[] args) {
        // Crear una cuenta
        Account account = new Account("123456789", "John Doe", 1000.0);     
        // Depositar en la cuenta
        account.deposit(500.0);
        // Retirar de la cuenta
        account.withdraw(200.0);
        // Mostrar el saldo actual
        System.out.println("Saldo actual: " + account.getBalance());
        // Mostrar información de la cuenta
        System.out.println("Número de cuenta: " + account.getAccountNumber());
        System.out.println("Titular de la cuenta: " + account.getAccountHolderName());  
        // Intentar retirar más de lo que hay en la cuenta
        account.withdraw(1500.0); // Esto debería mostrar un mensaje de error
        // Intentar depositar una cantidad negativa
        account.deposit(-100.0); // Esto debería mostrar un mensaje de error
        // Mostrar el saldo final
        System.out.println("Saldo final: " + account.getBalance());
    }
}
