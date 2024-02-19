package masterUdemy.Sec._10.Arreglos;

public class InterrandoArrayInverso {
    public static void main(String[] args) {

        /*Explicacion Logica
         * 1.Compprobar ultimo indice arr.length-1 porque los indices empiezan por 0
         * 2.Comprobar que i>=0
         * 3.Decrementar i--
         * */


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

        //Recorrer Array Orden Inverso la iteracion inversa
        for (int y = productosTecnologicos.length -1; y>=0;y--) {
            System.out.println("prductosTecnologicos["+ y +"]= " + productosTecnologicos[y]);
        }

        //Imprimir Orden Array Inverso la iteracion es normal cambia la forma de imprimirlo
       for (int i= 0; i< productosTecnologicos.length; i++){
            //Imprimir array al reves array.length-1-i
            System.out.println("productosTecnologicos["+i+"] = " + productosTecnologicos[productosTecnologicos.length - 1- i]);
       }


    }


}
