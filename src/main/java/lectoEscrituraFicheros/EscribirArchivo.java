package lectoEscrituraFicheros;

import java.io.*;
import java.util.Scanner;

public class EscribirArchivo {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        FileWriter archivo = null;
        PrintWriter impresor = null;


        try {
            System.out.println("creando fichero...");
            archivo = new FileWriter("pruebaEscribirArchivo.txt"); /* funciona lol */
            impresor = new PrintWriter(archivo);
            for (int i = 0; i < 10; i++) {
                impresor.println("Linea " + i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (archivo != null)
                    archivo.close();
                System.out.println("cerrando fichero...");
            } catch (Exception e2){
                e2.printStackTrace();
            }
        }


    }

}
