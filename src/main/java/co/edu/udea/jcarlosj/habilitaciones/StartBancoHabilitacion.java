package co.edu.udea.jcarlosj.habilitaciones;

public class StartBancoHabilitacion {

/*  1: Si fue envío de dinero a otra cuenta bancaria (Transferencia Envio de Dinero)
    2: Si fue recepción de dinero desde otra cuenta bancaria (Transferencia Recepcion de Dinero)
    3: Si fue retiro
    4: Si fue depósito */

    public static void main( String[] args ) throws Exception {

        Banco chibchombianBank = new Banco();
        chibchombianBank .agregarCuenta( "001", "C001", "Gustavo" );
        chibchombianBank .agregarCuenta( "002", "C002", "Manuela" );
        chibchombianBank .agregarCuenta( "003", "C003", "Juan" );
        //System.out.println( chibchombianBank );

        chibchombianBank .eliminarCuenta( "002" );
        //System.out.println( chibchombianBank );

        // DetalleMovimiento retiroJuan = new DetalleMovimiento( 2, 2, 2021, 3, 100, "003" );
        // chibchombianBank .retirar( "003", retiroJuan );
        //System.out.println( chibchombianBank );

        DetalleMovimiento depositoAGustavo = new DetalleMovimiento( 2, 2, 2021, 4, 120, "001" );
        DetalleMovimiento retiroAGustavo = new DetalleMovimiento( 2, 2, 2021, 3, 60, "001" );
        chibchombianBank .depositar( "001", depositoAGustavo );
        chibchombianBank .retirar( "001", retiroAGustavo );

        DetalleMovimiento depositoAManuela = new DetalleMovimiento( 2, 2, 2021, 4, 1200, "002" );
        chibchombianBank .depositar( "002", depositoAManuela );
        System.out.println( chibchombianBank );

        DetalleMovimiento manuelaDepoTransAJuan = new DetalleMovimiento( 2, 2, 2021, 1, 120, "003" );
        DetalleMovimiento juanRecibeTransDeManuela = new DetalleMovimiento( 2, 2, 2021, 2, 120, "002" );
        chibchombianBank .transferir( "002", "003", manuelaDepoTransAJuan, juanRecibeTransDeManuela );
        System.out.println( chibchombianBank );


        //System.out.println( "promedio cuadrado saldos: " + chibchombianBank .promedioCuadradoSaldos() );
        //System.out.println( "varianza de saldos: " + chibchombianBank .varianzaSaldos() );


    }
}
