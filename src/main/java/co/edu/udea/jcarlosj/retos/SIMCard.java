package co.edu.udea.jcarlosj.retos;

import java.math.BigDecimal;

public class SIMCard {
    private String empresaTelefonia;
    private double saldo;
    private String numeroTelefono;
    private boolean celularApagado;
    private boolean modoAvionActivado;
    private boolean datosActivados;
    private int saldoDatos;

    // Constructor
    public SIMCard( String numeroTelefono ) {
        this .numeroTelefono = numeroTelefono;
        this .empresaTelefonia = "HI";
        this .celularApagado = true;
        this .modoAvionActivado = false;
        this .datosActivados = false;
    }

    // Getters and Setters
    public String getEmpresaTelefonia() {
        return this .empresaTelefonia;
    }

    public void setEmpresaTelefonia(String empresaTelefonia) {
        this .empresaTelefonia = empresaTelefonia;
    }

    public double getSaldo() {
        return this .saldo;
    }

    public void setSaldo( double saldo ) {
        this .saldo = saldo;
    }

    public String getNumeroTelefono() {
        return this .numeroTelefono;
    }

    public void setNumeroTelefono( String numeroTelefono ) {
        this .numeroTelefono = numeroTelefono;
    }

    public boolean isCelularApagado() {
        return this .celularApagado;
    }

    public void setCelularApagado( boolean celularApagado ) {
        this .celularApagado = celularApagado;
    }

    public boolean isModoAvionActivado() {
        return this .modoAvionActivado;
    }

    public void setModoAvionActivado( boolean modoAvionActivado ) {
        this .modoAvionActivado = modoAvionActivado;
    }

    public boolean isDatosActivados() {
        return this .datosActivados;
    }

    public void setDatosActivados( boolean datosActivados ) {
        this .datosActivados = datosActivados;
    }

    public int getSaldoDatos() {
        return this .saldoDatos;
    }

    public void setSaldoDatos( int saldoDatos ) {
        this .saldoDatos = saldoDatos;
    }

    // Metodos
    public void comprarDatos( int c ) {
        if ( c < this .saldo ) {
            this .saldo -= c;
            this .saldoDatos += c;
        }
    }

    public void consumirDatos( int c ) {
        if( ! this .celularApagado && c < this .saldoDatos ) {
            this .saldoDatos -= c;
        }
    }

    public void llamar( int s ) {
        if( ! this .celularApagado ) {
            this .saldo -= s;
        }
    }

    public void recargarSaldo( double s ) {
        this .saldo += s;
    }

    public void gestionarEncendidoCelular() {
        this .celularApagado = ! this .celularApagado;

        if( this .celularApagado ) {
            this .datosActivados = false;
            this .modoAvionActivado = false;
        }
    }

    public void gestionarModoAvion() {
        this .modoAvionActivado = ! this .modoAvionActivado;
        this .datosActivados = false;
    }

    public void gestionarDatos() {
        this .datosActivados = ! this .datosActivados;

        if( this .modoAvionActivado ) {
            this .datosActivados = ! this .datosActivados;
        }
    }

    @Override
    public String toString() {
        return "SIMCard [ celularApagado: " + celularApagado + ", datosActivados: " + datosActivados
                + ", empresaTelefonia: " + empresaTelefonia + ", modoAvionActivado: " + modoAvionActivado
                + ", numeroTelefono: " + numeroTelefono + ", saldo: " + saldo + ", saldoDatos: " + saldoDatos + " ]";
    }

    public static void main( String[] args ) throws Exception {
        SIMCard cliente = new SIMCard( "3015328969" );

        cliente .recargarSaldo( 50000 );
        System.out.println( cliente );

        cliente .comprarDatos( 12 );
        System.out.println( cliente );

        cliente .consumirDatos( 3 );
        System.out.println( cliente );

        cliente .gestionarEncendidoCelular();
        cliente .llamar( 120 );
        System.out.println( cliente );

        cliente .gestionarModoAvion();
        cliente .gestionarDatos();
        System.out.println( cliente );

        cliente .gestionarModoAvion();
        cliente .gestionarDatos();
        System.out.println( cliente );

        cliente .consumirDatos( 3 );
        System.out.println( cliente );

        cliente .gestionarEncendidoCelular();
        System.out.println( cliente );

    }

}
