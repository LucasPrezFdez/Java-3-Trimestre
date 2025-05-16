package liga2;

import java.util.ArrayList;

public class MarianoMain {

    // ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {

        SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
        SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        SeleccionFutbol raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        // CONCENTRACION
        System.out.println("\nTodos los integrantes comienzan una concentracion.");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.concentrarse();
        }

        // VIAJE
        System.out.println("\nTodos los integrantes viajan para jugar un partido.");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.viajar();
        }

        // ENTRENAR
        System.out.println("\nTodos los integrantes entrenan.");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.entrenar();
        }

        // PARTIDO DE FUTBOL
        System.out.println("\nTodos los integrantes juegan un partido de futbol.");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.jugarPartido();
        }

        //Metodos propios
        System.out.println("\nTodos los integrantes tienen metodos propios.");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            System.out.println(integrante.primaPorGanar());
            if (integrante instanceof Entrenador) {
                System.out.println(integrante);
                ((Entrenador) integrante).planificarEntrenamiento();
                ((Entrenador) integrante).jugarPartido();
            } else if (integrante instanceof Futbolista) {
                System.out.println(integrante);
                ((Futbolista) integrante).entrevista();
            } else if (integrante instanceof Masajista) {
                System.out.println(integrante);
                ((Masajista) integrante).darMasaje();
            }


        }


    }
}