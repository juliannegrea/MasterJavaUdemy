package masterUdemy.Seccion3_Cadenas;

public class Inmutabilidad {

    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Juan Primico";

        System.out.println(curso +" " +profesor);
        String result = curso.concat(profesor); // aqui el objeto es inmutable porque se crea otro objeto con el resultado de la operacion
        System.out.println(result);

    }
}
