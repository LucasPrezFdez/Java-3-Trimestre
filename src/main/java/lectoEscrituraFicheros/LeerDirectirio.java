package lectoEscrituraFicheros;

import java.io.File;

public class LeerDirectirio {


    public static void main(String[] args) {

        File directorio = new File("C:\\Users\\Primero DAM\\IdeaProjects\\Java-3-Trimestre\\src\\main\\java\\lectoEscrituraFicheros");

        String[] archivos = directorio.list();
        for (int i = 0; i< archivos.length; i++){
            System.out.println("Archivo: "+archivos[i]);
        }


    }
}
