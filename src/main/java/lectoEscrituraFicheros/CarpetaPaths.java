package lectoEscrituraFicheros;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CarpetaPaths {


    public static void main(String[] args) {

        String rutaActual = System.getProperty("user.dir");
        System.out.println("Directorio actual: " + rutaActual);

        Path rutaBase = Paths.get(System.getProperty("user.dir"));
        Paths.get("/tmp"); //en linux / mac

        Path nuevoDirectorio = rutaBase.resolve("miDirectorio");

        try {
            if (!Files.exists(nuevoDirectorio)) {
                Files.createDirectory(nuevoDirectorio);
                System.out.println("Directorio creado: " + nuevoDirectorio.toAbsolutePath());
            } else {
                System.out.println("El directorio ya existe.");
            }

            Path nuevoFichero = nuevoDirectorio.resolve("ejemplo33.txt");
            if (!Files.exists(nuevoFichero)) {
                Files.createFile(nuevoFichero);
                System.out.println("Fichero creado: " + nuevoFichero.toAbsolutePath());
            } else {
                System.out.println("El fichero ya existe");
            }

            System.out.println("Contenido de " + nuevoDirectorio.toAbsolutePath() + ":");
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(nuevoDirectorio)) {
                for (Path entry : stream) {
                    System.out.println(entry.getFileName());
                }
            }
        } catch (IOException e) {
            System.err.println("Error : " + e.getMessage());
        }

        System.out.println("dime el contenido de todos mis paquetes dentro de tercera");
        Path base = Paths.get("C:\\Users\\Primero DAM\\IdeaProjects\\Java-3-Trimestre");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(base)) {
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        } catch (IOException e) {
            System.err.println("Error : " + e.getMessage());

        }
    }
}
