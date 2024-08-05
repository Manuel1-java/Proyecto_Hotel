
package Controlador;

import Conexion.CConexion;
import Modelo.Recepcionista;
import Vista.AgregarEmpleado;
import Vista.AgregarGerente;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class ControladorEmpleadosAgregar {
    private static Connection conn = CConexion.estableceConexion();
    
    public static void guardar(){
        if(AgregarEmpleado.cboCarrera.getSelectedItem() == "Recepcionista"){            
            if(agregarRecepcionista()){
            ControladorEmpleados.listar();
            }
        }else{
            if(agregarEmpleado()){
            ControladorEmpleados.listar();
            }
        }
        AgregarEmpleado ae = new AgregarEmpleado();
        ae.dispose();
    }
    
    public static void limpiar(){
        DefaultComboBoxModel model = new DefaultComboBoxModel();        
        AgregarEmpleado.txtNombre.setText("");
        AgregarEmpleado.txtApellidoP.setText("");
        AgregarEmpleado.txtApellidoM.setText("");
        AgregarEmpleado.txtNControl.setText("");
        AgregarEmpleado.txtCorreoE.setText("");
        AgregarEmpleado.txtContraseña.setText("");
        AgregarEmpleado.calendario.setText("");      
        model.addElement("Seleccionar");
        model.addElement("Recepcionista");
        model.addElement("Camarerista");
        model.addElement("Intendencia");
        model.addElement("Jardinería");
        model.addElement("Lavandería");
        model.addElement("Botón");
        AgregarEmpleado.cboCarrera.setModel(model);
        if(AgregarEmpleado.txtNombre.getText().equals("")){
            AgregarEmpleado.txtNombre.setText("Ej. Ian Andrés");
            AgregarEmpleado.txtNombre.setForeground(Color.gray);
        }
        if(AgregarEmpleado.txtCorreoE.getText().equals("")){
            AgregarEmpleado.txtCorreoE.setText("Ej. ianandres111@gmail.com");
            AgregarEmpleado.txtCorreoE.setForeground(Color.gray);
        }
        if(AgregarEmpleado.calendario.getText().equals("")){
            AgregarEmpleado.calendario.setText("Ej. 2000-01-01");
            AgregarEmpleado.calendario.setForeground(Color.gray);
        }
        if(AgregarEmpleado.txtApellidoP.getText().equals("")){
            AgregarEmpleado.txtApellidoP.setText("Ej. López");
            AgregarEmpleado.txtApellidoP.setForeground(Color.gray);
        }
        if(AgregarEmpleado.txtApellidoM.getText().equals("")){
            AgregarEmpleado.txtApellidoM.setText("Ej. Rosas");
            AgregarEmpleado.txtApellidoM.setForeground(Color.gray);
        }
        if(AgregarEmpleado.txtNControl.getText().equals("")){
            AgregarEmpleado.txtNControl.setText("Ej. 22161128");
            AgregarEmpleado.txtNControl.setForeground(Color.gray);
        }
        if(AgregarEmpleado.txtContraseña.getText().equals("")){
            AgregarEmpleado.txtContraseña.setText("********");
            AgregarEmpleado.txtContraseña.setForeground(Color.gray);
        }
    }
    
    public static boolean validarCorreoE() {
        String c = AgregarEmpleado.txtCorreoE.getText();
        List<String> dominiosValidos = Arrays.asList("@gmail.com", "@yahoo.com", "@hotmail.com", "@itoaxaca.edu.mx");
        int ind = c.indexOf("@");
        int a = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
    
        while (a < c.length()) {
            char caracter = c.charAt(a);
            if (caracter == '@') {
                cont3++;
            } else if (!Character.isLetterOrDigit(caracter) && caracter != '.' && caracter != '_') {
                JOptionPane.showMessageDialog(null, "No se permiten caracteres especiales");
                return false;
            } else if (Character.isUpperCase(caracter)) {
                cont1++;
            } else if (Character.isLowerCase(caracter)) {
                cont2++;
            }
            a++;
        }
    
        if (ind > 0 && ind < c.length() - 1) {
            String dominio = c.substring(ind + 1).toLowerCase();
            if (!dominiosValidos.contains("@" + dominio)) {
                JOptionPane.showMessageDialog(null, "Dominio no válido");
                return false;
            }
        }
    
        if (cont1 < 1) {
            JOptionPane.showMessageDialog(null, "Ingresa al menos una mayúscula en el correo electrónico");
            return false;
        }
    
        if (cont2 < 1) {
            JOptionPane.showMessageDialog(null, "Ingresa al menos una minúscula en el correo electrónico");
            return false;
        }
    
        if (cont3 > 1) {
            JOptionPane.showMessageDialog(null, "Ingresa solo un arroba en el correo electrónico");
            return false;
        }
    
        return true;
    }
    
    public static boolean validarContraseña(){
        String c = AgregarEmpleado.txtContraseña.getText();
        if(c.length() != 8){            
            JOptionPane.showMessageDialog(null, "Ingresa una contraseña con una longitud de 8");
            return false;
        }
        int b = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;   
        
        for (int i = 0; i < c.length(); i++) {
            char caracter = c.charAt(i);            
            if (Character.isUpperCase(caracter)) {
                cont1++;
            } else if (Character.isLowerCase(caracter)) {
                cont2++;
            } else if (Character.isDigit(caracter)) {
                cont3++;
            } else if (!Character.isLetterOrDigit(caracter)) {
                cont4++;
            }
        }   
        
        if(cont1 < 1){
            JOptionPane.showMessageDialog(null, "Ingresa al menos una mayuscula en la contraseña");
            return false;
        }else if(cont2 < 1){
            JOptionPane.showMessageDialog(null, "Ingresa al menos una minuscula en la contraseña");
            return false;
        }else if(cont3 < 1){
            JOptionPane.showMessageDialog(null, "Ingresa al menos un número en la contraseña");
            return false;
        }else if(cont4 < 1){
            JOptionPane.showMessageDialog(null, "Ingresa al menos un caracter especial en la contraseña");
            return false;
        }else{
            return true;
        }
    }
    
    public static void agregarr(){        
        AgregarEmpleado em = new AgregarEmpleado();
        em.setVisible(true);
    }
    
    public static void agregarrr(){        
        AgregarGerente em = new AgregarGerente();
        em.setVisible(true);
    }
    
    public static void agregar(){
        if(validarContraseña() && validarCorreoE()){
            if(AgregarEmpleado.cboCarrera.getSelectedItem().equals("Recepcionista")){
                agregarRecepcionista();
            }else{
                agregarEmpleado();
            }
        }
    }
    
    public static boolean agregarRecepcionista(){
        Recepcionista x = new Recepcionista();
        String consulta = "insert into recepcionista (idRecepcionista, Nombre, Apellido_P, Apellido_M, fecha_Nacimiento, correoE, Contraseña)values (?,?,?,?,?,?,?) ";
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setInt(1, Integer.parseInt(AgregarEmpleado.txtNControl.getText()));
            ps.setString(2, AgregarEmpleado.txtNombre.getText());
            ps.setString(3, AgregarEmpleado.txtApellidoP.getText());
            ps.setString(4, AgregarEmpleado.txtApellidoM.getText());
            ps.setString(5, AgregarEmpleado.calendario.getText());
            ps.setString(6, AgregarEmpleado.txtCorreoE.getText());
            ps.setString(7, AgregarEmpleado.txtContraseña.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "El empleado se agregó correctamente");
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }  
    
    public static boolean agregarEmpleado(){
        String consulta = "insert into empleadosotros (idEmpleadosOtros, Nombre, Apellido_P, Apellido_M, Fecha_Nacimiento, CorreoE, Puesto)values (?,?,?,?,?,?,?) ";
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setInt(1, Integer.parseInt(AgregarEmpleado.txtNControl.getText()));
            ps.setString(2, AgregarEmpleado.txtNombre.getText());
            ps.setString(3, AgregarEmpleado.txtApellidoP.getText());
            ps.setString(4, AgregarEmpleado.txtApellidoM.getText());
            ps.setString(5, AgregarEmpleado.calendario.getText());
            ps.setString(6, AgregarEmpleado.txtCorreoE.getText());
            ps.setString(7, (String) AgregarEmpleado.cboCarrera.getSelectedItem());
            ps.executeUpdate();   
            JOptionPane.showMessageDialog(null, "El empleado se agregó correctamente");
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public static boolean agregarGerente(){
        String consulta = "insert into gerente (idEmpleado, nombre, fechaNacimiento, correoE, contraseña)values (?,?,?,?,?) ";
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setInt(1, Integer.parseInt(AgregarGerente.txtNControl.getText()));
            ps.setString(2, AgregarGerente.txtNombre.getText());
            ps.setString(3, AgregarGerente.calendario.getText());
            ps.setString(4, AgregarGerente.txtCorreoE.getText());
            ps.setString(5, AgregarGerente.txtContraseña.getText());
            ps.executeUpdate();   
            JOptionPane.showMessageDialog(null, "El gerente se agregó correctamente");
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
}
