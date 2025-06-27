package parte8;

public class ExceptionDemo {
    public static void main(String[] args) {
        // Caso 1: Network Timeout
        try {
            simulateNetworkTransfer();
        } catch (NetworkTimeoutException e) {
            System.out.println("Error de red: " + e.getMessage());
        }

        // Caso 2: Número inválido
        try {
            processNumber("abc123");
        } catch (InvalidNumberException e) {
            System.out.println("Número inválido: " + e.getMessage());
        }
    }

    // Simula una transferencia que puede fallar por timeout
    public static void simulateNetworkTransfer() throws NetworkTimeoutException {
        boolean timeout = true; // Simulación
        if (timeout) {
            throw new NetworkTimeoutException("La transferencia falló por timeout de red.");
        }
        System.out.println("Transferencia exitosa.");
    }

    // Procesa un número y lanza excepción si no es válido
    public static void processNumber(String value) throws InvalidNumberException {
        try {
            int number = Integer.parseInt(value);
            System.out.println("Número procesado: " + number);
        } catch (NumberFormatException e) {
            throw new InvalidNumberException("El valor '" + value + "' no es un número válido.");
        }
    }
}