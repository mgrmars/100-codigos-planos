
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Veintidos {

    /*
    22. Calcular el total que una persona debe pagar en una llantera, si el
    precio de cada llanta es de S/ 800 si se compran menos de 5 llantas y de
    S/ 700 si se compran 5 o más.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int cantidad;

        System.out.println("Ingrese la cantidad de llantas");
        cantidad = scan.nextInt();

        if (cantidad >= 5) {
            System.out.println(cantidad + "x Llantas, Total: " + (700 * cantidad) + ", 700 c/u");
        } else {
            System.out.println(cantidad + "x Llantas, Total: " + (800 * cantidad) + ", 800 c/u");
        }
    }
}
