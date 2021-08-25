package co.edu.udea.jcarlosj.reto_2;

public class CuentaAhorro extends CuentaBanco {

    // Constructor
    public CuentaAhorro( String numeroCuenta, String nombrePropietario, double saldo ) {
        super( numeroCuenta, nombrePropietario, saldo );
    }

    // Metodos
    public double getIEA() {
        double tasa = 0.0;

        if( this .getSaldo() < 1000000 )        tasa = 0.01;
        else if( this .getSaldo() < 2000000 )   tasa = 0.0175;
        else                                    tasa = 0.023;

        return tasa;
    }

    public void pagarInteres( int dias ) {

        double 
            capitalFinal = 0.0,
            capitalInicial = this .getSaldo();

        if( dias > 1 ) {
            for( int i = 0; i < dias; i++ ) {
                capitalFinal = capitalInicial * ( 1 + this .getIEA() / 365 );
                capitalInicial = capitalFinal;
            }

            this .setSaldo( capitalInicial );
        }
            
    }

    @Override
    public String toString() {
        return "CuentaAhorro [ " + super .toString() + " \n]";
    }

}
