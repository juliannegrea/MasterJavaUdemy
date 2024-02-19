package masterUdemy.Seccion4_Operadores;

import java.util.Scanner;

public class LoginOperadores {
    public static void main(String[] args) {



        String[] users = {"Palomo","Juan"};
        String[] paswords = {"1234","Temp"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa usuario");
        String user = sc.next();

        System.out.println("Ingresa contraseña");
        String pass = sc.next();

        boolean esAutendticado = false;

        for (int i = 0; i < users.length; i++) {

            if (users[i].equals(user) && paswords[i].equals(pass)){
                esAutendticado = true;
                break;

            }else{
                System.out.println("Username o contraseña incorrectos,vuelve a intoducirlo");
            } ;

        }


        if (esAutendticado){
            System.out.println("Bienvenido" .concat(user));
        }else{
            System.out.println("Aurenticacion incorrecta");
        }

    }
}
