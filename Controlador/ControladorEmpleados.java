package Controlador;

import Conexion.CConexion;
import Vista.Dialog1;
import Vista.Empleados;
import static Vista.Empleados.TableEmpleadosOtros;
import static Vista.Empleados.TableRecepcionista;
import Vista.Login;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorEmpleados {
    private static Connection conn = CConexion.estableceConexion();          
    private static int siguienteIndice = getSiguienteIndice();
    private static int siguienteIndice1 = getSiguienteIndice();
    
    public ControladorEmpleados(){  
        listar();
    }
        
    public static void logOut(){
        Login l = new Login();
        l.setLocation(250,75); 
        l.setVisible(true);
    }
    
    public static void buscar(){        
        ControladorEmpleados.bucarRecepcionista(Empleados.txtBuscar.getText());
        ControladorEmpleados.bucarEmpleadosOtros(Empleados.txtBuscar.getText());
    }
    
    public static void eliminar(){
        if(TableRecepcionista.isColumnSelected(0)){
            int fila = TableRecepcionista.getSelectedRow();
            String id = TableRecepcionista.getValueAt(fila, 0).toString();
            if(fila >= 0){
                ControladorEmpleados.eliminarRecepcionista(id);
            }
            JOptionPane.showMessageDialog(null, "El empleado se elimino correctamente");
        }else if(TableEmpleadosOtros.isColumnSelected(0)){
            int fila1 = TableEmpleadosOtros.getSelectedRow();
            String id1 = TableEmpleadosOtros.getValueAt(fila1, 0).toString();
            if(fila1 >= 0){
                ControladorEmpleados.eliminarEmpleadoOtros(id1);
            }
            JOptionPane.showMessageDialog(null, "El empleado se elimino correctamente");
        }
    }
    
    public static void listar(){
        listarRecepcionista();
        listarEmpleadosOtros();
    }    
    
    public static int siguienteIndiceRecepcionista(){        
        DefaultTableModel md = new DefaultTableModel();
        int indice = 1000;
        if(siguienteIndice < indice){
            siguienteIndice += 20;
        }
        
        ResultSet rs = ListarTablaRecepcionista("SELECT * FROM recepcionista LIMIT " + siguienteIndice + ",20");        
        md.setColumnIdentifiers(new Object[]{"idRecepcionista", "nombre", "apellido_P", "apellido_M", "fecha_Nacimiento", "correoE", "Contraseña"});
        try{
            while(rs.next()){
                md.addRow(new Object[]{rs.getInt("idRecepcionista"), rs.getString("Nombre"), rs.getString("apellido_P"), rs.getString("Apellido_M"), rs.getDate("fecha_Nacimiento"), rs.getString("correoE"), rs.getString("Contraseña")});
                Empleados.TableRecepcionista.setModel(md);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.toString());
        }
        return siguienteIndice;
    }
    
    public static int siguienteIndiceEmpleadosOtros(){        
        DefaultTableModel md = new DefaultTableModel();
        int indice = 1000;
        if(siguienteIndice1 < indice){
            siguienteIndice1 += 20;
        }
        ResultSet rs = ListarTablaRecepcionista("SELECT * FROM empleadosotros LIMIT " + siguienteIndice1 + ",20");
        md.setColumnIdentifiers(new Object[]{"idEmpleadosOtros", "Nombre", "Apellido_P", "Apellido_M", "Fecha_Nacimiento", "correoE", "Puesto"});
        try{
            while(rs.next()){
                md.addRow(new Object[]{rs.getInt("idEmpleadosOtros"), rs.getString("Nombre"), rs.getString("apellido_P"), rs.getString("apellido_M"), rs.getDate("Fecha_Nacimiento"), rs.getString("correoE"), rs.getString("puesto")});
                Empleados.TableEmpleadosOtros.setModel(md);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.toString());
        }
        return siguienteIndice1;
    }
    
    public static void listarRecepcionista(){
        DefaultTableModel md = new DefaultTableModel();
        ResultSet rs = ListarTablaRecepcionista("SELECT * FROM recepcionista LIMIT 0,20");
        md.setColumnIdentifiers(new Object[]{"idRecepcionista", "nombre", "apellido_P", "apellido_M", "fecha_Nacimiento", "correoE", "Contraseña"});
        try{
            while(rs.next()){
                md.addRow(new Object[]{rs.getInt("idRecepcionista"), rs.getString("Nombre"), rs.getString("apellido_P"), rs.getString("Apellido_M"), rs.getDate("fecha_Nacimiento"), rs.getString("correoE"), rs.getString("Contraseña")});
                Empleados.TableRecepcionista.setModel(md);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.toString());
        }
    }
    
    public static void listarEmpleadosOtros(){
        DefaultTableModel md = new DefaultTableModel();
        ResultSet rs = ListarTablaRecepcionista("SELECT * FROM empleadosotros LIMIT 0,20");
        md.setColumnIdentifiers(new Object[]{"idEmpleadosOtros", "Nombre", "Apellido_P", "Apellido_M", "Fecha_Nacimiento", "correoE", "Puesto"});
        try{
            while(rs.next()){
                md.addRow(new Object[]{rs.getInt("idEmpleadosOtros"), rs.getString("Nombre"), rs.getString("Apellido_P"), rs.getString("Apellido_M"), rs.getDate("Fecha_Nacimiento"), rs.getString("correoE"), rs.getString("Puesto")});
                Empleados.TableEmpleadosOtros.setModel(md);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.toString());
        }
    }
    
    public static int getSiguienteIndice() {
        return siguienteIndice;
    }

    public static void setSiguienteIndice(int newIndice) {
        siguienteIndice = newIndice;
    }
    
    public static int getSiguienteIndice1() {
        return siguienteIndice1;
    }

    public static void setSiguienteIndice1(int newIndice) {
        siguienteIndice1 = newIndice;
    }
    
    public static int anteriorIndiceRecepcionista(){        
        DefaultTableModel md = new DefaultTableModel();
        ResultSet rs = null;        
        md.setColumnIdentifiers(new Object[]{"idRecepcionista", "nombre", "apellido_P", "apellido_M", "fecha_Nacimiento", "correoE", "Contraseña"});        
        if(siguienteIndice >= 20){
            setSiguienteIndice(siguienteIndice - 20);            
        }else{
            setSiguienteIndice(0);
        }
        siguienteIndice = getSiguienteIndice();
        rs = ListarTablaRecepcionista("SELECT * FROM recepcionista LIMIT " + siguienteIndice + ",20");
        try{
            while(rs.next()){
                md.addRow(new Object[]{rs.getInt("idRecepcionista"), rs.getString("Nombre"), rs.getString("apellido_P"), rs.getString("Apellido_M"), rs.getDate("fecha_Nacimiento"), rs.getString("correoE"), rs.getString("Contraseña")});
                Empleados.TableRecepcionista.setModel(md);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.toString());
        }
        return siguienteIndice;
    }
    
    public static int anteriorIndiceEmpleadosOtros(){        
        DefaultTableModel md = new DefaultTableModel();
        ResultSet rs = null;
        md.setColumnIdentifiers(new Object[]{"idEmpleadosOtros", "Nombre", "Apellido_P", "Apellido_M", "Fecha_Nacimiento", "correoE", "Puesto"});
        if(siguienteIndice1 >= 20){
            setSiguienteIndice(siguienteIndice1 - 20);
        }else{
            setSiguienteIndice(0);
        }        
        siguienteIndice1 = getSiguienteIndice();
        rs = ListarTablaEmpleadosOtros("SELECT * FROM empleadosotros LIMIT " + siguienteIndice1 + ",20");
        try{
            while(rs.next()){
                md.addRow(new Object[]{rs.getInt("idEmpleadosOtros"), rs.getString("Nombre"), rs.getString("apellido_P"), rs.getString("Apellido_M"), rs.getDate("fecha_Nacimiento"), rs.getString("correoE"), rs.getString("Puesto")});
                Empleados.TableEmpleadosOtros.setModel(md);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.toString());
        }
        return siguienteIndice1;
    }
    
    public static ResultSet ListarTablaRecepcionista(String consulta){
        Statement sql;
        ResultSet datos = null;
        try{
            sql = conn.createStatement();
            datos = sql.executeQuery(consulta);
        }catch(SQLException e){ 
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.toString());
        }
        return datos;
    }
    
    public static ResultSet ListarTablaEmpleadosOtros(String consult){
        Statement sql;
        ResultSet datos = null;
        try{
            sql = conn.createStatement();
            datos = sql.executeQuery(consult);
        }catch(SQLException e){ 
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.toString());
        }
        return datos;
    }
    
    public static boolean eliminarEmpleadoOtros(String id){
        PreparedStatement ps = null;
        String sql = "delete FROM empleadosotros WHERE idEmpleadosOtros ='" + id + "'";
        try{
            ps = conn.prepareStatement(sql);
            ps.execute();
            listar();
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public static boolean eliminarRecepcionista(String id){
        PreparedStatement ps = null;
        String sql = "delete FROM recepcionista WHERE idRecepcionista ='" + id + "'";
        try{
            ps = conn.prepareStatement(sql);
            ps.execute();
            listar();
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public static boolean modificarEmpleadoOtros(int fila){
        String consulta = "UPDATE empleadosotros SET Nombre = ?, Apellido_P = ?, Apellido_M = ?, Fecha_Nacimiento = ?, correoE = ?, Puesto = ? WHERE idEmpleadosOtros = ?";

        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement(consulta);            
            ps.setString(1, Empleados.TableEmpleadosOtros.getValueAt(fila, 1).toString());
            ps.setString(2, Empleados.TableEmpleadosOtros.getValueAt(fila, 2).toString());
            ps.setString(3, Empleados.TableEmpleadosOtros.getValueAt(fila, 3).toString());
            ps.setString(4, Empleados.TableEmpleadosOtros.getValueAt(fila, 4).toString());
            ps.setString(5, Empleados.TableEmpleadosOtros.getValueAt(fila, 5).toString());
            ps.setString(6, Empleados.TableEmpleadosOtros.getValueAt(fila, 6).toString());
            ps.setInt(7, Integer.parseInt(Empleados.TableEmpleadosOtros.getValueAt(fila, 0).toString()));
            ps.executeUpdate();
            listar();
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
     
    public static boolean modificarRecepcionista(int fila){
        String consulta = "UPDATE recepcionista SET nombre = ?, apellido_P = ?, apellido_M = ?, fecha_Nacimiento = ?, correoE = ?, Contraseña = ? WHERE idRecepcionista = ?";
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement(consulta);
            ps.setString(1, Empleados.TableRecepcionista.getValueAt(fila, 1).toString());
            ps.setString(2, Empleados.TableRecepcionista.getValueAt(fila, 2).toString());
            ps.setString(3, Empleados.TableRecepcionista.getValueAt(fila, 3).toString());
            ps.setString(4, Empleados.TableRecepcionista.getValueAt(fila, 4).toString());
            ps.setString(5, Empleados.TableRecepcionista.getValueAt(fila, 5).toString());            
            ps.setString(6, Empleados.TableEmpleadosOtros.getValueAt(fila, 6).toString());
            ps.setInt(7, Integer.parseInt(Empleados.TableRecepcionista.getValueAt(fila, 0).toString()));            
            ps.executeUpdate();
            listar();
            return true;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }
    }
    
    public static void modificar(){
        int fila = Empleados.TableRecepcionista.getSelectedRow();
        int fila1 = Empleados.TableEmpleadosOtros.getSelectedRow();
        
        if(Empleados.TableEmpleadosOtros.getSelectedRow() != -1){            
            ControladorEmpleados.modificarEmpleadoOtros(fila1);
        }
        if(Empleados.TableRecepcionista.getSelectedRow() != -1){            
            ControladorEmpleados.modificarRecepcionista(fila);
        }
    }
    
    public static DefaultTableModel bucarRecepcionista(String buscar){
        String [] nombreColumnas = {"idRecepcionista", "nombre", "apellido_P", "apellido_M", "fecha_Nacimiento", "correoE", "Contraseña"};
        String [] registros = new String[7];
        DefaultTableModel modelo = new DefaultTableModel(null, nombreColumnas);
        String sql = "SELECT * FROM recepcionista WHERE idRecepcionista LIKE '%" + buscar + "%' OR nombre LIKE '%" + buscar + "%'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                registros [0] = rs.getString("idRecepcionista");
                registros [1] = rs.getString("nombre");
                registros [2] = rs.getString("apellido_P");
                registros [3] = rs.getString("apellido_M");
                registros [4] = rs.getString("fecha_Nacimiento");
                registros [5] = rs.getString("correoE");
                registros [6] = rs.getString("Contraseña");
                modelo.addRow(registros);
                Empleados.TableRecepcionista.setModel(modelo);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }finally{
            try{
                if(rs != null){
                    rs.close();
                }
                if(ps != null){
                    ps.close();
                }                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null, e.toString()); 
            }
        }
        return modelo;
    }
    
    public static DefaultTableModel bucarEmpleadosOtros(String buscar){
        String [] nombreColumnas = {"idEmpleadosOtros", "Nombre", "Apellido_P", "Apellido_M", "Fecha_Nacimiento", "correoE", "Puesto"};
        String [] registros = new String[7];
        DefaultTableModel modelo = new DefaultTableModel(null, nombreColumnas);
        String sql = "SELECT * FROM empleadosOtros WHERE idEmpleadosOtros LIKE '%" + buscar + "%' OR Nombre LIKE '%" + buscar + "%'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                registros [0] = rs.getString("idEmpleadosOtros");
                registros [1] = rs.getString("Nombre");
                registros [2] = rs.getString("Apellido_P");
                registros [3] = rs.getString("Apellido_M");
                registros [4] = rs.getString("Fecha_Nacimiento");
                registros [5] = rs.getString("correoE");
                registros [6] = rs.getString("Puesto");
                modelo.addRow(registros);
                Empleados.TableEmpleadosOtros.setModel(modelo);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }finally{
            try{
                if(rs != null){
                    rs.close();
                }
                if(ps != null){
                    ps.close();
                }                
            }catch(SQLException e){
               JOptionPane.showMessageDialog(null, e.toString()); 
            }
        }
        return modelo;
    }
}
