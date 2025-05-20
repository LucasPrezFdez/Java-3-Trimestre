package Potter;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional");
        Libro libro1 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling",
                1997, "Sudamerica", "978-3-16-148410-0");
        Libro libro2 = new Libro("Harry Potter y la camara secreta", "J.K. Rowling",
                1998, "Sudamerica", "978-3-16-148410-1");
        Libro libro3 = new Libro("Harry Potter y el prisionero de Azkaban", "J.K. Rowling",
                1999, "Sudamerica", "978-3-16-148410-2");

        biblioteca.addLibro(libro1);
        biblioteca.addLibro(libro2);
        biblioteca.addLibro(libro3);
        biblioteca.imprimirLibros();




    }

}
