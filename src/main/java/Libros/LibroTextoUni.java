package Libros;

public final class LibroTextoUni extends LibrosTexto{

    private String facultad;

    public LibroTextoUni(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }


    @Override
    public String toString() {
        return "LibroTextoUni{" +
                "facultad='" + facultad + '\'' +
                ", curso='" + curso + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
