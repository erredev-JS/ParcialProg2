package Clases;

import java.util.ArrayList;

public class Prueba {
    // Atributos

    private int codigo;
    private String titulo;
    private ArrayList<Instalacion> seHaceEn = new ArrayList<>();

    // Constructores

    public Prueba(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }


    // Getters Y Setters


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void agregarSeHaceEn(Instalacion instalacion) {
        seHaceEn.add(instalacion);
    }

    public void mostrarInfo() {
        System.out.println("Información de la Prueba:\n" +
                "Código: " + this.getCodigo() + "\n" +
                "Título: " + this.getTitulo());
        if (!seHaceEn.isEmpty()) {
            for (Instalacion instalacion : seHaceEn
            ) {
                System.out.println("Nombre de la instalacion: " + instalacion.getNombre() + " Localizacion de la ubicacion: " + instalacion.getLocalizacion());
            }

        } else {

            System.out.println("Esta prueba no se realiza en ninguna instalación.");
        }
    }
}