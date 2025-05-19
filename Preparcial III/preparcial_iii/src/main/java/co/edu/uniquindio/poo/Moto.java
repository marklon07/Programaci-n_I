package co.edu.uniquindio.poo;

public class Moto extends Vehiculo{
    private int cilindraje;

    public Moto(String placa, int peajesPagados, int cilindraje){
        super(placa, peajesPagados);
        this.cilindraje = cilindraje;
    }

    //METODO GETTER Y SETTER

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }


}
