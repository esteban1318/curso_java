
package orientalProyect;

import java.sql.*;

public class dbConexion {

    static String url = "jdbc:mysql://localhost:3306/control_de_acceso";
    static String user = "root";
    static String pass="";

    public static Connection conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url,user,pass);
            System.out.println("conexion exitosa ");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
        return con;

    }

}
