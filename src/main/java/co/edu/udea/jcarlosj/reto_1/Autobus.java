package co.edu.udea.jcarlosj.reto_1;

public class Autobus {
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
    public Autobus( String nombreConductor, int nMaximoPasajeros, boolean puertaAbierta ) {
        this .nombreConductor = nombreConductor;
        this .nMaximoPasajeros = nMaximoPasajeros;
        this .puertaAbierta = puertaAbierta;

        this .aireAcondicionadoActivado = false;
        this .motorEncendido = false;
        this .wifiEncendido = false;
        this .enMarcha = false;
    }

    // Getters and setters
    public String getNombreConductor() {
        return this .nombreConductor;
    }

    public void setNombreConductor( String nombreConductor ) {
        this .nombreConductor = nombreConductor;
    }

    public int getnPasajeros() {
        return this .nPasajeros;
    }

    public void setnPasajeros( int nPasajeros ) {
        this .nPasajeros = nPasajeros;
    }

    public double getCantidadDinero() {
        return this .cantidadDinero;
    }

    public void setCantidadDinero( double cantidadDinero ) {
        this .cantidadDinero = cantidadDinero;
    }

    public int getnMaximoPasajeros() {
        return this .nMaximoPasajeros;
    }

    public void setnMaximoPasajeros( int nMaximoPasajeros ) {
        this .nMaximoPasajeros = nMaximoPasajeros;
    }

    public double getLocalizacionX() {
        return this .localizacionX;
    }

    public void setLocalizacionX( double localizacionX ) {
        this .localizacionX = localizacionX;
    }

    public double getLocalizacionY() {
        return this .localizacionY;
    }

    public void setLocalizacionY( double localizacionY ) {
        this .localizacionY = localizacionY;
    }

    public boolean isPuertaAbierta() {
        return this .puertaAbierta;
    }

    public void setPuertaAbierta( boolean puertaAbierta ) {
        this .puertaAbierta = puertaAbierta;
    }

    public boolean isAireAcondicionadoActivado() {
        return this .aireAcondicionadoActivado;
    }

    public void setAireAcondicionadoActivado( boolean aireAcondicionadoActivado ) {
        this .aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return this .motorEncendido;
    }

    public void setMotorEncendido( boolean motorEncendido ) {
        this .motorEncendido = motorEncendido;
    }

    public boolean isWifiEncendido() {
        return this .wifiEncendido;
    }

    public void setWifiEncendido( boolean wifiEncendido ) {
        this .wifiEncendido = wifiEncendido;
    }

    public boolean isEnMarcha() {
        return this .enMarcha;
    }

    public void setEnMarcha( boolean enMarcha ) {
        if( ! this .motorEncendido && ! this .puertaAbierta ) {
            this .enMarcha = enMarcha;
        }
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

    public static void main( String[] args ) throws Exception {
        Autobus camion1 = new Autobus( "Pepe", 30, false );
        System.out.println( "1. " + camion1 );

        camion1 .moverDerecha( 5 );
        System.out.println( "2. " + camion1 );

        camion1 .gestionarWifi();
        camion1 .gestionarAireAcondicionado();
        camion1 .gestionarMarcha();
        System.out.println( "3. " + camion1 );

        camion1 .gestionarMotor();
        camion1 .gestionarMarcha();
        camion1 .moverDerecha( 5 );
        System.out.println( "4. " + camion1 );

        camion1 .recogerPasajero( 2 );
        camion1 .gestionarPuerta();
        camion1 .moverArriba( 10 );
        System.out.println( "5. " + camion1 );

        camion1 .gestionarMarcha();
        camion1 .gestionarPuerta();
        camion1 .recogerPasajero( 1 );
        camion1 .recogerPasajero( 4 );
        camion1 .recogerPasajero( 6 );
        System.out.println( "6. " + camion1 );

        camion1 .gestionarWifi();
        camion1 .gestionarAireAcondicionado();
        camion1 .gestionarMarcha();
        camion1 .moverIzquierda( 2 );
        System.out.println( "7. " + camion1 );

        camion1 .dejarPasajero();
        camion1 .gestionarMotor();
        camion1 .calcularDistanciaAcopio();
        System.out.println( "8. " + camion1 );

    }

}
