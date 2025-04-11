package TourCiclista;

import java.util.ArrayList;

public class Etapa {

    private int numero;
    //origen destino
    private String nombre;

    // listado de equipos
    private ArrayList<Equipo> listaEquipos;

    //listadoDeTodosLosCiclistas
    private ArrayList<Ciclista> participantes;

    // inicializar listaequipos y participantes

    public Etapa(String nombre, int numero, ArrayList<Equipo> listaEquipos, ArrayList<Ciclista> participantes) {
        this.nombre = nombre;
        this.numero = numero;
        this.listaEquipos = listaEquipos;
        this.participantes = participantes;
    }

    void inicializaEtapa() {

        Equipo equipo1 = new Equipo("Movistar", "Colombia");
        Ciclista ciclista1 = new Ciclista("Juan", "Colombia", 1, "Ciclista 1");
        Ciclista ciclista2 = new Ciclista("Pedro", "Colombia", 2, "Ciclista 2");
        Ciclista ciclista3 = new Ciclista("Luis", "Colombia", 3, "Ciclista 3");

        equipo1.añadirCiclista(ciclista1);
        equipo1.añadirCiclista(ciclista2);
        equipo1.añadirCiclista(ciclista3);


        Equipo equipo2 = new Equipo("Ineos", "Reino Unido");
        Ciclista ciclista4 = new Ciclista("Carlos", "España", 4, "Ciclista 4");
        Ciclista ciclista5 = new Ciclista("Miguel", "México", 5, "Ciclista 5");
        Ciclista ciclista6 = new Ciclista("Andrés", "Argentina", 6, "Ciclista 6");

        equipo2.añadirCiclista(ciclista4);
        equipo2.añadirCiclista(ciclista5);
        equipo2.añadirCiclista(ciclista6);

    }

    // ordenar lista equipos por tiempo



    // ordenar lista equipos por tiempò



    // ordenar participantes por tiempo



    // listar participantes (GENERAL INDIVIDUAL)

    void listarParticipantes() {
        for (Ciclista c : participantes) {
            System.out.println(c);
        }
    }

    // listar equipos (GENERaL POR EQUIPOS)

    void listarEquipos() {
        for (Equipo e : listaEquipos) {
            System.out.println(e);
        }
    }

}
