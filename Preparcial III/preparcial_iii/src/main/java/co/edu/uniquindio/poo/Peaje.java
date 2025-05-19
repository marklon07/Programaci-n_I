package co.edu.uniquindio.poo;

public class Peaje {
    private Vehiculo vehiculo;
    private double valor;
    private Conductor conductor;

    public Peaje(Vehiculo vehiculo, double valor, Conductor conductor){
        this.vehiculo = vehiculo;
        this.valor = valor;
        this.conductor = conductor;
    }

    //METODO GETTER Y SETTER

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }


}
