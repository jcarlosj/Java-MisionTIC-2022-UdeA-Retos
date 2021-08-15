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
        if( ! this .enMarcha && this .puertaAbierta && this .havePuestos() ) {

            this .cantidadDinero += Autobus .calcularPasaje( estrato );
            this .nPasajeros ++;

        }
    }

    public void gestionarMarcha() {
        if( this .motorEncendido && ! this .puertaAbierta ) {
            this .enMarcha = ! this .enMarcha;
        }
    }

    @Override
    public String toString() {
        return "Autobus [ " + super .toString() + " \n]";
    }

}
