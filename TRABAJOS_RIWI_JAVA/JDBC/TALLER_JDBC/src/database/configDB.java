package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class configDB {
    // CONFIGURANDO LA BASE DE DATOS

    static Connection objConnection = null;

    public static  Connection openConnection (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/book";
            String user = "root";
            String password = "";

            objConnection = (Connection) DriverManager.getConnection(url,user,password);
            System.out.println("Conexion establecida sin errores");
        }catch(ClassNotFoundException e) {
            System.out.println("Error, Drivers no instalado");
        }catch (SQLException e) {
            System.out.println("ERROR --> No se pudo cestablecer conexion con la dase de datos");
        }

        return objConnection;
    }

    public static void closeConnection () {
        try{
           if (objConnection != null) objConnection.close();
        }catch (SQLException e) {
            System.out.println("ERROR" + e.getMessage());
        }
    }
}

// SE TERMINA LA CONFIGURACION DE LA CONEXION CON LA BASE DE DATOS 👍🏼