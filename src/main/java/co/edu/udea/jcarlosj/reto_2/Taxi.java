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
        // Si el taxi está detenido y con los seguros activados,
        this .enMarcha = ( /*this .motorEncendido &&*/ ! this .enMarcha && this .segurosActivados )
            ?   true            //  activa la marcha.
            :   false;          //  Para cualquier otro caso se detiene el taxi

        // Nota: Si hay pasajeros dentro del taxi, es necesario que los seguros de las puertas estén activados para que el taxi pueda estar en marcha.
    }

    public void reiniciarTaximetro() {
        this .distanciaRecorrida = 0;
    }

    public void presionarBotonPanico(){
        this .enMarcha = false;             //  Detiene la marcha si se presiona el botón de pánico.
        this .segurosActivados = false;

        this .nPasajeros = 0;
        this .cantidadDinero = 0;
        this .distanciaRecorrida = 0;
    }

    // ! Verifica que el Taxi no este en marcha, la puerta este abierta, no tenga los seguros y que haya cupo (es decir que este vacio)
    private boolean canAbrirPuerta() {
        // Verifica que no este en marcha y los seguros no esten puestos
        return ! this .enMarcha && ! this .segurosActivados;
    }

    @Override
    public void dejarPasajero() {

        if( this .havePasajeros() && this .canAbrirPuerta() ) {
            this .nPasajeros = 0;
            this .cantidadDinero += this .calcularPasaje();
            this .reiniciarTaximetro();
        }

    }

    // public void dejarPasajero(){
    //     if(super.getnPasajeros() > 0 && super.isEnMarcha() == false && segurosActivados == false){
    //         super.setCantidadDinero(super.getCantidadDinero() + this.calcularPasaje());
    //         super.setnPasajeros(super.getnPasajeros() - 1);
    //         reiniciarTaximetro();
            
    //     }
    // }

    public void recogerPasajero() {
        // Verifica que el Taxi no este en marcha, la puerta este abierta, no tenga los seguros y que haya cupo (es decir que este vacio)
        if( this .havePuestos() && this .canAbrirPuerta() ) {
            this .nPasajeros = 1;
            this .reiniciarTaximetro();
            //this .segurosActivados = true;  // Ver Nota linea 45
        }

    }

    public void gestionarSeguros() {
        // Si el taxi está detenido y con los seguros activados
        this .segurosActivados = ( ! this .enMarcha && this .segurosActivados )
            ?   false       // estos se desactivan
            :   true;       // Para cualquier otro caso se activan.

    }

    public double calcularPasaje() {
        //System .out .println( "banderazo: " + this .banderazo + ", vK: " + this .valorPorKilometroRecorrido + ", dRecorrida: " + this .distanciaRecorrida );
        return this .banderazo + this .valorPorKilometroRecorrido * this .distanciaRecorrida;
    }

    @Override
    public void moverDerecha( double d ) {
        super .moverDerecha( d );
        this .registrarDistancia( d );
    }

    @Override
    public void moverIzquierda( double d ) {
        super .moverIzquierda( d );
        this .registrarDistancia( d );
    }

    @Override
    public void moverArriba( double d ) {
        super .moverArriba( d );
        this .registrarDistancia( d );
    }

    @Override
    public void moverAbajo( double d ) {
        super .moverAbajo( d );
        this .registrarDistancia( d );
    }

    private void registrarDistancia( double d ) {
        // Verifica que haya pasajeros para registrar distancia
        if( this .havePasajeros() && this .enMarcha ) {
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
