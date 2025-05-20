package Potter;

import java.util.ArrayList;

public class Biblioteca {

    String nombre;
    ArrayList<Libro> coleccion;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        coleccion = new ArrayList<Libro>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addLibro(Libro libro) {
        coleccion.add(libro);
    }

    public void removeLibro(Libro libro) {
        coleccion.remove(libro);
    }

    public void imprimirLibros() {
        for (Libro lib : coleccion) {
            Libro libro = (Libro) lib;
            System.out.println(lib.getReferenciaBibliografica());
            libro.imprimir();
        }

    }

}
