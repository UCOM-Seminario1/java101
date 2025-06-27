package parte7;

import parte2.Account;

public class ContinentalTransfer implements ElectronicTransfer {
    @Override
    public void sendTransfer(Account from, Account to, double amount) {
        if (from.getBalance() >= amount) {
            from.withdraw(amount);
            to.deposit(amount);
            System.out.println("Continental: Transfer completed! Amount: " + amount);
        } else {
            System.out.println("Continental: Not enough balance for transfer.");
        }
    }
}