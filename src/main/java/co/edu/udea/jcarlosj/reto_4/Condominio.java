package co.edu.udea.jcarlosj.reto_4;

import java.util.ArrayList;

public class Condominio {
    // Atributos
    private ArrayList<Inmueble> inmuebles;              // Define nombre ArrayList de tipo Inmueble

    public Condominio() {
        this .inmuebles = new ArrayList<Inmueble>();    // Crea instancia del ArrayList de tipo Inmueble
    }

    // Metodos
    private Inmueble buscar( String nCasa ) {
        Inmueble casaEncontrada = null;

        for( Inmueble casa : this.inmuebles ) {
            if( casa .getnCasa() .equals( nCasa ) ) {
                casaEncontrada = casa;
            }
        }

        return casaEncontrada;
    }

    public void agregarInmueble( Inmueble i ) {
        // Verifica que no exista una casa con el mismo # de casa
        if( this .buscar( i .getnCasa() ) == null ) {
            this .inmuebles .add( i );
        }
    }

    public void eliminarInmueble( String ID ) {

        // Verifica que existe la casa con el mismo # de casa
        if( this .buscar( ID ) != null ) {
            this .inmuebles .remove( this .buscar( ID ) );
        }
    }

    public double calcularArriendoMensualCondominio() {}

    public double promedioCostoInmueble() {}

    public double desviacionEstandarCostoInmueble() {}

    @Override
    public String toString() {
        return "Condominio : { " + "\n  inmuebles: " + this .inmuebles + "\n}";
    }

}
