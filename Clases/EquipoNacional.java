package Clases;

import java.util.ArrayList;

public class EquipoNacional {
    // Atributos
        private String color;
        private String pais;

        private ArrayList<Atleta> integrantes = new ArrayList<>();
    // Constructores

    public EquipoNacional(String color, String pais) {
        this.color = color;
        this.pais = pais;
    }

    // Getters Y Setters


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void mostrarInfo() {
        System.out.println("Información del Equipo Nacional:\n" +
                "País: " + this.getPais() + "\n" +
                "Color: " + this.getColor());

        for (Atleta integrante: integrantes
             ) {
            integrante.mostrarInfo();
        }
    }

    public void agregarIntegrante(Atleta integrante){
        integrantes.add(integrante);
    }



}
