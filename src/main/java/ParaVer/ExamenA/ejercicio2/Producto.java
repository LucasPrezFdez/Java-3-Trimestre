package ParaVer.ExamenA.ejercicio2;

public abstract class Producto {
    protected String nombre;
    protected float precio;

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return nombre + " - $" + precio;
    }
}
