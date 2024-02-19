package masterUdemy.Seccion4_Operadores;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tarea4_NumerosOrdenados {
    public static void main(String[] args) {


        int fNumber;
        int sNumber;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir primer numero: ");
        fNumber = sc.nextInt();

        System.out.println("Introducir segundo numero: ");
        sNumber = sc.nextInt();

        if (fNumber > sNumber){
            System.out.println("Lista ordenados " + fNumber + " " + sNumber);
        }else {
            System.out.println("Lista ordenados " + sNumber + " " +  fNumber);
        }

    }
}
