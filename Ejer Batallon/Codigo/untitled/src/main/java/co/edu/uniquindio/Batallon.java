package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Batallon {
    private String nombre;
    private ArrayList<Vehiculo> listVehiculos;
    private ArrayList<Blindado> listVehiculosBlindados;
    private ArrayList<TransporteTropa> listTransporteTropas;
    private ArrayList<Apoyo> listVehiculosApoyo;
    private ArrayList<Mision> listMisiones;
    private ArrayList<Soldado> listSoldados;

    public Batallon(String nombre) {
        this.nombre = nombre;
        this.listVehiculos = new ArrayList<>();
        this.listTransporteTropas = listTransporteTropas;
        this.listVehiculosBlindados = new ArrayList<>();
        this.listVehiculosApoyo = new ArrayList<>();
        this.listMisiones = new ArrayList<>();
        this.listSoldados = new ArrayList<>();

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Vehiculo> getListVehiculos() {
        return listVehiculos;
    }

    public void setListVehiculos(ArrayList<Vehiculo> listVehiculos) {
        this.listVehiculos = listVehiculos;
    }

    public ArrayList<Blindado> getListVehiculosBlindados() {
        return listVehiculosBlindados;
    }

    public void setListVehiculosBlindados(ArrayList<Blindado> listVehiculosBlindados) {
        this.listVehiculosBlindados = listVehiculosBlindados;
    }

    public ArrayList<TransporteTropa> getListTransporteTropas() {
        return listTransporteTropas;
    }

    public void setListTransporteTropas(ArrayList<TransporteTropa> listTransporteTropas) {
        this.listTransporteTropas = listTransporteTropas;
    }

    public ArrayList<Apoyo> getListVehiculosApoyo() {
        return listVehiculosApoyo;
    }

    public void setListVehiculosApoyo(ArrayList<Apoyo> listVehiculosApoyo) {
        this.listVehiculosApoyo = listVehiculosApoyo;
    }

    public ArrayList<Mision> getListMisiones() {
        return listMisiones;
    }

    public void setListMisiones(ArrayList<Mision> listMisiones) {
        this.listMisiones = listMisiones;
    }

    public ArrayList<Soldado> getListSoldados() {
        return listSoldados;
    }

    public void setListSoldados(ArrayList<Soldado> listSoldados) {
        this.listSoldados = listSoldados;
    }

    //METODO PARA OBTENER LISTADO DE VEHÍCULOS CON MAS DE 50 MISIONES COPLETADAS PARA EVALUACIÓN Y POSIBLE REEMPLAZO
    public ArrayList<Vehiculo> cantMisionesVehiculos() {
        ArrayList<Vehiculo> cantMisionesVehiculos = new ArrayList<>();

        for (TransporteTropa vehiculo : listTransporteTropas) {
            if (vehiculo.getMisionesCompletadas() > 50) {
                cantMisionesVehiculos.add(vehiculo);
            }
        }
        for (Blindado vehiculo : listVehiculosBlindados) {
            if (vehiculo.getMisionesCompletadas() > 50) {
                cantMisionesVehiculos.add(vehiculo);
            }
        }
        for (Apoyo vehiculo : listVehiculosApoyo) {
            if (vehiculo.getMisionesCompletadas() > 50) {
                cantMisionesVehiculos.add(vehiculo);
            }
        }
        return cantMisionesVehiculos;
    }


    //METODO PARA REGISTRAR UNA MISION
    public boolean registrarMision( LocalDate fechaMision, String ubicacionMision, ArrayList listPersonal,String  idVehiculo) {
        boolean i = false;
        //Convertir de int a string
        String cantMisionesActuales = String.valueOf(listMisiones.size() + 1);
        Mision newMision = new Mision(cantMisionesActuales, fechaMision, ubicacionMision);

        for (Vehiculo vehiculo : listVehiculos) {
            if (vehiculo.getId().equals(idVehiculo)) {
                newMision.setVehiculoAsignado(vehiculo);

                vehiculo.agregarMision(newMision);

                listMisiones.add(newMision);
                i = true;
                break;
            }


        }
        return i;
    }




    //METODO PARA CALCULAR KILOMETRAJE PROMEDIO POR TIPO DE VEHICULO (TRANSPORTE DE TROPAS)
    public double kilometrajePromTransporteTropas () {
        int i = 0, j = 0;
        for (TransporteTropa vehiculo : listTransporteTropas) {
            if (vehiculo.getKilometraje() > 0) {
                i += vehiculo.getKilometraje();
                j++;
            }

        }
        return (double) i / (double) j;
    }

    //METODO PARA CALCULAR KILOMETRAJE PROMEDIO POR TIPO DE VEHICULO (VEHICULO BLINDADO)
    public double kilometrajePromBlindado () {
        int i = 0, j = 0;
        for (Blindado vehiculo : listVehiculosBlindados) {
            if (vehiculo.getKilometraje() > 0) {
                i += vehiculo.getKilometraje();
                j++;
            }
        }
        return (double) i / (double) j;
    }

    //METODO PARA CALCULAR KILOMETRAJE PROMEDIO POR TIPO DE VEHICULO (VEHICULO DE APOYO)
    public double kilometrajePromApoyo () {
        int i = 0, j = 0;
        for (Apoyo vehiculo : listVehiculosApoyo) {
            if (vehiculo.getKilometraje() > 0) {
                i += vehiculo.getKilometraje();
                j++;
            }
        }
        return (double) i / (double) j;
    }

    //METODO PARA FILTRAR MISIONES POR FECHA Y UBICACION
    public ArrayList<Mision> filtroMisionesUbiFechas(String ubicacion, LocalDate fechaInicio, LocalDate fechaFin) {
        ArrayList<Mision> misionesFiltro = new ArrayList<>();
        for (Mision i : listMisiones) {
            if (i.getUbicacion().equals(ubicacion) && ((i.getFecha().isEqual(fechaInicio) || i.getFecha().
                    isAfter(fechaInicio)) && (i.getFecha().isEqual(fechaFin) || i.getFecha().isBefore(fechaFin)))) {
                misionesFiltro.add(i);
            }

        }
        return misionesFiltro;
    }

    //METODO PARA OBTENER VEHICULO CON MAYOR CANTIDAD DE MISIONES COMPLETADAS

    public Vehiculo vehiculoMayorCantMisiones(){
        Vehiculo vehiculoMaxCantMisiones = null;
        int maxCantMisiones = 0;
        for (Vehiculo vehiculoApoyo : listVehiculosApoyo) {
            if (vehiculoApoyo.getMisionesCompletadas() > maxCantMisiones) {
                maxCantMisiones = vehiculoApoyo.getMisionesCompletadas();
                vehiculoMaxCantMisiones = vehiculoApoyo;
            }
        }
        for (Vehiculo vehiculoBlindado : listVehiculosBlindados) {
            if (vehiculoBlindado.getMisionesCompletadas() > maxCantMisiones) {
                maxCantMisiones = vehiculoBlindado.getMisionesCompletadas();
                vehiculoMaxCantMisiones = vehiculoBlindado;
            }
        }
        for (TransporteTropa transporteTropas : listTransporteTropas) {
            if(transporteTropas.getMisionesCompletadas() > maxCantMisiones){
                maxCantMisiones = transporteTropas.getMisionesCompletadas();
                vehiculoMaxCantMisiones = transporteTropas;
            }
        }
        return vehiculoMaxCantMisiones;
    }


    //METODO PARA CREAR SOLDADO
    public boolean agregarSoldado (String id, String nombre, String rango, Especialidad especialidad, int edad, boolean estado){
        boolean i = true;
        for(Soldado soldado : listSoldados){
            if(soldado.getId().equals(id)){
                i = false;
                break;
            }
            if(i){
                Soldado newSoldado = new Soldado(id, nombre, rango, especialidad, edad, estado);
                listSoldados.add(newSoldado);
            }
        }
        return i;

    }

    //METODO PARA ELIMINAR SOLDADDO
    public boolean eliminarSoldado (String idSoldado){
        boolean i = false;
        for (Soldado soldado : listSoldados) {
            if (soldado.getId().equals(idSoldado)) {
                listSoldados.remove(soldado);
                i = true;
                break;
            }
        }
        return i;
    }

    //METODO PARA ACTUALIZAR SOLDADO
    public boolean actualizarSoldado(String idSoldado, String nombre, String rango, Especialidad especialidad, int edad) {
        boolean i = false;
        for(Soldado soldado : listSoldados){
            if(soldado.getId().equals(idSoldado)){
                soldado.setNombre(nombre);
                soldado.setRango(rango);
                soldado.setEspecialidad(especialidad);
                soldado.setEdad(edad);
                i = true;
                break;
            }
        }
        return i;
    }

    //METODO PARA BUSCAR SOLDADO
    public Soldado buscarSoldado(String id){
        for(Soldado soldado : listSoldados){
            if(soldado.getId().equals(id)){
                return soldado;
            }
        }
        return null;
    }

    //METODO PARA BUSCAR SOLDADOS POR ESPECIALIDAD
    public ArrayList<Soldado> listSoldadosEspecialidad (Especialidad especialidad){
        ArrayList<Soldado> soldadosFiltro = new ArrayList<>();
        for (Soldado soldado : listSoldados) {
            if (soldado.getEspecialidad().equals(especialidad)) {
                soldadosFiltro.add(soldado);
            }
        }
        return soldadosFiltro;
    }

    //METODO PARA OBTENER SOLDADOS DISPONIBLES POR RANGO
    public ArrayList<Soldado> soldadosDisponiblesRango ( boolean estadoSoldado, Especialidad especialidad){
        ArrayList<Soldado> soldadosFiltro = new ArrayList<>();
        for (Soldado soldado : listSoldados) {
            if (soldado.getEstado() == estadoSoldado) {
                soldadosFiltro.add(soldado);
            }
        }
        ArrayList<Soldado> soldadosFiltro2 = new ArrayList<>();
        for (Soldado soldado : soldadosFiltro) {
            if (soldado.getEspecialidad().equals(especialidad)) {
                soldadosFiltro2.add(soldado);
            }

        }
        return soldadosFiltro2;
    }

    //METODO PARA OBTENER EDAD PROMEDIO DE LOS SOLDADOS
    public double edadPromedio ( int edadSoldado){
        double i = 0;
        double j = 0;
        for (Soldado soldado : listSoldados) {
            if (soldado.getEdad() > 0) {
                i += soldado.getEdad();
                j++;
            }
        }
        return (double) i / (double) j;
    }


    //METODO PARA ASIGNAR SOLDADO A UNA MISION
    public boolean asignarSoldadoMision(String idSoldado, String idMision){
        boolean i = false;
        for(Mision mision : listMisiones){
            if(mision.getId().equals(idMision)){
                for(Soldado soldado : listSoldados){
                    if(soldado.getId().equals(idSoldado)){
                        mision.getListPersonal().add(soldado);
                        i = true;
                    }
                }
            }
        }
        return i;
    }

    //METODO PARA LIBERAR SOLDADO AL FINALIZAR UNA MISION
    public boolean liberarSoldado(String idSoldado, String idMision){
        boolean i = false;
        for(Mision mision : listMisiones){
            if(mision.getId().equals(idMision)){
                for(Soldado soldado : listSoldados){
                    if(soldado.getId().equals(idSoldado)){
                        mision.getListPersonal().remove(soldado);
                        i = true;

                    }
                }
            }
        }
        return i;
    }


}

