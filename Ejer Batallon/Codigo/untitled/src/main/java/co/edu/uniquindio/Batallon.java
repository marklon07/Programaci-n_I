package co.edu.uniquindio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Batallon {
    private String nombre;
    private ArrayList<Vehiculo> listVehiculos;
    private ArrayList<Blindado> listVehiculosBlindados;
    private ArrayList<TransporteTropa> listTransporteTropas;
    private ArrayList<Apoyo> listVehiculosApoyo;
    private ArrayList<String> listMisiones;
    private ArrayList<Soldado> listSoldados;

    public Batallon(String nombre, ArrayList<TransporteTropa> listTransporteTropas) {
        this.nombre = nombre;
        this.listTransporteTropas = listTransporteTropas;
        this.listVehiculosBlindados = new ArrayList<>();
        this.listVehiculosApoyo = new ArrayList<>();
        this.listMisiones = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
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
    public boolean registrarMision(String idMision, LocalDate fechaMision, String ubicacionMision, Vehiculo idVehiculo, ArrayList listPersonal) {
        boolean i = false;

        //Connvertir de Int a String
        String cantMisionesActuales = String.valueOf(listMisiones.size() + 1);
        Mision newMision = new Mision(idMision, fechaMision, ubicacionMision, idVehiculo);
        for (Vehiculo vehiculo : listVehiculos) {
            if (vehiculo.getId().equals(idVehiculo)) {
                newMision.setVehiculosAsignados(vehiculo);

                ArrayList<Mision> listTempo = vehiculo.getListMisiones();
                listTempo.add(newMision);

                vehiculo.setListMisiones(listTempo);

                listMisiones.add(newMision);
                i = true;
                break;
            }
        }

        return i;
    }

    //METODO PARA CALCULAR KILOMETRAJE PROMEDIO POR TIPO DE VEHICULO (TRANSPORTE DE TROPAS)
    public double kilometrajePromTransporteTropas(int kilometrajeTransporteTropa) {
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
    public double kilometrajePromBlindado(int kilometrajeBlindado) {
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
    public double kilometrajePromApoyo(int kilomatrajeApoyo) {
        int i = 0, j = 0;
        for (Apoyo vehiculo : listVehiculosApoyo) {
            if (vehiculo.getKilometraje() > 0) {
                i += vehiculo.getKilometraje();
                j++;
            }
        }
        return (double) i / (double) j;
    }

    //METODO PARA FILTRAR MISIONES POR UBICACION Y FECHA
    public ArrayList<Mision> filtroMisionesUbicacionFechas(String ubicacion, LocalDate fechaInicio, LocalDate fechaFin) {
        ArrayList<Mision> misionesFiltro = new ArrayList<>();
        for (Mision mision : listMisiones) {
            if (mision.getUbicacion().equals(ubicacion) && ((mision.getFecha().isEqual(fechaInicio) && mision.getFecha().
                    isAfter(fechaInicio)) && (mision.getFecha().isEqual(fechaFin) && mision.getFecha().isBefore(fechaFin)))) {
                misionesFiltro.add(mision);
            }

        }
        return misionesFiltro;
    }

    //METODO PARA CREAR SOLDADO
    public void agregarSoldado(Soldado newSoldado) {
        listSoldados.add(newSoldado);
    }

    //METODO PARA ELIMINAR SOLDADDO
    public void eliminarSoldado(String idSoldado) {
        for (Soldado soldado : listSoldados) {
            if (soldado.getId().equals(idSoldado)) {
                listSoldados.remove(soldado);
            }
        }
    }

    //METODO PARA BUSCAR SOLDADOS POR ESPECIALIDAD
    public ArrayList<Soldado> listSoldadosEspecialidad(Especialidad especialidad) {
        ArrayList<Soldado> soldadosFiltro = new ArrayList<>();
        for (Soldado soldado : listSoldados) {
            if (soldado.getEspecialidad().equals(especialidad)) {
                soldadosFiltro.add(soldado);
            }
        }
        return soldadosFiltro;

    }

    //METODO PARA OBTENER SOLDADOS DISPONIBLES POR RANGO
    public ArrayList<Soldado> soldadosDisponiblesRango(boolean estadoSoldado, Especialidad especialidad) {
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
    public  double edadPromedio(int edadSoldado){
        double i = 0;
        double j = 0;

        for(Soldado soldado : listSoldados){
            if(soldado.getEdad() > 0){
                i += soldado.getEdad();
                j ++;
            }
        }
        return (double) i / (double) j;
    }

    //METODO PARA BUSCAR SOLDADO POR ID
    public Soldado buscarSoldadoId(String idSoldado){
        for(Soldado soldado : listSoldados){
            if(soldado.getId().equals(idSoldado)){
                return soldado;
            }
        }
        return null;
    }
}

