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

        // A partir del dia 1
        if( dias > 0 ) {
            // Itera la cantidad de dias que se va a pagar interes compuesto por dia
            for( int i = 0; i < dias; i++ ) {
                capitalFinal = capitalInicial * ( 1 + this .getIEA() / 365 );       // Saldo mas el interes diario
                capitalInicial = capitalFinal;                                      // IEA es acumulativo (Interes compuesto)
            }

            this .setSaldo( capitalInicial );                                       // Solo despues del calculo acumulativo de los intereses a pagar lo agrego como nuevo saldo

        }

    }

    @Override
    public String toString() {
        return "CuentaAhorro [ " + super .toString() + " \n]";
    }

}
