package Universidad;

public class Persona {

    String nombre;
    String direccion;

    public Persona(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "direccion='" + direccion + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }


    public void irAClase() {
        System.out.println(this.nombre + " de " +this.direccion+" va a clase" );
    }
}
