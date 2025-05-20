package Perrari;

public class Llanta {

    String marca;
    int diametro;
    int altura;
    int anchura;

    Llanta (String marca, int diametro, int altura, int anchura) {
        this.marca = marca;
        this.diametro = diametro;
        this.altura = altura;
        this.anchura = anchura;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    void imprimir() {
        System.out.println("Marca = "+marca);
        System.out.println("Diametro = "+diametro);
        System.out.println("Altura = "+altura);
        System.out.println("Anchura = "+anchura);
    }
}
