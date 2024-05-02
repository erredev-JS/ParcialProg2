package Clases;

import java.util.ArrayList;

public class Prueba {
    // Atributos

    private int codigo;
    private String titulo;
    private ArrayList<Atleta> participantes = new ArrayList<>();

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




    // Metodos

    public void mostrarInfo() {
        System.out.println("Información de la Prueba:\n" +
                "Código: " + this.getCodigo() + "\n" +
                "Título: " + this.getTitulo());
    }
    public void agregarParticipante(Atleta participante){
        participantes.add(participante);
    }

    public Atleta devolverParticipante(int i) throws IndexOutOfBoundsException {
        if (i >= 0 && i < participantes.size()) {
            return participantes.get(i);
        } else {
            throw new IndexOutOfBoundsException("Participante inexistente");
        }
    }


}