package parte1;

public class OperadoresAsignacion {
    public static void main(String[] args) {

        int c = 3, d = 5, e = 4, f = 6, g = 12;

        // Operador +=
        c += 7; // c = c + 7
        System.out.println("c += 7  -> c = " + c); // 10

        // Operador -=
        d -= 4; // d = d - 4
        System.out.println("d -= 4  -> d = " + d); // 1

        // Operador *=
        e *= 5; // e = e * 5
        System.out.println("e *= 5  -> e = " + e); // 20

        // Operador /=
        f /= 3; // f = f / 3
        System.out.println("f /= 3  -> f = " + f); // 2

        // Operador %=
        g %= 9; // g = g % 9
        System.out.println("g %= 9  -> g = " + g); // 3
    }
}