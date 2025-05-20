package co.edu.uniquindio.poo;

public abstract class Vehiculo {

    protected String placa;
    protected int peajesPagados;
    protected double valorPeaje;

    public Vehiculo(String placa, int peajesPagados, double valorPeaje){
        this.placa = placa;
        this.peajesPagados = peajesPagados;
        this.valorPeaje = valorPeaje;
    }

    
    //METODO PARA CALCULAR PEAJE
    public boolean valorPeaje(Vehiculo vehiculo){
        boolean i = false;
        double valor = 0.0;
        if(vehiculo instanceof Carro){
            double base = 10000;
            if(((Carro)vehiculo).getTipo().equals(Tipo.ELECTRICO)){
                valor = base-0.2*base;
                i = true;
            }
            if(((Carro)vehiculo).getTipo().equals(Tipo.SERVICIO_PUBLICO)){
                valor = base + 0.15*base;
                i = true;
            }
        }
        if(vehiculo instanceof Moto){
            double base = 5000;
            double recargo = 2000;
            if(((Moto) vehiculo).getCilindraje()> 200){
                valor = base + recargo;
                i = true;
            }
            else{
                valor = base;
                i = true;
            }   
            
        }
        if(vehiculo instanceof Camion){
            double base = 7000;
            int ejes = ((Camion) vehiculo).getEjes();
            valor = base*ejes;
            i = true;
            if(((Camion) vehiculo).getCapacidadCarga()> 10){
                valor = base*ejes+0.1*base*ejes;
                i = true;
            }
            
        }
        vehiculo.setValorPeaje(valor);
        return i;
    }

    // METODO PARA RETORNAR CADENA DESCRIPTIVA
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

