package Mascotas;

public class Mascota {


    protected String nombre;
    protected int edad;
    protected String color;

    public Mascota(String color, int edad, String nombre) {
        this.color = color;
        this.edad = edad;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String sonido() {
        return "hago un sonido generico";
    }



}
