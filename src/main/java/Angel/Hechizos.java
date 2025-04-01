package Angel;
/*
public class Hechizo {


   enum TiposHechizo {
       Transformacion, Encantamiente, Embrujo, Malefico
   };


   String nombre = "default"; // nombre del hechizo
   String descripcion; // Breve descripción del hechizo
   private boolean preparado = true; // Determina si está preparado para lanzar el hechizo


   TiposHechizo tipo = TiposHechizo.Transformacion;


   String nombreHechizero; // Nombre del hechizero
   int nivelHechizero; // Nivel alcanzado por el hechicero
   float destrezaHechizero; // Destreza del hechizero
   float manaHechizero; // Cantidad de maná del hechizero


   boolean puede_lanzar_hechizo() {
       if (preparado) {
           if (manaHechizero > 0) {
               return true;
           } else {
               return false;
           }
       } else {
           return false;
       }
   }


   // Calcula el daño de una carta
   float calcularDannoDelHechizoQueSeVaAAplicarCuandoAtaca() {
       switch (tipo) {
           case Transformacion:
               return nivelHechizero * 2 + destrezaHechizero;
           case Encantamiente:
               return nivelHechizero * 1 + destrezaHechizero;
           case Embrujo:
               return nivelHechizero / 2 + destrezaHechizero;
           case Malefico:
               return nivelHechizero * 2;
           default:
               return 0;
       }


   }


   public static void main(String[] args) {


       Hechizo c = new Hechizo();
       c.nivelHechizero=2;
       c.destrezaHechizero=3;
       c.manaHechizero=10;
       c.tipo = TiposHechizo.Embrujo;
       System.out.println(c.calcularDannoDelHechizoQueSeVaAAplicarCuandoAtaca());


   }
}
 */


import java.util.ArrayList;

class Hechicero{
    String nombre;
    int nivel;
    float destreza;
    float mana;

    ArrayList<Hechizos> hechizos  = new ArrayList<Hechizos>();
}

public abstract class Hechizos {

    String nombre = "default"; // nombre del hechizo
    String descripcion; // Breve descripción del hechizo
    private boolean preparado = true; // Determina si está preparado para lanzar el hechizo

    // constructor
    public Hechizos(Hechicero hechicero){
        this.hechicero = hechicero;
    }

    // El hechicero que lanza el hechizo
    Hechicero hechicero;

    boolean puedeLanzarHechizo() {
        return preparado && hechicero.mana > 0;
    }

    // Calcula el daño de una carta
    abstract float calcularDanno();
}

class HechizoTransformacion extends Hechizos {
    public HechizoTransformacion(Hechicero hechicero){
        super(hechicero);
    }
    @Override
    float calcularDanno() {
        return hechicero.nivel * 2 + hechicero.destreza;
    }
}
class HechizoEncantimiento extends Hechizos {
    public HechizoEncantimiento(Hechicero hechicero){
        super(hechicero);
    }
    @Override
    float calcularDanno() {
        return hechicero.nivel * 1 + hechicero.destreza;
    }
}
class HechizoEmbrujo extends Hechizos {
    public HechizoEmbrujo(Hechicero hechicero){
        super(hechicero);
    }
    @Override
    float calcularDanno() {
        return hechicero.nivel / 2 + hechicero.destreza;
    }
}
class HechizoMalefico extends Hechizos {
    public HechizoMalefico(Hechicero hechicero){
        super(hechicero);
    }
    @Override
    float calcularDanno() {
        return hechicero.nivel * 2;
    }
}


class Principal{

    public Principal(){
        Hechicero h1 = new Hechicero();

        Hechizos c1 = new HechizoEncantimiento( h1 );
        Hechizos c2 = new HechizoMalefico( h1 );

        h1.hechizos.add(c1);
        h1.hechizos.add(c2);

        c1.hechicero.nivel=2;
        c1.hechicero.destreza=3;
        c1.hechicero.mana=10;
        System.out.println(c1.calcularDanno());
    }
    public static void main(String[] args) {
        new Principal();
    }
}