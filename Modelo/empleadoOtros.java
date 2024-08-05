package Modelo;

import java.util.Date;

public class empleadoOtros {
    private int idEmpleadosOtros;
    private String Nombre;
    private String Apellido_P;
    private String Apellido_M;
    private String Fecha_Nacimiento;
    private String Genero;
    private String Puesto;

    public empleadoOtros() {
    }

    public int getIdEmpleadosOtros() {
        return idEmpleadosOtros;
    }

    public void setIdEmpleadosOtros(int idEmpleadosOtros) {
        this.idEmpleadosOtros = idEmpleadosOtros;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido_P() {
        return Apellido_P;
    }

    public void setApellido_P(String Apellido_P) {
        this.Apellido_P = Apellido_P;
    }

    public String getApellido_M() {
        return Apellido_M;
    }

    public void setApellido_M(String Apellido_M) {
        this.Apellido_M = Apellido_M;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }    
}
