package co.edu.udea.jcarlosj.reto_2;

import javax.sql.rowset.spi.SyncResolver;

public class StartBanco {
    public static void main( String[] args ) throws Exception {

        // Cuenta Corriente
        // CuentaCorriente cCorriente = new CuentaCorriente( "1234", "John", 50000, 7000 );
        // System.out.println( "1. " + cCorriente );

        // cCorriente .depositar( 600000 );
        // System.out.println( "2. " + cCorriente );

        // cCorriente .cobrarCuotaManejo();
        // System.out.println( "3. " + cCorriente );

        // cCorriente .retirar( 150000 );
        // System.out.println( "4. " + cCorriente );

        // Cuenta Ahorros
        CuentaAhorro cAhorros = new CuentaAhorro( "1234", "John", 50000 );
        System.out.println( "1. " + cAhorros );

        cAhorros .depositar( 100000 );
        System.out.println( "2. " + cAhorros );

        cAhorros .pagarInteres( 10 );
        System.out.println( "3. " + cAhorros );

        cAhorros .retirar( 120000 );
        System.out.println( "4. " + cAhorros );
    }
}
