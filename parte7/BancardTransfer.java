package parte7;

import parte2.Account;

public class BancardTransfer implements ElectronicTransfer {
    @Override
    public void sendTransfer(Account from, Account to, double amount) {
        if (from.getBalance() >= amount) {
            from.withdraw(amount);
            to.deposit(amount);
            System.out.println("Bancard: Transfer successful! Amount: " + amount);
        } else {
            System.out.println("Bancard: Insufficient funds for transfer.");
        }
    }
}