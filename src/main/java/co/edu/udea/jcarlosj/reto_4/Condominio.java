package co.edu.udea.jcarlosj.reto_4;

import java.util.ArrayList;

public class Condominio {
    // Atributos
    private ArrayList<Inmueble> inmuebles;              // Define nombre ArrayList de tipo Inmueble

    public Condominio() {
        this .inmuebles = new ArrayList<Inmueble>();    // Crea instancia del ArrayList de tipo Inmueble
    }

    // Metodos
    public void agregarInmueble( Inmueble i ) {}

    public void eliminarInmueble( String ID ) {}

    public double calcularArriendoMensualCondominio() {}

    public double promedioCostoInmueble() {}

    public double desviacionEstandarCostoInmueble() {}

    @Override
    public String toString() {
        return "Condominio [ " + "\n   inmuebles: " + this .inmuebles + "\n]";
    }

}
