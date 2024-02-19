package masterUdemy.Seccion4_Operadores;

import java.util.Scanner;

public class OpTernarioNumeroMayor {

    public static void main(String[] args) {

        int i = 0;
        int x = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero " );
        i = sc.nextInt();
        System.out.println("Ingresa un numero " );
        x = sc.nextInt();

        String message = i>x ? "El numero mayor es " + i : "El numero mayor es " + x;
        System.out.println("message = " + message);




        


    }
}
