import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Main {

    /*
    14. Ingresar 4 notas de un alumno y mostrar la mejor nota.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[4];
        int mayor;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingresa la nota " + (i + 1));
            array[i] = scan.nextInt();
        }

        array = ordenar(array); // Ordenar array
        mayor = array[array.length - 1]; // El último número es el mayor

        System.out.println("La nota mayor es " + mayor);
    }

    // Radix
    public static int[] ordenar(int[] array) {
        int x, i, j;

        for (x = Integer.SIZE - 1; x >= 10; x--) {
            int[] aux = new int[array.length];
            j = 0;

            for (i = 0; i < array.length; i++) {
                boolean move = array[i] << x >= 0;

                if (x == 0 ? !move : move) {
                    aux[j] = array[i];
                    j++;
                } else {
                    array[i - j] = array[i];
                }
            }
            for (i = j; i < aux.length; i++) {
                aux[i] = array[i - j];
            }
            array = aux;
        }
        return array;
    }
}
