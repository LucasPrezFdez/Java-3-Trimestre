package Potter;

public class Libro {

    String titulo;
    String autor;
    int anoPub;
    String editorial;
    String referenciaBibliografica;

    public Libro(String titulo, String autor, int añoPub, String editorial, String referenciaBibliografica) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPub = añoPub;
        this.editorial = editorial;
        this.referenciaBibliografica = referenciaBibliografica;
    }

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
    public int getAnoPub() {
        return anoPub;
    }
    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public String getReferenciaBibliografica() {
        return referenciaBibliografica;
    }
    public void setReferenciaBibliografica(String referenciaBibliografica) {
        this.referenciaBibliografica = referenciaBibliografica;
    }

    void imprimir() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + anoPub);
        System.out.println("Editorial: " + editorial);
        System.out.println("Referencia Bibliográfica: " + referenciaBibliografica);
        System.out.println();
    }
}
