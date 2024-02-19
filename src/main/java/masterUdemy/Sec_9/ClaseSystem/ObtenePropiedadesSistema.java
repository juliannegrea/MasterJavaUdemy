package masterUdemy.Sec_9.ClaseSystem;

import java.util.Properties;

public class ObtenePropiedadesSistema {

    public static void main(String[] args) {


        String userhome = System.getProperty("user.home");
        System.out.println("user.home = " + userhome);


        System.out.println("java.version = " + System.getProperty("java.version"));
        System.out.println("java.class.path = " + System.getProperty("java.class.path"));
        System.out.println("java.home = " + System.getProperty("java.home"));
        System.out.println("java.vendor= " + System.getProperty("java.vendor"));
        System.out.println("java.vendor.url = " + System.getProperty("java.vendor.url"));
        System.out.println("os.arch = " + System.getProperty("os.arch"));
        System.out.println("os.home = " + System.getProperty("os.home"));
        System.out.println("os.version = " + System.getProperty("os.version"));
        System.out.println("os.arch = " + System.getProperty("os.arch"));





    }

}

/*

"file.separator"	Carácter que separa los componentes de una ruta de archivo. Esto es " /" en UNIX y " \" en Windows.
"java.class.path"	Ruta utilizada para buscar directorios y archivos JAR que contengan archivos de clase. Los elementos de la ruta de clase están separados por un carácter específico de la plataforma especificado en la path.separatorpropiedad.
"java.home"	        Directorio de instalación para Java Runtime Environment (JRE)
"java.vendor"	    Nombre del proveedor de JRE
"java.vendor.url"	URL del proveedor de JRE
"java.version"	    Número de versión de JRE
"line.separator"	Secuencia utilizada por el sistema operativo para separar líneas en archivos de texto
"os.arch"	        Arquitectura del sistema operativo
"os.name"	        Nombre del sistema operativo
"os.version"	    Versión del sistema operativo
"path.separator"	Carácter separador de ruta utilizado enjava.class.path
"user.dir"	        Directorio de trabajo del usuario
"user.home"	        Directorio de inicio del usuario
"user.name"	        Nombre de cuenta de usuario
*/