import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Main {

    /*
    7. Algoritmo que lea dos números, calculando y escribiendo el valor de
    su suma, resta, producto y división.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x, y;

        System.out.println("Ingresa el primer número");
        x = scan.nextInt();

        System.out.println("Ingresa el segundo número");
        y = scan.nextInt();

        suma(x, y);
        resta(x, y);
        producto(x, y);
        division(x, y);
    }

    static void suma(int x, int y) {
        System.out.println(x + " + " + y + " = " + (x + y));
    }

    static void resta(int x, int y) {
        System.out.println(x + " – " + y + " = " + (x - y));
    }

    // multiplicación
    static void producto(int x, int y) {
        System.out.println(x + " × " + y + " = " + (x * y));
    }

    static void division(double x, double y) {
        double r = x / y; // resultado
        if (x == 0 || y == 0) {
            System.out.println(x + " ÷ " + y + " = " + "0");
        } else {
            System.out.println(x + " ÷ " + y + " = " + r);
        }
    }
}
