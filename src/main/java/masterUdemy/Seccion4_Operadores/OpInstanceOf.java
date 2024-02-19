package masterUdemy.Seccion4_Operadores;


import java.util.ArrayList;

class Animal {}

class Perro extends Animal {}

class Gato extends Animal {}

public class OpInstanceOf {

    public static void main(String[] args) {
        Animal animal = new Gato();

        // Verificar si 'animal' es una instancia de la clase 'Gato'
        if (animal instanceof Gato) {
            System.out.println("El objeto es un Gato");
        } else {
            System.out.println("El objeto no es un Gato");
        }

        // Verificar si 'animal' es una instancia de la clase 'Perro'
        if (animal instanceof Perro) {
            System.out.println("El objeto es un Perro");
        } else {
            System.out.println("El objeto no es un Perro");
        }
    }





}
