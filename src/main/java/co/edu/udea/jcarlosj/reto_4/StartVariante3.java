package co.edu.udea.jcarlosj.reto_4;

public class StartVariante3 {
    public static void main( String[] args ) throws Exception {
        Condominio lasAcacias = new Condominio();
        System .out .println( lasAcacias );

        Inmueble casa1 = new Inmueble( "1", "Juan", 1500000, 3 );
        System .out .println( casa1 );
        Inmueble casa2 = new Inmueble( "2", "Manu", 1100000, 10 );
        System .out .println( casa2 );

        lasAcacias .agregarInmueble( casa1 );
        lasAcacias .agregarInmueble( casa2 );
        System .out .println( lasAcacias );

    }
}
