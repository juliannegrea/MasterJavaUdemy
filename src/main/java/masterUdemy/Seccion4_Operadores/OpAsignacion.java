package masterUdemy.Seccion4_Operadores;

public class OpAsignacion {
    public static void main(String[] args) {
        /*Los operadores de asignación en Java se utilizan para asignar valores a variables.
        =   -> y = 2
        +=  -> y+=2 -> y = y+2
        -=  -> y-=2 -> y = y-2
        /=  -> y/=2 -> y = y/2
        %=  -> y%=2 -> y = y%2
        *=  -> y*=2 -> y = y*2
        */


        String sql_query = "select from clientes as c"; // aqui asignm
        sql_query += " where c.nombre = 'Andres";
        sql_query += " and c.activo = 1";


        System.out.println("sql_query = " + sql_query);



    }
}
