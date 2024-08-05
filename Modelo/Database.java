/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Controlador.Habitacion;
import Controlador.Huesped;
import Controlador.Responsable;
import Controlador.TipoHabitacion;
import Controlador.Servicio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private static final String URL = "jdbc:mysql://localhost:3306/hoteldb";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    private Connection connection;

    public Database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void insertarHuesped(Huesped huesped, int idHabitacion) {
        String query = "INSERT INTO huesped (nombre, cedula, edad, idHabitacion) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, huesped.getNombre());
            stmt.setInt(2, huesped.getCedula());
            stmt.setInt(3, huesped.getEdad());
            stmt.setInt(4, idHabitacion);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void insertarResponsable(Responsable responsable, int idHabitacion) {
        String query = "INSERT INTO responsable (nombre, cedula, edad, idHabitacion) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, responsable.getNombre());
            stmt.setInt(2, responsable.getCedula());
            stmt.setInt(3, responsable.getEdad());
            stmt.setInt(4, idHabitacion);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void registrarServicio(int idHabitacion, Servicio servicio) {
        String query = "INSERT INTO servicio (idHabitacion, tipo, costo, pagado) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, idHabitacion);
            stmt.setString(2, servicio.getTipo().name());
            stmt.setFloat(3, servicio.getCosto());
            stmt.setBoolean(4, servicio.isPagado());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Habitacion> obtenerHabitacionesDisponibles() {
        List<Habitacion> habitaciones = new ArrayList<>();
        String query = "SELECT * FROM habitacion WHERE disponible = true";
        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                TipoHabitacion categoria = TipoHabitacion.valueOf(rs.getString("categoria"));
                int capacidad = rs.getInt("capacidad");
                float precio = rs.getFloat("precio");
                habitaciones.add(new Habitacion(id, categoria, capacidad, precio));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return habitaciones;
    }
    
    public Habitacion obtenerHabitacionPorId(int id) {
        String query = "SELECT * FROM habitacion WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    TipoHabitacion categoria = TipoHabitacion.valueOf(rs.getString("categoria"));
                    int capacidad = rs.getInt("capacidad");
                    float precio = rs.getFloat("precio");
                    return new Habitacion(id, categoria, capacidad, precio);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void actualizarSaldoHabitacion(int idHabitacion, float saldo) {
        String query = "UPDATE habitacion SET saldo = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setFloat(1, saldo);
            stmt.setInt(2, idHabitacion);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Huesped> obtenerHuespedesPorHabitacion(int idHabitacion) {
        List<Huesped> huespedes = new ArrayList<>();
        String query = "SELECT * FROM huesped WHERE idHabitacion = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, idHabitacion);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String nombre = rs.getString("nombre");
                    int cedula = rs.getInt("cedula");
                    int edad = rs.getInt("edad");
                    huespedes.add(new Huesped(nombre, cedula, edad));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return huespedes;
    }

    public Responsable obtenerResponsablePorHabitacion(int idHabitacion) {
        String query = "SELECT * FROM responsable WHERE idHabitacion = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, idHabitacion);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nombre = rs.getString("nombre");
                    int cedula = rs.getInt("cedula");
                    int edad = rs.getInt("edad");
                    return new Responsable(nombre, cedula, edad);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}