import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Setentayciete {

    /*
    77. Ingresar dos números entero y luego determinar y mostrar:
        a. Si el primero es divisible por el segundo
        b. Si el segundo es divisible por el primero
        c. Cuál de los dos es mayor; en caso que sean iguales, mostrar mensaje
        adecuado
        d. Si ambos son impares
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x, y;

        System.out.println("Ingresa los números");
        x = scan.nextInt();
        y = scan.nextInt();

        if (x % y == 0) {
            System.out.println("X(%d) es divisible entre Y(%d)".formatted(x, y));
        } else {
            System.out.println("X(%d) no es divisible entre Y(%d)".formatted(x, y));
        }

        if (y % x == 0) {
            System.out.println("Y(%d) es divisible entre X(%d)".formatted(y, x));
        } else {
            System.out.println("Y(%d) no es divisible entre X(%d)".formatted(y, x));
        }

        if (x > y) {
            System.out.println("X(%d) es el número mayor".formatted(x));
        } else if (y > x) {
            System.out.println("Y(%d) es el número mayor".formatted(y));
        } else {
            System.out.println("X(%d) e Y(%d) son números iguales".formatted(x, y));
        }

        if ((x % 2 == 0) && (y % 2 == 0)) {
            System.out.println("X(%x) e Y(%d) son pares".formatted(x, y));
        } else {
            System.out.println("X(%x) e Y(%d) son inpares".formatted(x, y));
        }
    }
}
