package Modelo;

public class Habitacion {
    private int numero;
    private int piso;
    private String estatus;
    private int dias;
    private String disponibilidad;
    private int precio;

    public Habitacion(int numero, int piso, String estatus, int dias, String disponibilidad, int precio) {
        this.numero = numero;
        this.piso = piso;
        this.estatus = estatus;
        this.dias = dias;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
