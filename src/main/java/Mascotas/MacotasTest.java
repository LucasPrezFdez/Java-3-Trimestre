package Mascotas;

import java.util.ArrayList;


public class MacotasTest {

    public static void main(String[] args) {
        ArrayList<Mascota> jauria = new ArrayList<Mascota>();

        //un objeto de cada clase
        Mascota cota = new Mascota("verde", 1 , "a");
        Perro perro = new Perro("marron", 1,"guau",false,3.5);
        Gato gato = new Gato("white",16,"miau",2.5,3.2);

        PerroGrande pg = new PerroGrande("rosa",4,"pg",true,5.6, PerroGrande.razas.doberman);
        PerroMediano pm = new PerroMediano("amarillo",5,"pm",false, 12, PerroMediano.razas.galgo);
        PerroPequeño pp = new PerroPequeño("rojo",4,"pp",true,45, PerroPequeño.razas.caniche);

        GatoSinPelo gsp = new GatoSinPelo("naranja",56,"gsp",1,2, GatoSinPelo.razas.elfo);
        GatoPeloCorto gpc = new GatoPeloCorto("verde listado", 12,"gpc",2,0, GatoPeloCorto.razas.azulRuso);
        GatoPeloLargo gpl = new GatoPeloLargo("blanco",7,"gpl",4,4, GatoPeloLargo.razas.angora);


        jauria.add(cota);
        jauria.add(perro);
        jauria.add(gato);
        jauria.add(pg);
        jauria.add(pm);
        jauria.add(pp);
        jauria.add(gsp);
        jauria.add(gpc);
        jauria.add(gpl);

        System.out.println("COLECCION DE TIENDA\n");
        for (Mascota pako : jauria){
            System.out.println(pako);
            System.out.println(pako.sonido());
        }

    }

}
