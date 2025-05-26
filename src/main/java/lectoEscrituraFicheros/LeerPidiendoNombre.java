package lectoEscrituraFicheros;

import java.io.*;
import java.util.Scanner;

public class LeerPidiendoNombre {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String nombreArchivo; /* prueba.txt */
        FileInputStream archivo;
        InputStreamReader conversor;
        BufferedReader filtro;
        String linea;

        System.out.println("Introduce el nombre del archivo que deseas leer (Incluyendo extension) : ");
        nombreArchivo = sc.nextLine();

        try {
            archivo = new FileInputStream(nombreArchivo);
            conversor = new InputStreamReader(archivo);
            filtro = new BufferedReader(conversor);
            linea = filtro.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = filtro.readLine();
            }
            filtro.close();
        } catch (FileNotFoundException e) {
            System.err.println("No se encontro el archivo: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error de E/S: " + e.getMessage());
        }


    }
}
