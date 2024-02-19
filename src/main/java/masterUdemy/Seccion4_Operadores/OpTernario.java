package masterUdemy.Seccion4_Operadores;

import java.util.Scanner;

public class OpTernario {

    public static void main(String[] args) {

        /*El operador ternario en Java es una forma abreviada de escribir una expresión condicional
          resultado = condicion ? valorSiVerdadero : valorSiFalso;
        int n = 10;
         String mensaje = (n > 5) ? "Verdadero" : "Falso";
         System.out.println("mensaje = " + mensaje);*/

        String estado = "";
        double media = 5.0; //suma_notas / cantidad de asignaturas
        double mates = 0.0;
        double literatura = 0.0;
        double historia = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa nota mates: ");
        mates = sc.nextDouble();
        System.out.println("Ingresa nota literatura: ");
        literatura = sc.nextDouble();
        System.out.println("Ingresa nota mates: ");
        historia = sc.nextDouble();
        media = (mates + literatura + historia)/3;
        estado = (media >= 5.0) ? "Aproved" : "Rejected";
        System.out.println("La media es de" + media + "el estado es:" + estado);







    }
}
