package co.edu.udea.jcarlosj.reto_4;

public class StartVariante3 {
    public static void main( String[] args ) throws Exception {
        Condominio lasAcacias = new Condominio();
        System .out .println( lasAcacias );

        Inmueble casa1 = new Inmueble( "1", "Juan", 1500000, 3 );
        Inmueble casa2 = new Inmueble( "2", "Manu", 1100000, 10 );
        Inmueble casa3 = new Inmueble( "3", "Carlos", 900000, 25 );


        lasAcacias .agregarInmueble( casa1 );
        lasAcacias .agregarInmueble( casa2 );
        lasAcacias .agregarInmueble( casa3 );
        System .out .println( lasAcacias );

        lasAcacias .eliminarInmueble( "3" );
        System .out .println( lasAcacias );

        System .out .println( "arriendos mensuales todas las casas: " + lasAcacias .calcularArriendoMensualCondominio() );
    }
}
