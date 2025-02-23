package org.example;

//Atributos de la clase
public class Estudiante {
    private String id;
    private String nombre;
    private int edad;
    private String genero;
    private String alergias;
    private String telefono;
    private String nombreAcudiente;


    //Metodo Constructor
    public Estudiante(String id, String nombre, int edad, String genero, String alergias, String telefono, String nombreAcudiente) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.genero = genero;
        this.alergias = alergias;
        this.telefono = telefono;
        this.nombreAcudiente = nombreAcudiente;

    }


    //Metodo Geter y Seter
    public String getid(){

        return id;
    }
    public void setid(String id){

        this.id = id;
    }
    public String getnombre(){

        return nombre;
    }
    public void setnombre(String nombre){

        this.nombre = nombre;
    }
    public int getedad(){

        return edad;
    }
    public void setedad(int edad){

        this.edad = edad;
    }
    public String getgenero(){

        return genero;
    }
    public void setgenero(String genero){
        this.genero = genero;
    }
    public String getalergias(){

        return alergias;
    }
    public void setalergias(String alergias){

        this.alergias = alergias;
    }
    public String gettelefono(){

        return telefono;
    }
    public void settelefono(String telefono){

        this.telefono = telefono;
    }
    public String getnombreAcudiente(){

        return nombreAcudiente;
    }
    public void setnombreAcudiente(String nombreAcudiente){

        this.nombreAcudiente = nombreAcudiente;
    }
    }


