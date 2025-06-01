package examenA.ejercicio4;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Competicion {



    public static void main(String[] args) {

//        Etapa etapa1 = new Etapa(1,"Primera");
//
//        etapa1.inicializaEtapa();
//        etapa1.disputarEtapa();
//        etapa1.ordenarEquipos();
//        etapa1.ordenaParticipantes();
//        etapa1.ordenarEquipos();
//        etapa1.listarEquipos();
//        etapa1.listarParticipantes();




        ArrayList<Etapa> carrera = new ArrayList<>();

        Etapa primera = new Etapa(1,"primera");
        Etapa segunda = new Etapa(1,"segunda");
        Etapa tercera = new Etapa(1,"tercera");



        // Crear equipos
        ArrayList<Equipo> equipos = new ArrayList<>();

        Equipo equipo1 = new Equipo("caner", "españa");
        ArrayList<Ciclista> participantesEquipo1 = new ArrayList<>();
        participantesEquipo1.add(new Velocista("Velocista1", "Pais1", 1, 30, 40));
        participantesEquipo1.add(new Escalador("Escalador1", "Pais1", 2, 200, 10));
        participantesEquipo1.add(new Contrarelojista("Contrarrelojista1", "Pais1", 3, 50));
        equipo1.setListaCiclistas(participantesEquipo1);


        Equipo equipo2 = new Equipo("manolo","peru");
        ArrayList<Ciclista> participantesEquipo2 = new ArrayList<>();
        participantesEquipo2.add(new Velocista("Velocista2", "Pais2", 4, 26, 42));
        participantesEquipo2.add(new Escalador("Escalador2", "Pais2", 5, 210, 12));
        participantesEquipo2.add(new Contrarelojista("Contrarrelojista2", "Pais2", 6, 55));
        equipo2.setListaCiclistas(participantesEquipo2);

        Equipo equipo3 = new Equipo("paco", "colombia");
        ArrayList<Ciclista> participantesEquipo3 = new ArrayList<>();
        participantesEquipo3.add(new Velocista("Velocista3", "Pais3", 7, 28, 41));
        participantesEquipo3.add(new Escalador("Escalador3", "Pais3", 8, 220, 11));
        participantesEquipo3.add(new Contrarelojista("Contrarrelojista3", "Pais3", 9, 60));
        equipo3.setListaCiclistas(participantesEquipo3);

        equipos.add(equipo1);
        equipos.add(equipo2);
        equipos.add(equipo3);

        carrera.add(primera);
        carrera.add(segunda);
        carrera.add(tercera);

        primera.setListaEquipos(equipos);
        segunda.setListaEquipos(equipos);
        tercera.setListaEquipos(equipos);


        for (Etapa etapa : carrera){
            etapa.setListaEquipos(equipos);
            etapa.simularEtapa();
            for (Equipo equipo : equipos){
                equipo.calcularTiempo();
                equipo.calcularTotalTiempo();
                equipo.posGeneral();
            }
            etapa.ordenaParticipantes();
            etapa.ordenarEquipos();
            etapa.listarEquipos();
            etapa.listarParticipantes();
        }

        System.out.println("CLASIFICACION FINAL ETAPAS\n");
        for (Equipo equipo : equipos){
            System.out.println(equipo);
        }






    }



}