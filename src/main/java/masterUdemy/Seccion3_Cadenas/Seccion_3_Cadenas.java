package masterUdemy.Seccion3_Cadenas;

public class Seccion_3_Cadenas {
    public static void main(String[] args) {

        String cadena_1 = "Polla gorda"; //premetevo
        String cadena_2 = new String("Polla gorda"); //referencia

        System.out.println("cadena_1 es igual a cadena_2 " + (cadena_1 == cadena_2));
        System.out.println(cadena_1.equals(cadena_2));
        System.out.println(cadena_1.getClass());
        System.out.println(cadena_2.getClass());

    }
}
