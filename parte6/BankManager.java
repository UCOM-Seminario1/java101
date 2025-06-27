package parte6;

import parte2.Account;

public class BankManager {
    public static void main(String[] args) {
        Account empresa1 = new Account("2001", "Empresa S.A.", 50000.0);
        Account pyme1 = new Account("2002", "Pyme S.R.L.", 20000.0);

        Bank bancoEmpresa = new CompanyBank("Banco Empresarial");
        Bank bancoPyme = new SmallBusinessBank("Banco Pyme");

        System.out.println("Cuenta de empresa:");
        bancoEmpresa.specialFunction(empresa1);
        System.out.println("Saldo actual: " + empresa1.getBalance());

        System.out.println("\nCuenta de pequeña empresa:");
        bancoPyme.specialFunction(pyme1);
        System.out.println("Saldo actual: " + pyme1.getBalance());
    }
}