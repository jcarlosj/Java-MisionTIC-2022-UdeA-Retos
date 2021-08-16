package co.edu.udea.jcarlosj.reto_2;

public class Autobus extends Vehiculo {

    // Constructor
    public Autobus( String nombre, int nMaximoPasajeros ) {
        this .nombreConductor = nombre;
        this .nMaximoPasajeros = nMaximoPasajeros;

        this .puertaAbierta = false;
    }

    // Static Methods
    public static int calcularPasaje( int estrato )  {
        int valor = 0;

        if( estrato >= 0 && estrato < 3 ) valor = 1500;
        else if( estrato < 5 ) valor = 2600;
        else if( estrato < 7 ) valor = 3000;

        return valor;
    }

    // Methods
    public void recogerPasajero( int estrato ) {
        /* Para poder que una persona se suba, la puerta debe estar abierta, 
           y enconsecuencia el autobús no puede estar en marcha */
        if( this .puertaAbierta && ! this .enMarcha && this .havePuestos() ) {

            this .cantidadDinero += Autobus .calcularPasaje( estrato );
            this .nPasajeros ++;

        }
    }

    public void gestionarMarcha() {
        // Si el autobús está detenido y con la puertacerrada.
        this .enMarcha = ( /*this .motorEncendido &&*/ ! this .enMarcha && ! this .puertaAbierta )
            ?   true        //  activa la marcha
            :   false;      //  Para cualquier otro caso se detiene el autobús.

    }

    public void gestionarPuerta() {
        //  Si la puerta está cerrada y el autobús NO está en marcha
        this .puertaAbierta = ( ! this .puertaAbierta && ! this .enMarcha )
            ?   true                //  la abre
            :   false;              //  Para cualquier otro caso se cierra la puerta.

        // Nota: (El funcionamiento de la puerta no se ve afectado por el estado del motor)
    }

    @Override
    public String toString() {
        return "Autobus [ " + super .toString() + " \n]";
    }

}
