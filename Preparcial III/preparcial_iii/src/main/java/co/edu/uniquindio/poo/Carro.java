package co.edu.uniquindio.poo;

public class Carro extends Vehiculo{
    Tipo tipo;
    
    public Carro(String placa, int peajesPagados, Tipo tipo){
        super(placa, peajesPagados);
        this.tipo = tipo;
    }

    //METODO GETTER Y SETTER

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

}
