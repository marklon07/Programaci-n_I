package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mision {
    private String id;
    private LocalDate fecha;
    private String ubicacion;
    private Vehiculo vehiculosAsignados;
    private ArrayList<String> listPersonal;


    public Mision(String id, LocalDate fecha, String ubicacion, Vehiculo vehiculosAsignados) {
        this.id = id;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.vehiculosAsignados = vehiculosAsignados;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Vehiculo getVehiculosAsignados() {
        return vehiculosAsignados;
    }

    public void setVehiculosAsignados(Vehiculo vehiculosAsignados) {
        this.vehiculosAsignados = vehiculosAsignados;
    }
    public ArrayList<String> gatListPersonal(){
        return listPersonal;
    }
    public void setListPersonal(ArrayList<String> listPersonal){
        this.listPersonal = listPersonal;
    }
}
