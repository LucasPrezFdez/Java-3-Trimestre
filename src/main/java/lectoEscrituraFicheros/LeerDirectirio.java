package lectoEscrituraFicheros;

import java.io.File;
import java.io.IOException;

public class LeerDirectirio {


    public static void main(String[] args) {

        File directorio = new File("C:\\Users\\Primero DAM\\IdeaProjects\\Java-3-Trimestre\\src\\main\\java\\lectoEscrituraFicheros");

        String[] archivosString = directorio.list();
        for (int i = 0; i < archivosString.length; i++) {
            System.out.println("Archivo: " + archivosString[i]);
        }

        File rutaBase = new File("C:\\Users\\Primero DAM\\IdeaProjects\\Java-3-Trimestre\\src\\main\\java\\lectoEscrituraFicheros");

        File carpeta = new File(rutaBase, "miCarpeta");
        if (!directorio.exists()) {
            if (directorio.mkdir()) {
                System.out.println("Directorio creado correctamnete en: " + carpeta.getAbsolutePath());
            } else {
                System.out.println("No se pudo crear el directorio");
                return;
            }
        } else {
            System.out.println("El directorio ya existe");
        }

        File fichero = new File(carpeta, "ejemplo.txt");
        try {
            if (fichero.createNewFile()) {
                System.out.println("Fichero creado correctamente: " + fichero.getAbsolutePath());
            } else {
                System.out.println("El fichero ya existe.");
            }
        } catch (IOException e) {
            System.err.println("Error al crear el fichero: " + e.getMessage());
        }

        System.out.println("Contenido del directorio "+ carpeta.getAbsolutePath() + " :");
        File[] archivos = carpeta.listFiles();
        if (archivos != null) {
            for (File archivo : archivos){
                System.out.println(archivo.getName());
            }
        }


    }
}
