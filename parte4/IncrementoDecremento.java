package parte4;

public class IncrementoDecremento {
    public static void main(String[] args) {
        // Explicación:
        // ++ Preincremento (++a): Incrementar a en 1, después utilizar el nuevo valor de a en la expresión en que esta variable reside.
        // ++ Postincremento (a++): Usar el valor actual de a en la expresión en la que esta variable reside, después incrementar a en 1.
        // -- Predecremento (--b): Decrementar b en 1, después utilizar el nuevo valor de b en la expresión en que esta variable reside.
        // -- Postdecremento (b--): Usar el valor actual de b en la expresión en la que esta variable reside, después decrementar b en 1.

        int x = 5;
        int y = 5;

        // Postfijo: x++
        System.out.println("Valor inicial de x: " + x);
        System.out.println("x++: " + (x++)); // Imprime 5, luego x = 6
        System.out.println("Valor de x después de x++: " + x); // 6

        // Prefijo: ++y
        System.out.println("Valor inicial de y: " + y);
        System.out.println("++y: " + (++y)); // y = 6, luego imprime 6
        System.out.println("Valor de y después de ++y: " + y); // 6

        // Postfijo: x--
        System.out.println("x--: " + (x--)); // Imprime 6, luego x = 5
        System.out.println("Valor de x después de x--: " + x); // 5

        // Prefijo: --y
        System.out.println("--y: " + (--y)); // y = 5, luego imprime 5
        System.out.println("Valor de y después de --y: " + y); // 5

        // Combinaciones con operaciones
        int a = 3, b = 4;
        int resultado = ++a * b--; // a=4, b=4, resultado=4*4=16, luego b=3
        System.out.println("++a * b-- = " + resultado + " (a=" + a + ", b=" + b + ")");

        // Operadores aritméticos y relacionales
        int m = 7, n = 2;
        System.out.println("m * n = " + (m * n)); // multiplicativo
        System.out.println("m + n = " + (m + n)); // aditivo
        System.out.println("m > n: " + (m > n)); // relacional
        System.out.println("m == n: " + (m == n)); // igualdad

        // Operador condicional ?:
        int edad = 18;
        String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println("¿Es mayor de edad? " + mensaje);

        // Operadores de asignación combinados
        int z = 10;
        z += 5; // z = z + 5
        System.out.println("z += 5 -> z = " + z);
        z *= 2; // z = z * 2
        System.out.println("z *= 2 -> z = " + z);
    }
}