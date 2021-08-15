package co.edu.udea.jcarlosj.reto_2;

public class StartVehiculos {
    public static void main( String[] args ) throws Exception {

        // Evaluacion del Autobus
        Autobus autobus = new Autobus( "Pepe", 30 );
        println( "1. Hace entrega del autobus", autobus );

        autobus .recogerPasajero( 2 );
        println( "2. Autobus recoge pasajero estrato 2", autobus );

        autobus .gestionarPuerta();
        autobus .gestionarMarcha();
        println( "3. Autobus abre la puerta y se pone en marcha", autobus );

        autobus .recogerPasajero( 2 );
        autobus .gestionarMarcha();
        autobus .gestionarPuerta();
        println( "4. Autobus recoge pasajero estrato 2, se pone en marcha y gestiona la puerta", autobus );

        autobus .moverArriba( 2 );
        autobus .moverDerecha( 5 );
        autobus .gestionarWifi();
        autobus .gestionarAireAcondicionado();
        println( "5. Autobus se mueve, enciende el WiFi y Aire acondicionado", autobus );

        autobus .gestionarMotor();
        autobus .moverIzquierda( 2 );
        println( "6. Autobus enciende el motor y se mueve", autobus );

        // Evaluacion del Taxi
        Taxi taxi = new Taxi( "Pepe" );
        println( "1. Hace entrega del taxi", taxi );

        taxi .gestionarMotor();
        taxi .gestionarMarcha();
        taxi .recogerPasajero();
        println( "2. Taxi, enciende motor, se pone marcha y recoge un pasajero", taxi );

        taxi .gestionarMarcha();
        taxi .recogerPasajero();
        taxi .moverArriba( 10 );
        taxi .moverDerecha( 12 );
        taxi .gestionarSeguros();
        taxi .moverAbajo( 10 );
        taxi .moverIzquierda( 13 );
        println( "3. Taxi, en marcha, se pone marcha y recoge un pasajero", taxi );

        taxi .gestionarAireAcondicionado();
        taxi .gestionarWifi();
        taxi .gestionarMotor();
        taxi .presionarBotonPanico();
        println( "4. Taxi, enciende wifi y aire, apaga el motor, presiona el boton de panico", taxi );

    }

    public static void println( String msg, Vehiculo obj ) {
        System .out .println( "-------------------------------- " );
        System .out .println( msg + " \n " + obj + " \n " );
    }
}
