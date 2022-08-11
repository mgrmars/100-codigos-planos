import java.util.Scanner;

public class Nueve {
    public static void main(String[] args) {
        /*
        Obtener el IGV (18%) de una venta
        si esta es superior a S/ 150,000.00 
        aplicar un descuento del 25 %.
         */
        Scanner s = new Scanner(System.in);
        double venta, igv, descuento, total;

        System.out.println("Ingresa el valor de venta: ");
        venta = s.nextDouble();

        igv = venta * 18;
        descuento = venta > 150000 ? venta * 0.25 : 0;
        total = venta - descuento + igv;

        System.out.println("IGV: " + igv + "\n" + "Descuento: " + "descuento " + "\n" + "Total: " + total);
    }
}
