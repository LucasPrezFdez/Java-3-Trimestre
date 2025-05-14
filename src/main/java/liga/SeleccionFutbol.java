package liga;

public abstract class SeleccionFutbol {

    protected int id;
    protected String nombre;
    protected int edad;
    protected String apellidos;

    public SeleccionFutbol(int id, String nombre, int edad, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void viajar() {
        System.out.println("Viaja (Clase SeleccionFutbol)");
    }

    public void concentrarse() {
        System.out.println("Concentrarse (Clase SeleccionFutbol)");
    }

    public abstract void entrenar();

    public abstract void partidoFutbol();

    @Override
    public String toString() {
        return "SeleccionFutbol{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
