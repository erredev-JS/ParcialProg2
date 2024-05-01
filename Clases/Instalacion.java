package Clases;

public class Instalacion {

    // Atributos

    private String categoria;
    private String localizacion;
    private String nombre;
    private String tipo;

    // Constructores

    public Instalacion(String categoria, String localizacion, String nombre, String tipo) {
        this.categoria = categoria;
        this.localizacion = localizacion;
        this.nombre = nombre;
        this.tipo = tipo;
    }


    // Getters Y Setters


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarInfo() {
        System.out.println("Información de la Instalación:\n" +
                "Nombre: " + this.getNombre() + "\n" +
                "Categoría: " + this.getCategoria() + "\n" +
                "Localización: " + this.getLocalizacion() + "\n" +
                "Tipo: " + this.getTipo());
    }


}
