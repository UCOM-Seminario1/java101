package parte1;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Operador AND lógico
        boolean andResult = a && b;
        System.out.println("Resultado de a && b: " + andResult);

        // Operador OR lógico
        boolean orResult = a || b;
        System.out.println("Resultado de a || b: " + orResult);

        // Operador NOT lógico
        boolean notA = !a;
        System.out.println("Resultado de !a: " + notA);
    }
}
