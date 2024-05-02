import Clases.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Atleta a1 = new Atleta(454009999, "Hector Quevedo", 1.78, 19, 63.5);
        Atleta a2 = new Atleta(454009889, "Joel Martinez", 1.88, 39, 113.25);
        Atleta a3 = new Atleta(454001111, "Nicolas Maquivelo", 1.38, 15, 50.5);
        Instalacion i1 = new Instalacion("Open","Mendoza", "Torito Rodriguez", "Gimnasio Boxistico");
        EquipoNacional e1 = new EquipoNacional("Celeste", "Argentina");

        Prueba p1 = new Prueba(1, "Guantes de oro");
        Prueba p2 = new Prueba(2, "Clasificatorio Olimpico");
        i1.agregarPrueba(p1);
        i1.agregarPrueba(p2);
        p2.agregarParticipante(a1);
        p2.agregarParticipante(a2);
        p2.agregarParticipante(a3);

        e1.agregarIntegrante(a1);
        e1.agregarIntegrante(a2);
        e1.agregarIntegrante(a3);

        a1.agregarEquipoNacional(e1);
        a2.agregarEquipoNacional(e1);
        a3.agregarEquipoNacional(e1);



        Sede s1 = new Sede(2,"25/06/24", "15:00PM");

        // Desde un objeto Instalacion:

        System.out.println("Nombre del 3er atleta de la 2da prueba.");

        System.out.println(i1.devolverPrueba(1).devolverParticipante(2).getNombre());

        System.out.println("Codigo de la 2da prueba");

        System.out.println(i1.devolverPrueba(1).getCodigo());

        // Desde un objeto equipo nacional Altura de todos los atletas y
        //Peso extra de cada atleta.

        e1.mostrarInfo();
    }
}