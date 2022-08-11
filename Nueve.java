import java.util.Scanner;

public class Nueve {

    public static void main(String[] args) {
        /*
        Obtener el IGV (18%) de una venta
        si esta es superior a S/ 150,000.00 
        aplicar un descuento del 25 %.
         */

        Scanner s = new Scanner(System.in);

        final double IGV = 0.18;
        final double DESCUENTO = 0.25;
        double venta = 0;
        double igv = 0;
        double descuento = 0;
        double total = 0;

        System.out.println("Ingresa el valor de venta: ");
        venta = s.nextDouble();

        igv = venta * IGV;
        descuento = venta > 150000 ? venta * DESCUENTO : 0;
        total = venta - descuento + igv;

        System.out.println("IGV: " + igv);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total: " + total);
        
    }
}
