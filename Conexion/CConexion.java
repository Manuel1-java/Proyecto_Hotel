
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

import java.sql.Connection;
import javax.swing.JOptionPane;

public class CConexion {    
    public static Connection conectar = null;
    public static Connection estableceConexion(){
        
        String usuario = "root";
        String contraseña = "andres_lopez17";
        String bd = "hotel";
        String ip = "localhost";
        String puerto = "3306";
    
        String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contraseña);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se conectó a la base de datos, error:" + e.toString());
        }
        return conectar;
    }
    public static void main(String a4rgs []){
        CConexion conexion = new CConexion();
        conexion.estableceConexion();
    }
    public static Connection getConexion(){
        return conectar;
    }
}