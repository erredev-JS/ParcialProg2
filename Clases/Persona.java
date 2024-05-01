package Clases;

public abstract class Persona {

    // Atributos

    private int dni;
    private String nombre;

    // Constructores


    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }


    // Getters Y Setters


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
