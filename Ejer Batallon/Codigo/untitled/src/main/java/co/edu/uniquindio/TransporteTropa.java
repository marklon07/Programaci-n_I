package co.edu.uniquindio;

public class TransporteTropa extends Vehiculo {
    private String capacidadSoldados;

    public TransporteTropa(String id, String modelo, String anioFabricacion, int kilometraje, EstadoOperativo estadoOperativo, String capacidadSoldados){
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo);
        this.capacidadSoldados = capacidadSoldados;
    }
    public String getCapacidadSoldados() {
        return capacidadSoldados;
    }
    public void setCapacidadSoldados(String capacidadSoldados) {
        this.capacidadSoldados = capacidadSoldados;
    }
}

