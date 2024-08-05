package Modelo;

public class Recepcionista {
    private int idRecepcionista;
    private String Nombre;
    private String Apellido_P;
    private String Apellido_M;
    private String fecha_Nacimiento;
    private String CorreoE;
    
    private String Contraseña;

    public Recepcionista() {
    }

    public int getIdRecepcionista() {
        return idRecepcionista;
    }

    public void setIdRecepcionista(int idRecepcionista) {
        this.idRecepcionista = idRecepcionista;
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
        return fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getCorreoE() {
        return CorreoE;
    }

    public void setCorreoE(String CorreoE) {
        this.CorreoE = CorreoE;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
}
