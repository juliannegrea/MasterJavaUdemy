package masterUdemy.Sec._10.Arreglos;

public class ArrayEnteros {

    public static void main(String[] args) {

        int []  numbers = new  int [4]; //declaramos una array de tipo entero de 4-1 posiciones

        //rellenar a mano array mediante indices
        numbers [0] = 1;
        numbers [1] = Integer.valueOf("5"); //metodo estatico de clase Integer que convierte a entero un numero que se le pasa como cadena
        numbers [2] = 3;
        numbers [3] = 4;
        
        int i = numbers[0];
        int j = numbers[1];
        int k = numbers[2];
        int l = numbers[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);



    }
}
