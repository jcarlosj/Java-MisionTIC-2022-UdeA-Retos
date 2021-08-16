package co.edu.udea.jcarlosj.reto_2;

public class StartVehiculos {
    public static void main( String[] args ) throws Exception {

        // Evaluacion del Autobus
        Autobus autobus = new Autobus( "Pepe", 2 );
        // println( "1. Hace entrega del autobus", autobus );

        // autobus .recogerPasajero( 2 );
        // println( "2. Autobus recoge pasajero estrato 2", autobus );

        // autobus .gestionarPuerta();
        // autobus .gestionarMarcha();
        // println( "3. Autobus abre la puerta y se pone en marcha", autobus );

        // autobus .recogerPasajero( 2 );
        // autobus .gestionarMarcha();
        // autobus .gestionarPuerta();
        // println( "4. Autobus recoge pasajero estrato 2, se pone en marcha y gestiona la puerta", autobus );

        // autobus .moverArriba( 2 );
        // autobus .moverDerecha( 5 );
        // autobus .gestionarWifi();
        // autobus .gestionarAireAcondicionado();
        // println( "5. Autobus se mueve, enciende el WiFi y Aire acondicionado", autobus );

        // autobus .gestionarMotor();
        // autobus .moverIzquierda( 2 );
        // println( "6. Autobus enciende el motor y se mueve", autobus );

        // Evaluacion del Taxi
        Taxi taxi = new Taxi( "Pepe" );
        // println( "1. Hace entrega del taxi", taxi );

        // taxi .gestionarMotor();
        // taxi .gestionarMarcha();
        // taxi .recogerPasajero();
        // println( "2. Taxi, enciende motor, se pone marcha y recoge un pasajero", taxi );

        // taxi .gestionarMarcha();
        // taxi .recogerPasajero();
        // taxi .moverArriba( 10 );
        // taxi .moverDerecha( 12 );
        // taxi .gestionarSeguros();
        // taxi .moverAbajo( 10 );
        // taxi .moverIzquierda( 13 );
        // println( "3. Taxi, en marcha, se pone marcha y recoge un pasajero", taxi );

        // taxi .gestionarAireAcondicionado();
        // taxi .gestionarWifi();
        // taxi .gestionarMotor();
        // taxi .presionarBotonPanico();
        // println( "4. Taxi, enciende wifi y aire, apaga el motor, presiona el boton de panico", taxi );

        // Validacion con data del VPL para Autobus
        // autobus .gestionarPuerta();
        // println( "1. Autobus: abre la puerta", autobus );

        // autobus .recogerPasajero( 1 );
        // autobus .recogerPasajero( 3 );
        // autobus .recogerPasajero( 6 );
        // println( "2. Autobus: Suben tres pasajeros, estratos 1, 3, 6", autobus );

        // autobus .gestionarMarcha();
        // autobus .gestionarPuerta();
        // autobus .gestionarMarcha();
        // println( "3. Autobus: pone en marcha, Abre la puerta, pone en marcha", autobus );

        // autobus .gestionarMotor();
        // autobus .gestionarMarcha();
        // autobus .moverArriba( 1 );
        // autobus .moverIzquierda( 2 );
        // autobus .moverAbajo( 3 );
        // println( "4. Autobus: enciende el motor, pone en marcha, se mueve", autobus );

        // autobus .recogerPasajero( 6 );
        // println( "5. Autobus: recoge pasajero estrato 6", autobus );

        // autobus .gestionarMarcha();
        // autobus .gestionarPuerta();
        // autobus .recogerPasajero( 4 );
        // println( "6. Autobus: Detiene el autobus, abre la puerta, recoge pasajero estrato 6", autobus );

        // Validacion con data del VPL para Taxi
        
        println( "1. Taxi: Hace entrega del taxi", taxi );

        taxi .gestionarMotor();
        taxi .recogerPasajero();
        taxi .gestionarSeguros();
        taxi .gestionarMarcha();
        taxi .moverAbajo( 5 );
        taxi .moverDerecha( 6 );
        taxi .moverIzquierda( 2 );
        println( "2. Taxi: Enciende motor, recoge pasajero, pone seguros, pone en marcha y se mueve", taxi );

        taxi .gestionarSeguros();
        taxi .gestionarMarcha();
        println( "3. Taxi: quita seguros, detiene la marcha", taxi );

        taxi .dejarPasajero();
        taxi .dejarPasajero();
        println( "4. Taxi: deja al pasajero 2 veces", taxi );

        taxi .gestionarSeguros();
        taxi .dejarPasajero();
        println( "5. Taxi: quita seguros, deja el pasajero", taxi );

        taxi .recogerPasajero();
        taxi .gestionarSeguros();
        taxi .moverArriba( 1 );
        println( "6. Taxi: recoge pasajero, pone seguros, se mueve", taxi );

        taxi .gestionarMarcha();
        taxi .gestionarSeguros();
        taxi .dejarPasajero();
        println( "7. Taxi: pone marcha, se mueve", taxi );

    }

    public static void println( String msg, Vehiculo obj ) {
        System .out .println( "-------------------------------- " );
        System .out .println( msg + " \n " + obj + " \n " );
    }
}
