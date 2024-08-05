package Controlador;

import java.sql.*;
import javax.swing.JOptionPane;
import Vista.Login;
import Conexion.CConexion;
import Vista.Empleados;
import Vista.Interface;

public class ControladorLogin {
    private Connection conn = CConexion.estableceConexion();
    private Interface r = new Interface();
    private Empleados e = new Empleados();
    
    public boolean verificacion(){
        if(verificacionRe()){            
            r.setLocation(250,75); 
            r.setVisible(true);
            return true;
        }else if(verificacionGe()){                  
            e.setLocation(250,75); 
            e.setVisible(true);  
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Usuario y/o Contraseña son incorrectos");
            return false;
        }
    }
    
    public boolean verificacionRe(){
        try{                
            String consulta = "SELECT correoE, contraseña FROM recepcionista WHERE correoE = ? AND contraseña = ? ";
            PreparedStatement pstmt = conn.prepareStatement(consulta);
            pstmt.setString(1, Login.txtUsuario.getText());
            pstmt.setString(2, Login.txtContraseña.getText());
            ResultSet resultado = pstmt.executeQuery();
            if (resultado.next()) {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.toString());
            return false;
        }
        return false;
    }
    
    public boolean verificacionGe(){
        try {
            String consulta = "SELECT correoE, contraseña FROM gerente WHERE correoE = ? AND contraseña = ? ";
            PreparedStatement pstmt = conn.prepareStatement(consulta);
            pstmt.setString(1, Login.txtUsuario.getText());
            pstmt.setString(2, Login.txtContraseña.getText());
            ResultSet resultado = pstmt.executeQuery();
            if (resultado.next()) {
                return true;
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + ex.toString());
                return false;
        }
        return false;
    }
}
