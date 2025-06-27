package parte3;

import parte2.Account;

public class Employee {
    public enum TypeEmployee {
        INTERN,
        STAFF,
        MANAGER
    }

    private String name;
    private TypeEmployee type;
    private Account account;

    public Employee(String name, TypeEmployee type, String accountNumber, double initialBalance) {
        this.name = name;
        this.type = type;
        this.account = new Account(accountNumber, name, initialBalance);
    }

    public String getName() {
        return name;
    }

    public TypeEmployee getType() {
        return type;
    }

    public Account getAccount() {
        return account;
    }
}