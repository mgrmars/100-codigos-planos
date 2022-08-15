import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Main {

    /*
    12. Dado un número natural de dos cifras, diseñe un algoritmo que permita
    obtener el número invertido. Ejemplo si se ingresa 23 que se muestre 32.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String numero;
        String numeroInvertido;
        int x;
        
        System.out.println("Ingresa un número natural de dos cifras");
        x = scan.nextInt();

        
        if (x < 100 && x > 0) {
            
            // Se convierte a un String
            numero = String.valueOf(x);
          
            /* Invertimos los caracteres usando su índice
            
            Ejemplo: 
         
            String: 2 5
            Indice: 0 1
             
            String: 5 2
            Indice: 1 0 */
            numeroInvertido = String.valueOf(numero.charAt(1) + "" + numero.charAt(0)); 
            
            // Mostramos el número y número invertido
            System.out.println(numero + " " + numeroInvertido);
        } else {
            System.out.println("El número tiene que tener 2 cifras");
        }
    }
}
