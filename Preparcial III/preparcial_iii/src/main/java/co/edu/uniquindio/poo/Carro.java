package co.edu.uniquindio.poo;

public class Carro extends Vehiculo {
    Tipo tipo;
    
    public Carro(String placa, int peajesPagados,double valorPeaje , Tipo tipo){
        super(placa, peajesPagados, valorPeaje);
        this.tipo = tipo;
    }


    //METODO PARA CALCULAR PEAJE
    public double valorPeaje(Carro carro){
        double valor = 0.0;
        double base = 10000;
        if(carro.getTipo().equals(Tipo.ELECTRICO)){
                valor = base-0.2*base;
            }
        if(carro.getTipo().equals(Tipo.SERVICIO_PUBLICO)){
                valor = base + 0.15*base;
            }
        return valor;
    }


    // METODO PARA RETORNAR CADENA DESCRIPTIVA
    @Override
    public String descripcion(){
        return "p";
    }


    //METODO GETTER Y SETTER

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }


}
