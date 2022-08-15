import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Ocho {

    /*
    8. Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas
    hay en el curso actual. Diseñar un algoritmo para este propósito
    (recuerda que para calcular el porcentaje puedes hacer una regla de 3).
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double ninos, ninas, total;
        double porcentajeNinos, porcentajeNinas;

        System.out.println("Ingresa la cantidad de niños");
        ninos = scan.nextDouble();

        System.out.println("Ingrese la cantidad de niñas");
        ninas = scan.nextDouble();

        total = ninos + ninas;

        porcentajeNinos = Math.round((ninos / total) * 100);
        porcentajeNinas = Math.round((ninas / total) * 100);

        System.out.println("Porcentaje ninos: " + porcentajeNinos + "%");
        System.out.println("Porcentaje ninas: " + porcentajeNinas + "%");
    }

}
