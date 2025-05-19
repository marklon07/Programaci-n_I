package co.edu.uniquindio.poo;
import java.util.ArrayList;

public class Estacion implements ICalcularPeaje {
    private String nombre;
    private String departamento;
    private double valor;
    private static ArrayList<Vehiculo> listVehiculos;

    public Estacion(String nombre, String departamento, double valor){
        this.nombre = nombre;
        this.departamento = departamento;
        this.valor = valor;

    }

    

    //METODO PARA CALCULAR PEAJE
    @Override
    public double valorPeaje(){
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

    //METODO PARA VER LISTADO DE VEHICULOS QUE LLEGARON AL PEAJE CON SU RESPECTIVO VALOR PAGADO     
    public ArrayList<Vehiculo> vehiculosPeaje(String nombre, String departamento, double valor){
        ArrayList<Vehiculo> listVehiculos = Estacion.getListVehiculos();
        return listVehiculos;
    }

    //METODO PARA TENER EL TOTAL ACUMULADO DE PEAJES
    public double totalPeaje(){
        double acumulado = 0.0;
        for (Vehiculo vehiculo : listVehiculos){
            acumulado += vehiculo.getValorPeaje();
        }
        return acumulado;

    }

    //METODO GETTER Y SETTER
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static ArrayList<Vehiculo> getListVehiculos(){
        return listVehiculos;
    }
    public void setListVehiculos(ArrayList<Vehiculo> listVehiculos){
        this.listVehiculos = listVehiculos;
    }




}
