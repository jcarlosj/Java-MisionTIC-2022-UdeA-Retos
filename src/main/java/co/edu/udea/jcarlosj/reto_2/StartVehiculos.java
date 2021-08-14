package co.edu.udea.jcarlosj.reto_2;

public class StartVehiculos {
    public static void main( String[] args ) throws Exception {
        Autobus autobus = new Autobus( "Pepe", 30 );
        Taxi taxi = new Taxi( "Pepe" );

        System.out.println( "\n" + autobus + "\n" + taxi );
    }
}
