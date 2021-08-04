package co.edu.udea.jcarlosj.retos;

public class Bus {
    // Atributos
    private String nombreConductor;
    private int nPasajeros;
    private double cantidadDinero;
    private int nMaximoPasajeros;
    private double localizacionX;
    private double localizacionY;
    private boolean puertaAbierta;
    private boolean aireAcondicionadoActivado;
    private boolean motorEncendido;
    private boolean wifiEncendido;
    private boolean enMarcha;

    // Constructor
    public Bus(String nombreConductor, int nMaximoPasajeros, boolean puertaAbierta) {
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
        this.puertaAbierta = puertaAbierta;

        // Asignaciones por defecto
        this .aireAcondicionadoActivado = false;
        this .motorEncendido = false;
        this .wifiEncendido = false;
        this .enMarcha = false;
    }

    // Getters and setters
    public String getNombreConductor() {
        return this .nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }

    // Metodos
    public void recogerPasajero( int estrato ) {
        if( ! this .enMarcha && this .puertaAbierta && ( this .nPasajeros < this .nMaximoPasajeros ) ) {
            if( estrato >= 0 && estrato < 3 ) {     // 0, 1, 2 (Estrato)
                this .cantidadDinero += 1500;
            }
            else if( estrato < 5 ) {                // 3 y 4
                this .cantidadDinero += 2600;
            }
            else if( estrato < 7 ) {                // 5 y 6
                this .cantidadDinero += 3000;
            }

            this .nPasajeros ++;
        }
    }

    public void dejarPasajero() {
   
        if( ! this .enMarcha && this .puertaAbierta ) {
            this .nPasajeros -= 1;
        }

    }

    public double calcularDistanciaAcopio() {
        return Math .sqrt(
            Math .pow( this .localizacionX, 2 ) +
            Math .pow( this .localizacionY, 2 )
        );
    }

    public void gestionarPuerta() {
        if( ! this .enMarcha ) {
            this .puertaAbierta = ! this .puertaAbierta;
        }
    }

    // Requerimiento 1
    public void gestionarAireAcondicionado() {
        if( this .motorEncendido ) {
            this .aireAcondicionadoActivado = ! this .aireAcondicionadoActivado;
        }

        // Operador ternario 
        // ( condicion ) ? <si cumple> : <no cumple> ;
        //this .aireAcondicionadoActivado = ( this .motorEncendido ) ? '' : ! this .aireAcondicionadoActivado;
    }

    public void gestionarMotor() {
        this .motorEncendido = ! this .motorEncendido;

        // Verifica que el wifi y el aire queden apagados cuando el motor este apagado
        if( ! this .motorEncendido ) {
            this .wifiEncendido = false;
            this .aireAcondicionadoActivado = false;
        }
    }

    // Requerimiento 1
    public void gestionarWifi() {
        if( this .motorEncendido ) {
            this .wifiEncendido = ! this .wifiEncendido;
        }
    }

    public void gestionarMarcha() {
        if( this .motorEncendido && ! this .puertaAbierta ) {
            this .enMarcha = ! this .enMarcha;
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
        return "Autobus [ " +
            "  \n   nombreConductor: " + nombreConductor +
            ", \n   nPasajeros: " + nPasajeros +
            ", \n   cantidadDinero: " + cantidadDinero +
            ", \n   nMaximoPasajeros: " + nMaximoPasajeros +
            ", \n   localizacionX: " + localizacionX +
            ", \n   localizacionY: " + localizacionY +
            ", \n   puertaAbierta: " + puertaAbierta +
            ", \n   aireAcondicionadoActivado: " + aireAcondicionadoActivado +
            ", \n   motorEncendido: " + motorEncendido +
            ", \n   wifiEncendido: " + wifiEncendido +
            ", \n   enMarcha: " + enMarcha +
        " \n   ]";
    }

    // Inicializa la aplicacion
    public static void main( String args [] ) throws Exception {

        // 1. Recibe un bus
        Bus camion = new Bus( "Pepe", 30, false );
        System.out.println( "1 " + camion );

        // 2. Mover a la derecha 5
        camion .moverDerecha( 5 );
        System.out.println( "2 " + camion );

        // 3. Enciende Wifi y Aire acondicionado
        camion .gestionarWifi();
        camion .gestionarAireAcondicionado();
        camion .gestionarMarcha();
        System.out.println( "3 " + camion );

        // 4. Enciende motor, pone el bus en marcha, mover a la derecha 5
        camion .gestionarMotor();
        camion .gestionarMarcha();
        camion .moverDerecha( 5 );
        System.out.println( "4 " + camion );

        // 5. Recoger pasajero estrato 2, abrir la puerta, mover arriba 10
        camion .recogerPasajero( 2 );
        camion .gestionarPuerta();
        camion .moverArriba( 10 );
        System.out.println( "5 " + camion );

        // 6. Frena, abre la puerta, recoge tres pasajeros (estrato: 1, 4, 6)
        camion .gestionarMarcha();
        camion .gestionarPuerta();
        camion .recogerPasajero( 1 );
        camion .recogerPasajero( 4 );
        camion .recogerPasajero( 6 );
        System.out.println( "6 " + camion );

        camion .gestionarWifi();
        camion .gestionarAireAcondicionado();
        camion .gestionarMarcha();
        camion .moverIzquierda( 2 );
        System.out.println( "7. " + camion );

        camion .dejarPasajero();
        camion .gestionarMotor();
        camion .calcularDistanciaAcopio();
        System.out.println( "8. " + camion );

        System.out.println( "" );
        System.out.println( "" );
        System.out.println( "" );
    }
}
