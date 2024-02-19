package masterUdemy.Seccion4_Operadores;



public class OpIncrementoDecremento {

    public static void main(String[] args) {
        /*
        ++ incremento -> incrementa y devuelve numero
        -- decremento -> decrementa y devuelve numero
        1++ -> muestra numero e incrementa
        1-- -> muestra numero y decrementa
        */

        int i = 2;
        System.out.println("valor inicial de i:" + i);
        //Pre incremento
        int j = ++i;
        System.out.println("valor pre incremento de i:" +j);
        //Post incremento
        int y = i++;
        System.out.println("valor post incremento de i:" + y);
        //Pre decremento
        int e = --i;
        System.out.println("valor pre decremento de i = " + e);
        //Post decremento
        int b = i--;
        System.out.println("valor post decremnto de i = " + b);







    }
}
