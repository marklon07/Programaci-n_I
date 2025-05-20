package co.edu.uniquindio.poo;

public class Moto extends Vehiculo{
    private int cilindraje;

    public Moto(String placa, int peajesPagados, double valorPeaje, int cilindraje){
        super(placa, peajesPagados, valorPeaje);
        this.cilindraje = cilindraje;
    }

    //METODO PARA CALCULAR PEAJE
    public double valorPeaje(Moto moto){    
        double base = 5000;
        double recargo = 2000;
        if(moto.getCilindraje()> 200){
            base = base + recargo;
        }
        return base;
    }


     // METODO PARA RETORNAR CADENA DESCRIPTIVA
    @Override
    public String descripcion();

    
    //METODO GETTER Y SETTER
    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }


}
