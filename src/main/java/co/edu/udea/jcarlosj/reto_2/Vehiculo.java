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
    private boolean aireAcondicionadoActivado = false;
    protected boolean motorEncendido = false;
    private boolean wifiEncendido = false;
    protected boolean enMarcha = false;

    // Getters and setters
    public String getNombreConductor() {
        return this .nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this .nombreConductor = nombreConductor;
    }

    public int getnPasajeros() {
        return this .nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        // Verifica si hay puestos disponibles
        if( this .havePuestos() ) {
            this .nPasajeros = nPasajeros;
        }
    }

    public double getCantidadDinero() {
        return this .cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this .cantidadDinero = cantidadDinero;
    }

    public int getnMaximoPasajeros() {
        return this .nMaximoPasajeros;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this .nMaximoPasajeros = nMaximoPasajeros;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionX(double localizacionX) {
        this .localizacionX = localizacionX;
    }

    public double getLocalizacionY() {
        return this .localizacionY;
    }

    public void setLocalizacionY(double localizacionY) {
        this .localizacionY = localizacionY;
    }

    public boolean isPuertaAbierta() {
        return this .puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this .puertaAbierta = puertaAbierta;
    }

    public boolean isAireAcondicionadoActivado() {
        return this .aireAcondicionadoActivado;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this .aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return this .motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this .motorEncendido = motorEncendido;
    }

    public boolean isWifiEncendido() {
        return this .wifiEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this .wifiEncendido = wifiEncendido;
    }

    public boolean isEnMarcha() {
        return this .enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this .enMarcha = enMarcha;
    }

    // Abstract Methods
    public abstract void gestionarMarcha();

    // Methods
    protected boolean havePasajeros() {
        return this .nPasajeros > 0;
    }

    protected boolean havePuestos() {
        return this .nPasajeros <= this .nMaximoPasajeros;   // Verifica si el numero de pasajeros es menor al numero maximo de pasajeros
    }

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
            "\n   nombreConductor: " + this .nombreConductor +
            ", \n   nPasajeros: " + this .nPasajeros +
            ", \n   cantidadDinero: " + this .cantidadDinero +
            ", \n   nMaximoPasajeros: " + this .nMaximoPasajeros +
            ", \n   localizacionX: " + this .localizacionX +
            ", \n   localizacionY: " + this .localizacionY +
            ", \n   puertaAbierta: " + this .puertaAbierta +
            ", \n   aireAcondicionadoActivado: " + this .aireAcondicionadoActivado +
            ", \n   motorEncendido: " + this .motorEncendido +
            ", \n   wifiEncendido: " + this .wifiEncendido +
            ", \n   enMarcha: " + this .enMarcha;
    }

    

}
