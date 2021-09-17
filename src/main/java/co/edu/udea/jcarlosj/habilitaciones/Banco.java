package co.edu.udea.jcarlosj.habilitaciones;

import java.util.ArrayList;

public class Banco {
    // Atributos
    private ArrayList<CuentaBancaria> cuentasBancarias;
    private CuentaBancaria cuentaEncontrada = null;

    // Constructor
    public Banco() {
        this.cuentasBancarias = new ArrayList<CuentaBancaria>();
    }

    // Getters and setters
    public ArrayList<CuentaBancaria> getCuentasBancarias() {
        return this .cuentasBancarias;
    }

    public void setCuentasBancarias(ArrayList<CuentaBancaria> cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }

    // Metodos
    public void buscarCuenta( String IDCuenta ) {

        for( CuentaBancaria cuenta: this .cuentasBancarias ) {
            if( cuenta .getIDCuenta() .equals( IDCuenta ) ) {
                this .cuentaEncontrada = cuenta;
            }
        }

    }

    public void agregarCuenta( String IDCuenta, String IDCliente, String nombre ) {
        this .cuentasBancarias .add( new CuentaBancaria( IDCuenta, IDCliente, nombre ) );
    }

    public void eliminarCuenta( String IDCuenta ) {
        this .buscarCuenta( IDCuenta );

        if( this .cuentaEncontrada != null ) {
            // System.out.println( "Encontre a: " + this.cuentaEncontrada );
            this .cuentasBancarias .remove( this.cuentaEncontrada );
            this .cuentaEncontrada = null;
        }
    }

    public void retirar( String c, DetalleMovimiento d ) {
        this .buscarCuenta( c );

        if( this .cuentaEncontrada != null ) {
            this .cuentaEncontrada .retirar( d );
            this .cuentaEncontrada = null;
        }

    }

    public void transferir( String c1, String c2, DetalleMovimiento d1, DetalleMovimiento d2 ) {
        // c1: Pasara dinero (Retira)       d1: Movimiento Retiro
        // c2: Recibira dinero (Consigna)   d2: Movimiento Consignacion
        // this .retirar( c1, d1 );
        // this .depositar( c2, d2 );

        CuentaBancaria cuentaTranfiere = null;
        CuentaBancaria cuentaRecibe = null;

        this .buscarCuenta( c1 );
        if( this .cuentaEncontrada != null ) {
            cuentaTranfiere = this .cuentaEncontrada;
            this .cuentaEncontrada = null;
        }

        this .buscarCuenta( c2 );
        if( this .cuentaEncontrada != null ) {
            cuentaRecibe = this .cuentaEncontrada;
            this .cuentaEncontrada = null;
        }

        // Verifica si las cuentas en las que se realizara la transferencia existen.
        if( cuentaTranfiere != null && cuentaRecibe != null ) {
            cuentaTranfiere .transferir( d1 );
            cuentaRecibe .transferir( d2 );
        }

    }

    public void depositar( String c, DetalleMovimiento d ) {
        this .buscarCuenta( c );

        if( this .cuentaEncontrada != null ) {
            this .cuentaEncontrada .depositar( d );
            this .cuentaEncontrada = null;
        }
    }

    public double promedioCuadradoSaldos() {
        double promedioCuadrado = 0.0;

        for( CuentaBancaria cuenta: this .cuentasBancarias ) {
            promedioCuadrado += Math .pow( cuenta .getSaldo(), 2 );
        }

        return promedioCuadrado / (double) this .cuentasBancarias .size();
    }

    private double promedioSaldos() {
        double promedioCuadrado = 0.0;

        for( CuentaBancaria cuenta: this .cuentasBancarias ) {
            promedioCuadrado += cuenta .getSaldo();
        }

        return promedioCuadrado / (double) this .cuentasBancarias .size();
    }

    public double varianzaSaldos() {
        double result = 0.0;

        for( CuentaBancaria cuenta: this .cuentasBancarias ) {
            result += Math .pow( cuenta .getSaldo() - this .promedioSaldos(), 2 );
        }

        return 1 / (double) this .cuentasBancarias .size() * result;
    }

    @Override
    public String toString() {
        return "[ cuentasBancarias: " + this .cuentasBancarias + " ]";
    }

}
