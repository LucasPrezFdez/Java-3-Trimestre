package Libros;

import java.util.ArrayList;

public class SimulaLibro {

    public static void main(String[] args) {

        Libro libro = new Libro("Niggerman", "Yo");
        libro.setPrecio(7.5f);
        LibrosTexto librosTexto = new LibrosTexto("Spiderman", "Mio", "Primero de Dam");
        librosTexto.setPrecio(7.5f);
        LibroTextoUni libroTextoUni = new LibroTextoUni("Messi", "Cuchitini",
                "Primero de Teleco", "Ingenieria");
        libroTextoUni.setPrecio(7.5f);
        Novela novela = new Novela("Wigeta", "Vegeta", Novela.tipo.CIENCIA_FICCION);
        novela.setPrecio(7.5f);

        System.out.println(libro.toString());
        System.out.println(librosTexto.toString());
        System.out.println(libroTextoUni.toString());
        System.out.println(novela.toString());



        ArrayList<Libro> cole =new ArrayList<>();
        cole.add(libro);
        cole.add(librosTexto);
        cole.add(libroTextoUni);
        cole.add(novela);

        for (Libro l : cole)
            System.out.println(l.toString());


    }




}
