package co.edu.uniquindio;

import java.util.ArrayList;

public abstract class Vehiculo {
    protected String id;
    protected String modelo;
    protected String anioFabricacion;
    protected int kilometraje;
    protected EstadoOperativo estadoOperativo;
    protected int misionesCompletadas;
    protected ArrayList<Mision> listMisiones;
    protected ArrayList<TransporteTropa> listTransporteTropas;
    protected ArrayList<Blindado> listBlindados;;
    protected ArrayList<Apoyo> listApoyo;

    public Vehiculo(String id, String modelo, String anioFabricacion, int kilometraje, EstadoOperativo estadoOperativo ) {
        this.id = id;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
        this.estadoOperativo = estadoOperativo;
        this.misionesCompletadas = 0;
        this.listMisiones = new ArrayList<>();
        this.listTransporteTropas = new ArrayList<>();
        this.listBlindados = new ArrayList<>();
        this.listApoyo = new ArrayList<>();

    }


    public boolean agregarMision(Mision newMision) {
        return listMisiones.add(newMision);
    }


        public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(String anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public EstadoOperativo getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(EstadoOperativo estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }

    public int getMisionesCompletadas() {
        return misionesCompletadas;
    }

    public void setMisionesCompletadas(int misionesCompletadas) {
        this.misionesCompletadas = misionesCompletadas;
    }

    public ArrayList<Mision> getListMisiones() {
        return listMisiones;
    }

    public void setListMisiones(ArrayList<Mision> listMisiones) {
        this.listMisiones = listMisiones;
    }
    public ArrayList<TransporteTropa> getListTransporteTropas() {
        return listTransporteTropas;
    }
    public void setListTranporteTropas(ArrayList<TransporteTropa> listTransporteTropas) {
        this.listTransporteTropas = listTransporteTropas;
    }
    public ArrayList<Blindado> getListBlindados(){
        return listBlindados;
    }
    public void setListBlindados(ArrayList<Blindado> listBlindados){
        this.listBlindados = listBlindados;
    }
    public ArrayList<Apoyo> getListApoyo(){
        return listApoyo;
    }
    public void setListApoyo(ArrayList<Apoyo> listApoyo){
        this.listApoyo = listApoyo;
    }
}
