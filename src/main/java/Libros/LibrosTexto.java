package Libros;

public class LibrosTexto extends Libro{

    protected String curso;

    //constructor
    public LibrosTexto(String titulo, String autor, String curso) {
        super(titulo, autor);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "LibrosTexto{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", curso='" + curso + '\'' +
                ", precio=" + precio +
                '}';
    }
}
