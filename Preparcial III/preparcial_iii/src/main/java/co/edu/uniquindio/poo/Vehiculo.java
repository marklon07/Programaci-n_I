package co.edu.uniquindio.poo;

public abstract class Vehiculo implements ICalcularPeaje{

    protected String placa;
    protected int peajesPagados;
    protected double valorPeaje;

    public Vehiculo(String placa, int peajesPagados){
        this.placa = placa;
        this.peajesPagados = peajesPagados;
    }

    
    //METODO PARA CALCULAR PEAJE
    public double valorPeaje(Vehiculo vehiculo){
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
        return valor;
    }

    // METODO PARA RETORNAR CADENA DESCRITIVA
    public abstract String descripcion();
   
        
    

    //METODO GETTER Y SETTER

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPeajesPagados() {
        return peajesPagados;
    }

    public void setPeajesPagados(int peajesPagados) {
        this.peajesPagados = peajesPagados;
    }

    public double getValorPeaje() {
        return valorPeaje;
    }

    public void setValorPeaje(double valorPeaje) {
        this.valorPeaje = valorPeaje;
    }



}

