
package Controlador;

import java.util.ArrayList;

/**
 *
 * @author agbig
 */
public class Habitacion implements Comparable {

    private int id;
    private int capacidad;
    private TipoHabitacion categoria;
    private ArrayList<Servicio> listaServicios;
    private ArrayList<Huesped> listaHuespedes;
    private Responsable responsable;
    private float saldo;
    private float precio;

    
    public Habitacion(int id, TipoHabitacion categoria, int capacidad, float precio) {        
        this.id = id;
        this.categoria = categoria;
        this.capacidad = capacidad;
        this.precio = precio;
        this.listaHuespedes = new ArrayList<>();
        this.listaServicios = new ArrayList<>();
    }
    
    public boolean isDisponible(){
        return responsable == null;
    }
    
    public boolean isHuesped(int cedula){
        boolean esta = false;
        
        for (Huesped huesped : listaHuespedes) {
            if(huesped.getCedula() == cedula){
                esta=true;
                break;
            }
        }
        return esta;
    }
    
    public void registrarServicio(Servicio servicio){
        listaServicios.add(servicio);
        
        if(!servicio.isPagado())
            saldo += servicio.getCosto();
        
        getConsumo();
    }
    
    public float getConsumo(){
        float consumo = 0;
        for (Servicio servicio : listaServicios) {
            consumo += servicio.getCosto();
        }
        return consumo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoHabitacion getCategoria() {
        return categoria;
    }

    public void setCategoria(TipoHabitacion categoria) {
        this.categoria = categoria;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Servicio> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(ArrayList<Servicio> listaServicios) {
        this.listaServicios = listaServicios;
    }

    public ArrayList<Huesped> getListaHuespedes() {
        return listaHuespedes;
    }

    public void setListaHuespedes(ArrayList<Huesped> listaHuespedes) {
        this.listaHuespedes = listaHuespedes;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public float getPrecio() {
        return precio;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Habitacion{id=").append(id)
          .append(", categoria=").append(categoria)
          .append(", capacidad=").append(capacidad)
          .append(", precio=").append(precio)
          .append(", saldo=").append(saldo)
          .append(", responsable=").append(responsable)
          .append('}');
        return sb.toString();
    }
    
    @Override
    public int compareTo(Object o) {
        Habitacion hab = (Habitacion) o;
        
        if(this.getConsumo() > hab.getConsumo())
            return -1;
        if(this.getConsumo() < hab.getConsumo())
            return 1;
        return 0;
    }
}
