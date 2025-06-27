package parte7;

import parte2.Account;

public interface ElectronicTransfer {
    void sendTransfer(Account from, Account to, double amount);
}