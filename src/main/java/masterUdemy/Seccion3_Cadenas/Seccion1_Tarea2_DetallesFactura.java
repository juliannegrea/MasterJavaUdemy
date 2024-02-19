package masterUdemy.Seccion3_Cadenas;
import java.util.Scanner;

public class Seccion1_Tarea2_DetallesFactura {
    public static void main(String[] args) {

        String nombreFactura;
        double primerPrecio;
        double segundoPrecio;
        double bruto;
        double impuesto = 0.19;
        double neto;


        System.out.println("Intoduzca el nombre de la factura: ");
        Scanner sc = new Scanner(System.in);
        nombreFactura = sc.nextLine();
        System.out.println("Nombre Factura: " + nombreFactura);

        System.out.println("Introduce un primer precio:");
        primerPrecio = sc.nextDouble();
        System.out.println("Introduce un segundo precio:");
        segundoPrecio = sc.nextDouble();
        bruto = primerPrecio+segundoPrecio;
        impuesto = impuesto*bruto;
        neto=bruto + impuesto;

        System.out.println("La factura producto de oficina " + nombreFactura+ " tiene un total bruto de " + bruto +
                " con un impuesto de " + impuesto + " y el neto tota es de " + neto );








    }
}