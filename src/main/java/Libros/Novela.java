package Libros;

public class Novela extends Libro {

    enum tipo{
        HISTORICA, ROMANTICA, POLITICA, REALISTA, CIENCIA_FICCION, AVENTURAS
    }

    private tipo tipo_novela;

    public Novela(String titulo, String autor, tipo tipo_novela) {
        super(titulo, autor);
        this.tipo_novela = tipo_novela;
    }

    public tipo getTipo_novela() {
        return tipo_novela;
    }

    public void setTipo_novela(tipo tipo_novela) {
        this.tipo_novela = tipo_novela;
    }

    @Override
    public String toString() {
        return "Novela{" +
                "tipo_novela=" + tipo_novela +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
