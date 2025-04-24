package co.edu.uniquindio;

public class Blindado extends Vehiculo {
    private String nivelBlindaje;
    public Blindado(String id, String modelo, String anioFabricacion, int kilometraje, EstadoOperativo estadoOperativo, String nivelBlindaje) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo);
        this.nivelBlindaje = nivelBlindaje;
    }
    public String getNivelBlindaje(){
        return nivelBlindaje;
    }
    public void setNivelBlindaje(String nivelBlindaje){
        this.nivelBlindaje = nivelBlindaje;
    }


}
