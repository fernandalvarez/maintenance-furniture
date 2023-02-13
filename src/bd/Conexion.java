package bd;

import java.sql.*;

public class Conexion {
    public static Connection con = null;

    public static Connection conectar() throws SQLException{
        String url = "";
        String user = "";
        String pass = "";

        return con = DriverManager.getConnection(url, user, pass);
    }
}