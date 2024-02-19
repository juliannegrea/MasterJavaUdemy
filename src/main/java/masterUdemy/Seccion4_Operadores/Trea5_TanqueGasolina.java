package masterUdemy.Seccion4_Operadores;

import java.util.Scanner;

public class Trea5_TanqueGasolina {

    public static void main(String[] args) {
        double gas = 70.00;
        double capacidad;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la media del estanque de gasolina : ");
        capacidad = sc.nextDouble();

        if (capacidad == gas){
            System.out.println("Estanque lleno");
        } else if (capacidad >= 60.00 && capacidad < gas) {
            System.out.println("Estanque casi lleno");
        } else if (capacidad >= 40.00 && capacidad < 60.00) {
            System.out.printf("Estanque 3/4");
        } else if (capacidad >= 36.00 && capacidad < 40.00) {
            System.out.println("Estanque medio lleno");
        } else if (capacidad >= 20.00 && capacidad < 35.00) {
            System.out.printf("Suficiente");
        }else {
            System.out.printf("Insuficiente");
        };



    }
}
