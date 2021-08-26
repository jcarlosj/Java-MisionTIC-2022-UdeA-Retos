package co.edu.udea.jcarlosj.reto_4;

import java.util.ArrayList;

public class Condominio {
    // Atributos
    private ArrayList<Inmueble> inmuebles;              // Define nombre ArrayList de tipo Inmueble
    private Inmueble inmuebleSeleccionado;

    // Constructor
    public Condominio() {
        this .inmuebles = new ArrayList<Inmueble>();    // Crea instancia del ArrayList de tipo Inmueble
        this .inmuebleSeleccionado = null;
    }

    // Getters and setters
    public ArrayList<Inmueble> getInmuebles() {
        return this .inmuebles;
    }

    public void setInmuebles( ArrayList<Inmueble> inmuebles ) {
        this .inmuebles = inmuebles;
    }


    // Metodos
    private void buscar( String nCasa ) {

        for( Inmueble casa : this.inmuebles ) {
            // Verifica que el # de la casa que se requiere buscar se encuentre en la lista
            if( casa .getnCasa() .equals( nCasa ) ) {
                this .inmuebleSeleccionado = casa;
            }
        }

    }

    public void agregarInmueble( Inmueble i ) {
        this .buscar( i .getnCasa() );      // Busca un inmueble

        // Verifica que no exista una casa con el mismo # de casa
        if( this .inmuebleSeleccionado == null ) {
            this .inmuebles .add( i );
            this .inmuebleSeleccionado = null;
        }

    }

    public void eliminarInmueble( String ID ) {
        this .buscar( ID );                 // Busca un inmueble

        // Verifica que existe la casa con el mismo # de casa
        if( this .inmuebleSeleccionado != null ) {
            this .inmuebles .remove( this .inmuebleSeleccionado );
            this .inmuebleSeleccionado = null;
        }

    }

    public double calcularArriendoMensualCondominio() {
        double arriendosMensuales = 0.0;

        for( Inmueble casa : this .inmuebles ) {
            arriendosMensuales += casa .getCostoMensual();
        }

        return arriendosMensuales;
    }

    public double promedioCostoInmueble() {

        return this .calcularArriendoMensualCondominio() / this .inmuebles .size();
    }

    public double desviacionEstandarCostoInmueble() {
        double total = 0.0;

        for( Inmueble casa : this .inmuebles ) {
            total += Math .pow( casa .getCostoMensual() - this .promedioCostoInmueble(), 2 );
        }

        return Math .sqrt( ( 1 / (double) this .inmuebles .size() ) * total );
    }

    @Override
    public String toString() {
        return
            "\ninmuebleSeleccionado: " + this .inmuebleSeleccionado +
            "\nCondominio : { " +
            "\n  inmuebles: " + this .inmuebles +
            "\n}";
    }

}
