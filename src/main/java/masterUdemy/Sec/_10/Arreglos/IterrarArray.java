package masterUdemy.Sec._10.Arreglos;

public class IterrarArray {


    public static void main(String[] args) {

        String[] productosTecnologicos = {
                "Teléfono inteligente",
                "Portátil",
                "Tableta",
                "Auriculares inalámbricos",
                "Smartwatch",
                "Cámara digital",
                "Router WiFi",
                "Altavoz Bluetooth",
                "Impresora 3D",
                "Consola de videojuegos"
        };

        //Iterar con for
        System.out.println("For");
        for (int i= 0; i< productosTecnologicos.length; i++){
            System.out.println("productosTecnologicos["+i+"] = " + productosTecnologicos[i]);
        }

        //Iterar con foreach
        System.out.println("ForEach");
        for (String prod:productosTecnologicos) {
            System.out.println("prod = " + prod);
        }


    }


}
