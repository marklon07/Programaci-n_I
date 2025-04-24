package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mision {
    private String id;
    private LocalDate fecha;
    private String ubicacion;
    private Vehiculo vehiculoAsignado;
    private ArrayList<Soldado> listPersonal;


    public Mision(String id, LocalDate fecha, String ubicacion) {
        this.id = id;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.vehiculoAsignado = vehiculoAsignado;
        this.listPersonal = new ArrayList<>();
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

    public Vehiculo getVehiculoAsignado() {

        return vehiculoAsignado;
    }

    public void setVehiculoAsignado(Vehiculo vehiculoAsignado) {

        this.vehiculoAsignado = vehiculoAsignado;
    }

    public ArrayList<Soldado> getListPersonal(){

        return listPersonal;
    }

    public void setListPersonal(ArrayList<Soldado> listPersonal){

        this.listPersonal = listPersonal;
    }
}
