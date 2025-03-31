package Libros;

public class Libro {

//	Definir una clase Libro para manejar la información asociada a un
//	libro. La información de interés para un libro es: el título, el autor
//	y el precio. Los métodos de interés son:

    protected String titulo;
    protected String autor;
    protected float precio;

//	Un constructor para crear un objeto libro, con título y autor como parámetros.
//	○ Imprimir en pantalla el título, los autores y el precio del libro.
//	○ Métodos get y set para cada atributo de un libro

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
    }

    //get -set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


}