package sw1;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.*;
import java.util.ArrayList;

public class ListaPersonas {

    private static final String NOMBRE_FICHERO = "DATOD.OBJ";

    ArrayList<Persona> listaPersonas;

    public ListaPersonas() {
        listaPersonas = new ArrayList<Persona>();
    }

    public ListaPersonas (ArrayList<Persona> conjunto) {
        this.listaPersonas=conjunto;
    }

    public void anadirPersona(Persona p) {
        listaPersonas.add(p);
    }

    public void eliminarPersona(int i) {
        listaPersonas.remove(i);
    }

    public void borrarLista() {
        listaPersonas.removeAll(listaPersonas);
    }

    public static void guardarArrayList(ListaPersonas lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_FICHERO))) {
            oos.writeObject(lista);
            System.out.println("ArrayList guardado correctamente en " + NOMBRE_FICHERO);
        } catch (IOException e) {
            System.err.println("Error al guardar el ArrayList: " + e.getMessage());
        }
    }

    public static ArrayList<Persona> cargarArrayList() {
        ArrayList<Persona> lista = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOMBRE_FICHERO))) {
            lista = (ArrayList<Persona>) ois.readObject();
            System.out.println("ArrayList cargando correctamente desde " + NOMBRE_FICHERO);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar el ArrayList: " + e.getMessage());
        }
        return new ListaPersonas(lista);
    }

}
