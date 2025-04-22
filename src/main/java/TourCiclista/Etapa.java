package TourCiclista;

import java.util.ArrayList;
import java.util.Collections;

public class Etapa {

    private int numero;
    private String nombre;
    private ArrayList<Equipo> listaEquipos;
    private ArrayList<Ciclista> participantes;

    public Etapa(String nombre, int numero, ArrayList<Equipo> listaEquipos, ArrayList<Ciclista> participantes) {
        this.nombre = nombre;
        this.numero = numero;
        this.listaEquipos = listaEquipos;
        this.participantes = participantes;
    }

    void inicializaEtapa() {
        Equipo equipo1 = new Equipo("Sky", "Estados Unidos");
        Ciclista uno = new Ciclista("Geraint Thomas", "Sky", 71);
        Ciclista dos = new Ciclista("Egan Bernal", "Sky", 72);
        Ciclista tres = new Ciclista("Jonathan Castroviejo", "Sky", 73);
        equipo1.añadirCiclista(uno);
        equipo1.añadirCiclista(dos);
        equipo1.añadirCiclista(tres);

        Equipo equipo2 = new Equipo("Quick-Step", "Bélgica");
        Ciclista cuatro = new Ciclista("Remco Evenepoel", "Quick-Step", 81);
        Ciclista cinco = new Ciclista("Julian Alaphilippe", "Quick-Step", 82);
        Ciclista seis = new Ciclista("Kasper Asgreen", "Quick-Step", 83);
        equipo2.añadirCiclista(cuatro);
        equipo2.añadirCiclista(cinco);
        equipo2.añadirCiclista(seis);

        Equipo equipo3 = new Equipo("Movistar", "España");
        Ciclista siete = new Ciclista("Alejandro Valverde", "Movistar", 85);
        Ciclista ocho = new Ciclista("Enric Mas", "Movistar", 86);
        Ciclista nueve = new Ciclista("Pedro Acosta", "Movistar", 87);
        equipo3.añadirCiclista(siete);
        equipo3.añadirCiclista(ocho);
        equipo3.añadirCiclista(nueve);

        Equipo equipo4 = new Equipo("Jumbo-Visma", "Países Bajos");
        Ciclista diez = new Ciclista("Primož Roglič", "Jumbo-Visma", 88);
        Ciclista once = new Ciclista("Jonas Vingegaard", "Jumbo-Visma", 89);
        Ciclista doce = new Ciclista("Wout van Aert", "Jumbo-Visma", 90);
        equipo4.añadirCiclista(diez);
        equipo4.añadirCiclista(once);
        equipo4.añadirCiclista(doce);

        // Add teams and participants to the lists
        listaEquipos = new ArrayList<Equipo>();
        listaEquipos.add(equipo1);
        listaEquipos.add(equipo2);
        listaEquipos.add(equipo3);
        listaEquipos.add(equipo4);

        participantes = new ArrayList<Ciclista>();
        for (int i = 0; i < listaEquipos.size(); i++) {
            Equipo e = listaEquipos.get(i);
            for (int j = 0; j < e.getListaCiclistas().size(); j++) {
                Ciclista c = e.listaCiclistas.get(j);
                participantes.add(c);
            }
        }
    }

    public Etapa(int num, String nome) {
        this.numero = num;
        this.nombre = nome;
        inicializaEtapa();
    }

    void listarParticipantes() {
        System.out.println("CLASIFICACION GENERAL INDIVIDUAL");
        for (Ciclista c : participantes) {
            System.out.println(c);
        }
    }

    void listarEquipos() {
        System.out.println("CLASIFICACION GENERAL DE LA ETAPA");
        for (Equipo e : listaEquipos) {
            System.out.println(e);
        }
    }

    public void disputarEtapa() {
        for (Ciclista c : participantes) {
            c.correr();

        }
    }

    public void ordenaParticipantes() {
        Collections.sort(participantes);
    }

    public void ordenarEquipos() {
        Collections.sort(listaEquipos);
    }

    @Override
    public String toString() {
        return "Etapa{" +
                "listaEquipos=" + listaEquipos +
                ", numero=" + numero +
                ", nombre='" + nombre + '\'' +
                ", participantes=" + participantes +
                '}';
    }
}