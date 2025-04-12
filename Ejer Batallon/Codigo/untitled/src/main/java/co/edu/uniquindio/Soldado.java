package co.edu.uniquindio;

public class Soldado {
    private String id;
    private String nombre;
    private String rango;
    private Especialidad especialidad;
    private int edad;
    private boolean estado;

    public  Soldado(String id, String nombre, String rango, Especialidad especialidad, int edad, boolean estado){
        this.id = id;
        this.nombre = nombre;
        this.rango = rango;
        this.especialidad = especialidad;
        this.edad = edad;
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "Soldado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", rango='" + rango + '\'' +
                ", edad=" + edad +
                ", especializacionSoldado=" + especialidad +
                ", disponible=" + estado +
                '}';
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getRango() {

        return rango;
    }

    public void setRango(String rango) {

        this.rango = rango;
    }

    public int getEdad() {

        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Especialidad getEspecialidad() {

        return especialidad;
    }

    public void setEspecializacionSoldado(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}




