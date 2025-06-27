package parte6;

import parte2.Account;

public class SmallBusinessBank extends Bank {
    public SmallBusinessBank(String bankName) {
        super(bankName);
    }

    @Override
    public void specialFunction(Account account) {
        // Ejemplo: descuento en comisiones
        System.out.println("Descuento en comisiones aplicado para cuenta pequeña empresa.");
    }
}