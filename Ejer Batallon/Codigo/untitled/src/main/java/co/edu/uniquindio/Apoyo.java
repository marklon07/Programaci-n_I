package co.edu.uniquindio;

public class Apoyo extends Vehiculo{
    private TipoFuncion tipoFuncion;

    public Apoyo(String id, String modelo, String anioFabricacion, int kilometraje, EstadoOperativo estadoOperativo,  TipoFuncion tipoFuncion ) {
        super(id, modelo, anioFabricacion, kilometraje,  estadoOperativo );
        this.tipoFuncion = tipoFuncion;
    }
    public TipoFuncion getTipoFuncion(){
        return tipoFuncion;
    }
    public void setTipoFuncion(TipoFuncion tipoFuncion){
        this.tipoFuncion = tipoFuncion;
    }

}

