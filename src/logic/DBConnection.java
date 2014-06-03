package logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Tarde on 8/05/14.
 */
public class DBConnection {

    static String host      = "192.168.0.201"; //"10.0.2.2"; //Poner 10.0.0.2 cuando el serv. MySQL es LocalHost
    static String baseDatos = "PokeIndex";
    static String usuario   = "root";
    static String password  = "gominola";
    static String cadCon	= "jdbc:mysql://"+host+"/"+baseDatos;

    public static Connection c;
    public static Statement st;
    /**
     * Crea la conexion con la BBD
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws java.sql.SQLException
     */
    public static void crearConexion() throws InstantiationException, IllegalAccessException, ClassNotFoundException {

        Class.forName( "com.mysql.jdbc.Driver").newInstance();

        try{
            c = DriverManager.getConnection(cadCon, usuario, password);
            st = c.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Cierra la conexion con la BBDD
     */
    public static void cerrarConexion() {
        try {
            if (st != null) {
                st.close();
            }
            if (c != null) {
                c.close();
            }
        } catch (SQLException e) {
        }
    }

    public ResultSet executeQuery(String q) {
        ResultSet rs = null;
        try {
             rs = st.executeQuery(q);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
