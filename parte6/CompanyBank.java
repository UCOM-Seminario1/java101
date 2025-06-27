package parte6;

import parte2.Account;

public class CompanyBank extends Bank {
    public CompanyBank(String bankName) {
        super(bankName);
    }

    @Override
    public void specialFunction(Account account) {
        // Ejemplo: bonificación especial para cuentas de empresa
        double bonus = 1000.0;
        account.deposit(bonus);
        System.out.println("Bonificación de empresa depositada: " + bonus);
    }
}