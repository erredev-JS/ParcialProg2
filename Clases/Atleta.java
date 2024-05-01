package Clases;


import java.util.ArrayList;

public class Atleta extends Persona implements Contrato{
    // Atributos
    private double altura;
    private int edad;
    private double peso;
    private ArrayList<EquipoNacional> equiposNacionales = new ArrayList<>();
    private ArrayList<Prueba> pruebasParticipa = new ArrayList<>();

    // Constructores

    public Atleta(int dni, String nombre, double altura, int edad, double peso) {
        super(dni, nombre);
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
    }


    // Getters Y Setters

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    // Metodos

    // Interface
    public double calcularIMC(){
        return peso / Math.pow(altura, 2);
    }

    public boolean hayPesoExtra(double peso) {
        double imc = calcularIMC();
        return imc >= 25 && imc < 30;
    }
    public double tomarPulsaciones(){
        return 220 - edad;
    }
    // No interface

    public void agregarEquipoNacional(EquipoNacional equipoNacional){
        equiposNacionales.add(equipoNacional);
    }
    public void agregarPruebasParticipa(Prueba prueba){
        pruebasParticipa.add(prueba);
    }
    public void mostrarInfo(){
        System.out.println("Información del Atleta:\n" +
                "Nombre: " + this.getNombre() + "\n" +
                "DNI: " + this.getDni() + "\n" +
                "Altura: " + this.getAltura() + " metros\n" +
                "Edad: " + this.getEdad() + " años\n" +
                "Peso: " + this.getPeso() + " kilogramos\n" +
                "IMC: " + this.calcularIMC() + "\n" +
                "Peso extra: " + (this.hayPesoExtra(this.getPeso()) ? "Sí" : "No") + "\n" +
                "Pulsaciones máximas teóricas: " + this.tomarPulsaciones() + "\n" +
                "------------------------------------");
        System.out.println("Equipos Nacionales: ");
        this.mostrarEquiposNacionales();

    }
    public void mostrarEquiposNacionales(){
        if(!equiposNacionales.isEmpty()){
            for (EquipoNacional equipo: equiposNacionales
                 ) {
                equipo.mostrarInfo();
            }
        }else{
            System.out.println("El atleta no participa en ningun equipo nacional.");
        }
    }
}
