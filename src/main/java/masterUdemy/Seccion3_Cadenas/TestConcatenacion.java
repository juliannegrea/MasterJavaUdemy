package masterUdemy.Seccion3_Cadenas;

public class TestConcatenacion {
    public static void main(String[] args) {
        String a = "A";
        String b = "B";
        String c = a;

        StringBuilder str = new StringBuilder();
        //long inicio = System.currentTimeMillis();

        for (int i = 0; i < 500 ; i++) {

            //c= c.concat(a).concat(b).concat("\n");
            str.append(a);
            str.append(b);
            str.append(c + "\n");

        }

        //long fin = System.currentTimeMillis();
       // System.out.printf(String.valueOf(fin - inicio));
        System.out.println("\n" + str);



    }
}
