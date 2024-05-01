package Clases;

public class Sede {

    // Atributos

    private int fase;
    private String fecha;
    private String hora;

    // Constructores

    public Sede(int fase, String fecha, String hora) {
        this.fase = fase;
        this.fecha = fecha;
        this.hora = hora;
    }


    // Getters Y Setters


    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void mostrarInfo() {
        System.out.println("Información de la Sede:\n" +
                "Fase: " + this.getFase() + "\n" +
                "Fecha: " + this.getFecha() + "\n" +
                "Hora: " + this.getHora());
    }



}
