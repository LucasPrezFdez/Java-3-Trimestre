package liga2;

public class SeleccionFutbol implements IntegranteSeleccionFutbol{
// CON CLASE ABSTRACTA NO NECESITO IMPLEMENTAR LOS METODOS QUE AÑADE LA INTEFAZ
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;


    public SeleccionFutbol(){
    }

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrarse (Clase Padre)");
    }

    @Override
    public void viajar() {
        System.out.println("Viajar (Clase Padre)");
    }

    public double primaPorGanar() {
        return Math.random()*1000;
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenar (Clase Padre)");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Jugar un partido (Clase Padre)");
    }

    @Override
    public String toString() {
        return "SeleccionFutbol{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
