package co.edu.uniquindio.poo;
import java.time.LocalDate;
import java.util.ArrayList;

public class Conductor implements ICalcularPeaje{

    private String nombre;
    private String apellido;
    private String id;
    private LocalDate fechaNacimiento;
    private ArrayList<Vehiculo> listVehiculos;

    public Conductor(String nombre, String apellido, String id, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
    }

    //METODO PARA ASIGNAR VEHICULO A UN CONDUCTOR
    public boolean asignarVehiculoConductor(Vehiculo vehiculo){
        boolean i = false;
        if(vehiculo != null && !listVehiculos.contains(vehiculo)){
                listVehiculos.add(vehiculo);
                i = true;
            }
        return i;

    }

    //METODO PARA CONSULTAR EL TOTAL DE DINERO PAGADO EN PEAJES POR CADA VEHICULO ASIGNADO
    public double valorPeaje(){
        double valor = 0.0;
        for(Vehiculo vehiculo : listVehiculos){
            double valor = 0.0;
        
        if(vehiculo instanceof Carro){
            double base = 10000;
            if(((Carro)vehiculo).getTipo().equals(Tipo.ELECTRICO)){
                valor = base-0.2*base;
            }
            if(((Carro)vehiculo).getTipo().equals(Tipo.SERVICIO_PUBLICO)){
                valor = base + 0.15*base;
            }
        }
        if(vehiculo instanceof Moto){
            double base = 5000;
            double recargo = 2000;
            if(((Moto) vehiculo).getCilindraje()> 200){
                valor = base + recargo;
            }
            valor = base;
        }
        if(vehiculo instanceof Camion){
            double base = 7000;
            int ejes = ((Camion) vehiculo).getEjes();
            valor = base*ejes;
            if(((Camion) vehiculo).getCapacidadCarga()> 10){
                valor = base*ejes+0.1*base*ejes;
            }
            
        }
        }
        return valor;
    }
        

    

    //METODO GETTER Y SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Vehiculo> getListVehiculos(){
        return listVehiculos;
    }

    public void setListVehiculos(ArrayList<Vehiculo> listVehiculos){
        this.listVehiculos = listVehiculos;
    }

}
