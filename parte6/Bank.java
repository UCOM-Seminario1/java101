package parte6;

import parte2.Account;

public abstract class Bank {
    protected String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    // Método polimórfico
    public abstract void specialFunction(Account account);
}