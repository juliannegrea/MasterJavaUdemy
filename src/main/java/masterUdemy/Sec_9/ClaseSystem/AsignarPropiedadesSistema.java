package masterUdemy.Sec_9.ClaseSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//Crear arcvhivo.properties leer y cargarlo ene l proyecto con clase Properties


public class AsignarPropiedadesSistema {
    public static void main(String[] args) {

        //Declaramos objeto de la clase
        Properties pr = new Properties();

        /*1.Declaramos objeto Properties prop
         * 2.Declaramos objeto que lee de FileInputStream(ruta arch config)
         * 3.Cargamos con load(reader) a traves del objeto de la clase Poperties
         * 4.Cerramos stream lectura abierto con FileInputStream
         * 5.Obtenemos las prperties a traves de getProperty(key)
         * */
        try{
            FileInputStream reader = new FileInputStream("src/main/resources/config.properties"); //objeto reader es el que contiene la lectura en bytes del archvip
            pr.load(reader);
            reader.close(); //cerramos el buffer

            String dbURL = pr.getProperty("db.url"); //obtenemos el archivo de configuracion mediante su clave
            String dbUsername = pr.getProperty("db.username");
            String dbPassword = pr.getProperty("db.password");

            System.out.println("dbURL = " + dbURL);
            System.out.println("dbUsername= " + dbUsername);
            System.out.println("dbPassword = " + dbPassword);


        } catch (FileNotFoundException e) { //Excepcion de tipo FileNotFound por si no se encuentra el archivo descrito
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e); //Expepcion de tipo IOExcepcion por si se inturrumpe la ejecucion
        }


    }
}
