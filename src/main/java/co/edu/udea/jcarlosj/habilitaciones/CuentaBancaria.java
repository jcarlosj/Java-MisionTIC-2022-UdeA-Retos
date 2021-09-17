package co.edu.udea.jcarlosj.habilitaciones;

import java.util.ArrayList;

public class CuentaBancaria {
    // Atributos
    private String IDCuenta;
    private String IDCliente;
    private String nombreCliente;
    private double saldo;
    private ArrayList<DetalleMovimiento> movimientos;

    // Constructor
    public CuentaBancaria(String iDCuenta, String iDCliente, String nombreCliente) {
        this .IDCuenta = iDCuenta;
        this .IDCliente = iDCliente;
        this .nombreCliente = nombreCliente;

        this .movimientos = new ArrayList<DetalleMovimiento>();
    }
    // Getters and setters
    public String getIDCuenta() {
        return IDCuenta;
    }
    public void setIDCuenta(String iDCuenta) {
        this .IDCuenta = iDCuenta;
    }
    public String getIDCliente() {
        return IDCliente;
    }
    public void setIDCliente(String iDCliente) {
        this .IDCliente = iDCliente;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        // Concepto: Rango mayor e igual a cero
        if( saldo > -1 ) {
            this.saldo = saldo;
        }
    }
    public ArrayList<DetalleMovimiento> getMovimientos() {
        return movimientos;
    }
    public void setMovimientos(ArrayList<DetalleMovimiento> movimientos) {
        this.movimientos = movimientos;
    }

    // Metodos
    public void retirar( DetalleMovimiento d ) {
        // Concepto: Siempre que el saldo >= a 0
        if( this .saldo >= d .getSaldoMovido() ) {
            this .setSaldo( this .getSaldo() - d .getSaldoMovido() );
            this .agregarDetalle( d );
        }
    }

    public void depositar( DetalleMovimiento d ) {
        this .setSaldo( this .getSaldo() + d .getSaldoMovido() );
        this .agregarDetalle( d );
    }

    public boolean sePuedeTransferir( double d ) {
        boolean puedeTransferir = false;

        // Concepto: true en caso tal de que 𝑠𝑎𝑙𝑑𝑜 − 𝑑 ≥ 0 y false en caso de que 𝑠𝑎𝑙𝑑𝑜 − 𝑑 < 0
        if( this .saldo - d > -1 ) {
            puedeTransferir = true;
        }

        return puedeTransferir;
    }

    public void transferir( DetalleMovimiento d ) {

        if( d .getTipoMovimiento() == 1 ) {
            // Manuela envia se le agrega a Juan (Sumar saldo a Juan)
            this .setSaldo( this .getSaldo() - d .getSaldoMovido() );
            this .agregarDetalle( d );
        }
        else if( d .getTipoMovimiento() == 2 ) {
            // Juan recibe se le resta a Manuela (Restar saldo a Juan)
            this .recibirTransferencia( d );
        }

    }

    public void recibirTransferencia( DetalleMovimiento d ) {
        this .setSaldo( this .getSaldo() + d .getSaldoMovido() );    // Deposita saldo transferido a quien recibe el dinero.
        this .agregarDetalle( d );
    }

    public void agregarDetalle( DetalleMovimiento d ) {
        this .movimientos .add( d );
    }

    @Override
    public String toString() {
        return
            "\n  { IDCuenta: " + this .IDCuenta +
            ", IDCliente: " + this .IDCliente +
            ", nombreCliente: " + this .nombreCliente +
            ", saldo: " + this .saldo +
            ", movimientos: " + this .movimientos +
            " }";
    }

}
