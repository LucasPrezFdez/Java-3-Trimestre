package ExamenProgramacion.ej1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class testEj1 {

    public static void main(String[] args) {

        ArrayList jugadores = new ArrayList<>();
        Portero portero1 = new Portero("luis", "nose",10,0,0,0,5,6);
        Portero portero2 = new Portero("Manolo", "nose",130,0,0,0,8,0);
        Portero portero3 = new Portero("MESSI", "nose",100,0,0,0,0,100);
        Jugador jugador1 = new Jugador("Ney", "nose",50,32,4,6);
        Jugador jugador2 = new Jugador("Pedri", "nose",100,62,0,0);

        jugadores.add(portero1);
        jugadores.add(portero2);
        jugadores.add(portero1);
        jugadores.add(jugador1);
        jugadores.add(jugador2);

        for (Object jugador : jugadores){
            if (jugador instanceof Portero){
                ((Portero) jugador).imprimir();
                try (FileWriter file = new FileWriter("porteros.txt")) {
                    file.write(((Portero) jugador).toString());
                    file.write("\n---------------------------------");
                    System.out.println("se ha generado el fichero en la raiz del proyecto");
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }





    }



}
