
package Controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author agbig
 */
public class Hotel {

    private Habitacion lista[];

    public Hotel() {
        lista = new Habitacion[20];

        for (int i = 0; i <= 5; i++) 
            lista = new Habitacion[20];

        for (int i = 0; i < 6; i++) 
            lista[i] = new Habitacion(i + 1, TipoHabitacion.EJECUTIVA, 1, 0);        

        for (int i = 6; i < 10; i++) 
            lista[i] = new Habitacion(i + 1, TipoHabitacion.DOBLE, 2, 0);        

        for (int i = 10; i < 19; i++) 
            lista[i] = new Habitacion(i + 1, TipoHabitacion.SUITE, 5, 0);        

        lista[19] = new Habitacion(20, TipoHabitacion.PRESIDENCIAL, 10, 0);
    }

    public int checkIn(String nombre, int ced, int edad, TipoHabitacion tipoHabitacion, ArrayList<Huesped> huespedes) {
        int habitacion=0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].getCategoria().equals(tipoHabitacion) && lista[i].isDisponible() ) {                
                lista[i].setResponsable(new Responsable(nombre, ced, edad));
                lista[i].setListaHuespedes(huespedes);
                habitacion = i;                    
                i = lista.length;                
            }
        }
        return habitacion;
    }
    
    public boolean isHuespedHotel(int cedula){
        boolean esta = false;
        for (int i = 0; i < lista.length; i++) {
            if(lista[i].isHuesped(cedula));{
                esta = true;
                i = lista.length;
            }
        }        
        return esta;
    }
    
    public void registrarHuesped(int idHabitacion, String nombre, int ced, int edad){
        Habitacion habitacion = lista[idHabitacion - 1];
        
        if (habitacion.getResponsable() == null) {
            System.out.println("Se debe hacer check-in para registrar al Responsable");
            return;
        }
        
        if (habitacion.getListaHuespedes().size() < habitacion.getCapacidad()) {
            habitacion.getListaHuespedes().add(new Huesped(nombre, ced, edad));
        } else {
            System.out.println("No se puede registrar, supera capacidad máxima de huéspedes: <" + habitacion.getCapacidad() + ">");
        }
    }
    
    public void incluirServicio(int idHabitacion, int idServicio, float costo, boolean isPagado) {
        Habitacion habitacion = lista[idHabitacion - 1];
        TipoServicio tipoServicio;
        
        switch (idServicio) {
            case 1:
                tipoServicio = TipoServicio.MINI_BAR;
                break;
            case 2:
                tipoServicio = TipoServicio.INTERNET;
                break;
            case 3:
                if (habitacion.getCategoria() == TipoHabitacion.SUITE || habitacion.getCategoria() == TipoHabitacion.PRESIDENCIAL) {
                    tipoServicio = TipoServicio.SPA;
                } else {
                    System.out.println("Servicio no válido para esta categoría de habitación");
                    return;
                }
                break;
            case 4:
                tipoServicio = TipoServicio.PELICULAS;
                break;
            default:
                System.out.println("Servicio no válido");
                return;
        }
        
        habitacion.getListaServicios().add(new Servicio(tipoServicio, costo, isPagado));
    }
    
    public void darSalida(int id) {
        Habitacion habitacion = lista[id - 1];
        lista[id - 1] = new Habitacion(id, habitacion.getCategoria(), habitacion.getCapacidad(), 0);
    }
    
    public ArrayList<Habitacion> responsableHabitaciones(int cedula) {
        ArrayList<Habitacion> list = new ArrayList();
        if(existResponsable(cedula)){
            for (Habitacion habitacion : lista) {
                if(habitacion.getResponsable()!=null){
                    int ced = habitacion.getResponsable().getCedula();
                    if (ced==cedula) 
                        list.add(habitacion);
                }
            }
        }
        return list;
    }
    
    public boolean existResponsable(int cedula){
        boolean resp= false;
        
        for (int i = 0; i < lista.length; i++) {
            if(!lista[i].isDisponible() && lista[i].getResponsable().getCedula()==cedula){
                resp = true;
                i = lista.length;
            }
        }
        return resp;
    }
    
    public int habitacionMayorConsumo() {
        int hab = 0;
        float mayor = lista[0].getConsumo();
        
        for (Habitacion habitacion : lista) {
            if(habitacion.getConsumo() > mayor){
                mayor = habitacion.getConsumo();
                hab = habitacion.getId();
            }
        }        
        return hab;
    }

    public int habitacionMayorDeuda() {
        int hab = 0;
        float mayor = lista[0].getSaldo();
        
        for (Habitacion habitacion : lista) {
            if(habitacion.getSaldo() > mayor){
                mayor = habitacion.getSaldo();
                hab = habitacion.getId();
            }
        }        
        return hab;
    }
    
    public Responsable responsableMasRecurrente(){
        Responsable responsable = null;
        try{
            int ced = 0;
            int mayor = 0;
            for (int i = 0; i < lista.length; i++) {
                if(!lista[i].isDisponible()){
                    responsable = lista[i].getResponsable();                
                    ced = lista[i].getResponsable().getCedula();
                    mayor = responsableHabitaciones(ced).size();
                    i = lista.length;
                }
            }            

            for (int i = 0; i < lista.length; i++) {
                if(!lista[i].isDisponible()){
                    ced = lista[i].getResponsable().getCedula();
                    if(mayor < responsableHabitaciones(ced).size()){
                        mayor = responsableHabitaciones(ced).size();
                        responsable = lista[i].getResponsable();
                    }
                }
            }            
        }
        catch(Exception E){}
        
        return responsable;        
    }

    public double getTotalConsumoHotel(){
        double total = 0;
        
        for (int i = 0; i < lista.length; i++) {
            total += lista[i].getConsumo();
        }
        return total;
    }
    
    public int buscarHabitacionCed(int cedula) {
        int habitacion = 0;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].getListaHuespedes().size(); j++) {
            
                if (lista[i].getListaHuespedes().get(j).getCedula() == cedula) {
                    habitacion = i+1;
                    j = lista[i].getListaHuespedes().size();                    
                }
            }            
        }
        return habitacion;
    }

    public int habitacionesDisponibles() {
        int count = 0;
        for (Habitacion habitacion : lista) {
            if (habitacion.isDisponible()) {
                count++;
            }
        }
        return count;
    }

    public int habitacionesOcupadas() {        
        return 20-habitacionesDisponibles();
    }

    public Habitacion[] getLista() {
        return lista;
    }

    public void setLista(Habitacion[] lista) {
        this.lista = lista;
    }

}
