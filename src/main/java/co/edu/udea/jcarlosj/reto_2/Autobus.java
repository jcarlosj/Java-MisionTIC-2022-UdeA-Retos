package co.edu.udea.jcarlosj.reto_2;

public class Autobus extends Vehiculo {

    // Constructor
    public Autobus( String nombre, int nMaximoPasajeros ) {
        this .nombreConductor = nombre;
        this .nMaximoPasajeros = nMaximoPasajeros;
    }

    // Metodos
    public void recogerPasajero( int estrato ) {
        if( ! this .enMarcha && this .puertaAbierta && ( this .nPasajeros < this .nMaximoPasajeros ) ) {

            if( estrato >= 0 && estrato < 3 ) {
                this .cantidadDinero += 1500;
            }
            else if( estrato < 5 ) {
                this .cantidadDinero += 2600;
            }
            else if( estrato < 7 ) {
                this .cantidadDinero += 3000;
            }

            this .nPasajeros ++;
        }
    }

    public void gestionarMarcha() {
        if( this .motorEncendido && ! this .puertaAbierta ) {
            this .enMarcha = ! this .enMarcha;
        }
    }

    public void calcularPasaje( /** int */ )  {}

    @Override
    public String toString() {
        return "Autobus [ " + super .toString() + " \n]";
    }

}
