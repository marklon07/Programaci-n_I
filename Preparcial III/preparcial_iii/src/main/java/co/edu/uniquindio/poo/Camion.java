package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {
    private int ejes;
    private double capacidadCarga;

    public Camion(String placa, int peajesPagados, double valorPeaje,int ejes, double capacidadCarga){
        super(placa, peajesPagados, valorPeaje);
        this.ejes = ejes;
        this.capacidadCarga = capacidadCarga;
    }




     // METODO PARA RETORNAR CADENA DESCRIPTIVA
    @Override
    public String descripcion(){
        return "m";
    }




    //METODO GETTER Y SETTER

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }


}
