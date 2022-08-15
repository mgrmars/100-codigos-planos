import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Dieciocho {

    public static void main(String[] args) {

        /*
        18. Una persona enferma, que pesa 70 kg, se encuentra en reposo
        y desea saber cuántas calorías consume su cuerpo durante todo el tiempo <-- Desea saber cuantas calorias consume su cuerpo
        que realice una misma actividad. Las actividades que tiene permitido
        realizar son únicamente dormir o estar sentado en reposo. Los datos que
        tiene son que estando dormido consume 1.08 calorías por minuto y estando
        sentado en reposo consume 1.66 calorías por minuto.
         */
        Scanner s = new Scanner(System.in);

        String actividad;

        int peso = 70; // no se usa
        int tiempo; // en minutos

        double dormir = 1.08; // calorias / minuto
        double sentar = 1.66;

        double total = 0;

        System.out.println("Ingresa la actividad a realizar \"dormir\", \"sentar\"");
        actividad = s.nextLine();
    
        // actividad no es "dormir" o "sentar"
        if (!(actividad.equals("dormir") || actividad.equals("sentar"))) {
            System.out.println(actividad + " no es una actividad predefinida");
            System.exit(0); // Salir del programa
        }

        System.out.println("Ingresa el tiempo (en minutos) en el que realizaras la actividad");
        tiempo = s.nextInt();

        if (actividad.equals("dormir")) {
            total = dormir * tiempo;
        } else {
            total = sentar * tiempo;
        }

        System.out.println("Quemarás " + total + " calorias en " + tiempo + " minutos.");
    }
}
