package co.edu.udea.jcarlosj.reto_2;

public class Taxi extends Vehiculo {
    // Atributos
    private double distanciaRecorrida;
    private boolean segurosActivados;

    private int banderazo;
    private int valorPorKilometroRecorrido;

    // Constructor
    public Taxi( String nombre ) {
        this .nombreConductor = nombre;

        this .segurosActivados = false;
        this .banderazo = 3000;
        this .valorPorKilometroRecorrido = 2300;
        this .nMaximoPasajeros = 1;
    }

    // Getters and setters
    public double getDistanciaRecorrida() {
        return this .distanciaRecorrida;
    }

    public void setDistanciaRecorrida( double distanciaRecorrida ) {
        this .distanciaRecorrida = distanciaRecorrida;
    }

    public boolean isSegurosActivados() {
        return this .segurosActivados;
    }

    public void setSegurosActivados( boolean segurosActivados ) {
        this .segurosActivados = segurosActivados;
    }

    // Method
    public void gestionarMarcha() {
        if( this .motorEncendido && this .enMarcha && this .segurosActivados ) {
            this .enMarcha = ! this .enMarcha;
        }
    }

    public void reiniciarTaximetro() {
        this .distanciaRecorrida = 0;
    }

    public void presionarBotonPanico(){
        this .enMarcha = false;
        this.segurosActivados = false;

        this .setnPasajeros( 0 );
        this .cantidadDinero -= 0;
    }

    // ! Verifica que el Taxi no este en marcha, la puerta este abierta, no tenga los seguros y que haya cupo (es decir que este vacio)
    private boolean canAbrirPuerta() {

        return ! this .enMarcha && ! this .segurosActivados && this .havePuestos();
    }

    @Override
    public void dejarPasajero() {
        // Verifica que el Taxi no este en marcha, la puerta este abierta y que no tenga los seguros
        if( this .canAbrirPuerta() ) {
            this .setnPasajeros( 0 );
            this .reiniciarTaximetro();
            this .cantidadDinero -= this .calcularPasaje();
        }

    }

    public void recogerPasajero() {
        // Verifica que el Taxi no este en marcha, la puerta este abierta, no tenga los seguros y que haya cupo (es decir que este vacio)
        if( this .canAbrirPuerta() ) {
            this .setnPasajeros( 1 );
            this .reiniciarTaximetro();
        }

    }

    public void gestionarSeguros() {

        this .segurosActivados = ( ! this .enMarcha && this .segurosActivados )
            ?   false       // Si el taxi está detenido y con los seguros activados, estos se desactivan
            :   true;       // Para cualquier otro caso se activan.

    }

    public double calcularPasaje() {
        return this .banderazo + this .valorPorKilometroRecorrido * this .distanciaRecorrida;
    }

    @Override
    public void moverDerecha( double d ) {
        if( this .motorEncendido && this .enMarcha ) {
            this .localizacionX += d;
            this .registrarDistancia( d );
        }
    }

    @Override
    public void moverIzquierda( double d ) {
        if( this .motorEncendido && this .enMarcha ) {
            this .localizacionX -= d;
            this .registrarDistancia( d );
        }
    }

    @Override
    public void moverArriba( double d ) {
        if( this .motorEncendido && this .enMarcha ) {
            this .localizacionY += d;
            this .registrarDistancia( d );
        }
    }

    @Override
    public void moverAbajo( double d ) {
        if( this .motorEncendido && this .enMarcha ) {
            this .localizacionY -= d;
            this .registrarDistancia( d );
        }
    }

    private void registrarDistancia( double d ) {
        // Verifica que haya pasajeros para registrar distancia
        if( this .havePasajeros() ) {
            this .distanciaRecorrida += d;
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
