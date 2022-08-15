import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Dieciceis {

    /*
     16. Determinar si un alumno aprueba o reprueba un curso
    sabiendo que aprobara si su promedio de tres calificaciones
    es mayor o igual a 17; reprueba en caso contrario.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        // Variables necesarios
        double promedio = 0;
        double[] notas = new double[3];

        // Obtener datos
        System.out.println("Ingresa la primera nota");
        notas[0] = scan.nextDouble();

        System.out.println("Ingresa la segunda nota");
        notas[1] = scan.nextDouble();

        System.out.println("Ingresa la tercera nota");
        notas[2] = scan.nextDouble();

        // Realizar lo que me piden
        for (double nota : notas) {
            promedio += nota;
        }
        promedio /= 3;
       
        if (promedio >= 17) {
            // Mostrar los datos
            System.out.println("Aprobó con " + promedio);
        } else {
            // Mostrar los datos
            System.out.println("Desaprobó con " + promedio);
        }
    }
}
