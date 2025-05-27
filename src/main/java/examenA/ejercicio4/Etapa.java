package examenA.ejercicio4;

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


        // Nuevo equipo de velocistas
        Equipo equipo1 = new Equipo("Bora-Hansgrohe", "Alemania");
        Ciclista velocista1 = new Velocista("Sam Bennett", "Bora-Hansgrohe", 91, 75, 77);
        Ciclista contrarrelojista1 = new Contrarelojista("Filippo Ganna", "INEOS Grenadiers", 94, 85);
        Ciclista escalador1 = new Escalador("Rigoberto Urán", "EF Education-EasyPost", 97, 90, 1.2);

        equipo1.añadirCiclista(velocista1);
        equipo1.añadirCiclista(contrarrelojista1);
        equipo1.añadirCiclista(escalador1);
        // Nuevo equipo de contrarrelojistas

        Equipo equipo2 = new Equipo("INEOS Grenadiers", "Reino Unido");
        Ciclista velocista2 = new Velocista("Peter Sagan", "Bora-Hansgrohe", 92, 78, 75);
        Ciclista contrarrelojista2 = new Contrarelojista("Rohan Dennis", "INEOS Grenadiers", 95, 83);
        Ciclista escalador2 = new Escalador("Hugh Carthy", "EF Education-EasyPost", 98, 88, 1);
        equipo2.añadirCiclista(velocista2);
        equipo2.añadirCiclista(contrarrelojista2);
        equipo2.añadirCiclista(escalador2);

        // Nuevo equipo de escaladores
        Equipo equipo3 = new Equipo("EF Education-EasyPost", "Estados Unidos");
        Ciclista velocista3 = new Velocista("Pascal Ackermann", "Bora-Hansgrohe", 93, 80, 76);
        Ciclista contrarrelojista3 = new Contrarelojista("Ethan Hayter", "INEOS Grenadiers", 96, 82);
        Ciclista escalador3 = new Escalador("Esteban Chaves", "EF Education-EasyPost", 99, 87,0.4);
        equipo3.añadirCiclista(velocista3);
        equipo3.añadirCiclista(contrarrelojista3);
        equipo3.añadirCiclista(escalador3);

        // Add teams and participants to the lists
        listaEquipos = new ArrayList<Equipo>();
        listaEquipos.add(equipo1);
        listaEquipos.add(equipo2);
        listaEquipos.add(equipo3);

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
        for (Equipo e : listaEquipos){
            e.calcularTotalTiempo();
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
/*Equipo equipo1 = new Equipo("Sky", "Estados Unidos");
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

 */