package co.edu.udea.jcarlosj.reto_2;

public class Taxi extends Vehiculo {
    // Atributos
    private double distanciaRecorrida;
    private boolean segurosActivados;

    // Constructor
    public Taxi( String nombre ) {
        this .nombreConductor = nombre;
    }

    // Method
    public void gestionarMarcha() {
        if( this .motorEncendido && ! this .puertaAbierta ) {
            this .enMarcha = ! this .enMarcha;
        }
    }

    public void reiniciarTaximetro() {}

    public void presionarBotonPanico() {}

    @Override
    public void dejarPasajero() {}

    public void recogerPasajero() {}

    public void gestionarSeguro() {}

    public void calcularPasaje() {}

    @Override
    public void moverDerecha( double d ) {
        if( this .motorEncendido && this .enMarcha ) {
            this .localizacionX += d;
        }
    }

    @Override
    public void moverIzquierda( double d ) {
        if( this .motorEncendido && this .enMarcha ) {
            this .localizacionX -= d;
        }
    }

    @Override
    public void moverArriba( double d ) {
        if( this .motorEncendido && this .enMarcha ) {
            this .localizacionY += d;
        }
    }

    @Override
    public void moverAbajo( double d ) {
        if( this .motorEncendido && this .enMarcha ) {
            this .localizacionY -= d;
        }
    }

    @Override
    public String toString() {
        return "Taxi [ " +
            super.toString() +
            ", \n   distanciaRecorrida: " + this .distanciaRecorrida +
            ", \n   segurosActivados: " + this .segurosActivados +
        "\n]";
    }

}
