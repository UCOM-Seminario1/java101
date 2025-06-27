package parte7;

import parte2.Account;

public class TransferManager {
    public static void main(String[] args) {
        Account acc1 = new Account("3001", "Alice", 5000.0);
        Account acc2 = new Account("3002", "Bob", 1000.0);

        ElectronicTransfer bancard = new BancardTransfer();
        ElectronicTransfer continental = new ContinentalTransfer();

        bancard.sendTransfer(acc1, acc2, 2000.0);
        continental.sendTransfer(acc2, acc1, 500.0);

        System.out.println("Alice balance: " + acc1.getBalance());
        System.out.println("Bob balance: " + acc2.getBalance());
    }
}