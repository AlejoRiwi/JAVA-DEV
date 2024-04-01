package database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDB {
    static Connection objConnection = null;
    public static Connection openConnection () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/book";
            String user = "root";
            String password = "Rlwl2023.";

            objConnection = (Connection) DriverManager.getConnection(url, user,password);
            System.out.println("Conexion establecida correctamente");
        }catch (ClassNotFoundException e) {
            System.out.println("Error, Drivers no instalado");
        } catch (SQLException e){
            System.out.println("ERROR --> No se pudo cestablecer conexion con la dase de datos" + e.getMessage());
        }
        return objConnection;
    }

    public static void closeConnection () {
        try {
            if (objConnection != null ) objConnection.close();
        } catch (SQLException e) {
            System.out.println();
        }
    }
}
