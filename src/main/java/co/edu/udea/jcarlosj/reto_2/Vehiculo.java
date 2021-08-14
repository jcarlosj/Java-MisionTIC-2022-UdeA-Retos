package co.edu.udea.jcarlosj.reto_2;

public abstract class Vehiculo {
    // Atributos
    protected String nombreConductor;
    protected int nPasajeros;
    protected double cantidadDinero;
    protected int nMaximoPasajeros;
    protected double localizacionX;
    protected double localizacionY;
    protected boolean puertaAbierta;
    private boolean aireAcondicionadoActivado;
    protected boolean motorEncendido;
    private boolean wifiEncendido;
    protected boolean enMarcha;

    // Abstract Methods
    public abstract void gestionarMarcha();

    // Methods
    public void dejarPasajero() {
        if( ! this .enMarcha && this .puertaAbierta ) {
            this .nPasajeros --;
        }
    }

    public double calcularDistanciaAcopio() {
        return Math .sqrt( Math .pow( this .localizacionX, 2 ) + Math .pow( this .localizacionY, 2 ) );
    }

    public void gestionarPuerta() {
        if( ! this .enMarcha ) {
            this .puertaAbierta = ! this .puertaAbierta;
        }
    }

    public void gestionarAireAcondicionado() {
        if( this .motorEncendido ) {
            this .aireAcondicionadoActivado = ! this .aireAcondicionadoActivado;
        }
    }

    public void gestionarMotor() {
        this .motorEncendido = ! this .motorEncendido;

        if( ! this .motorEncendido ) {
            this .wifiEncendido = false;
            this .aireAcondicionadoActivado = false;
        }
    }

    public void gestionarWifi() {
        if( this .motorEncendido ) {
            this .wifiEncendido = ! this .wifiEncendido;
        }
    }

    public void moverDerecha( double d ) {
        if( this .motorEncendido && this .enMarcha ) {
            this .localizacionX += d;
        }
    }

    public void moverIzquierda( double d ) {
        if( this .motorEncendido && this .enMarcha ) {
            this .localizacionX -= d;
        }
    }

    public void moverArriba( double d ) {
        if( this .motorEncendido && this .enMarcha ) {
            this .localizacionY += d;
        }
    }

    public void moverAbajo( double d ) {
        if( this .motorEncendido && this .enMarcha ) {
            this .localizacionY -= d;
        }
    }

    @Override
    public String toString() {
        return
            "\n   aireAcondicionadoActivado: " + this .aireAcondicionadoActivado +
            ", \n   cantidadDinero: " + this .cantidadDinero +
            ", \n   enMarcha: " + this .enMarcha +
            ", \n   localizacionX: " + this .localizacionX +
            ", \n   localizacionY: " + this .localizacionY +
            ", \n   motorEncendido: " + this .motorEncendido +
            ", \n   nMaximoPasajeros: " + this .nMaximoPasajeros +
            ", \n   nPasajeros: " + this .nPasajeros +
            ", \n   nombreConductor: " + this .nombreConductor +
            ", \n   puertaAbierta: " + this .puertaAbierta +
            ", \n   wifiEncendido: " + this .wifiEncendido;
    }

    

}
