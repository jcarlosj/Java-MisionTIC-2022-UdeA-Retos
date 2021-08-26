package co.edu.udea.jcarlosj.reto_4;

import java.util.ArrayList;

public class Nomina {
    // Atributos
    private ArrayList<Trabajador> trabajadores;
    private Trabajador trabajadorSeleccionado;

    // Constructor
    public Nomina() {
        this .trabajadores = new ArrayList<Trabajador>();
        this .trabajadorSeleccionado = null;
    }

    // Metodos
    private void buscar( String cC ) {

        for( Trabajador trabajador : this .trabajadores ) {
            // Verifica que el # de identificacion del trabajador que se requiere buscar en la lista
            if( trabajador .getCC() .equals( cC ) ) {
                this .trabajadorSeleccionado = trabajador;
            }
        }

    }

    public void agregarTrabajador( Trabajador t ) {
        this .buscar( t .getCC() );      // Busca un Trabajador

        // Verifica que no exista un trabajador con el mismo # de identificacion
        if( this .trabajadorSeleccionado == null ) {
            this .trabajadores .add( t );
        }

        this .trabajadorSeleccionado = null;

    }

    public void eliminarTrabajador( String ID ) {
        this .buscar( ID );                 // Busca un Trabajador

        // Verifica que existe un trabajador con # de identificacion
        if( this .trabajadorSeleccionado != null ) {
            this .trabajadores .remove( this .trabajadorSeleccionado );
            this .trabajadorSeleccionado = null;
        }

    }

    public double calcularSalarioQuincenaNomina() {
        double salariosMensuales = 0.0;

        for( Trabajador trabajador : this .trabajadores )
            salariosMensuales += trabajador .salarioQuincenal();

        return salariosMensuales;
    }

    public double promedioEdadNomina() {
        int sumatoriaEdades = 0;

        for( Trabajador trabajador : this .trabajadores )
            sumatoriaEdades += trabajador. calcularEdad();

        return sumatoriaEdades / this .trabajadores .size();
    }

    public double desviacionEstandarEdadNomina() {
        double total = 0.0;

        for( Trabajador trabajador : this .trabajadores ) {
            total += Math .pow( trabajador .calcularEdad() - this .promedioEdadNomina(), 2 );
        }

        return Math .sqrt( ( 1 / (double) this .trabajadores .size() ) * total );
    }

    public double salarioQuincenalTrabajador( String ID ) {
        double salarioQuincenal = -1;

        this .buscar( ID );                 // Busca un Trabajador

        // Verifica que existe un trabajador con # de identificacion
        if( this .trabajadorSeleccionado != null ) {
            salarioQuincenal = this .trabajadorSeleccionado .salarioQuincenal();
            this .trabajadorSeleccionado = null;
        }

        return salarioQuincenal;
    }

    @Override
    public String toString() {
        return
            "\ntrabajadorSeleccionado: " + this .trabajadorSeleccionado +
            "\nNomina { " +
            "\n  trabajadores: " + this .trabajadores +
            "\n}";
    }

}
