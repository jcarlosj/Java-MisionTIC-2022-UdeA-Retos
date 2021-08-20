package co.edu.udea.jcarlosj.reto_3;

public class StartVariante2 {
    public static void main( String[] args ) throws Exception {
        Estudiante manu = new Estudiante( "1", "Manuela", "manuela@correo.co", "espanol" );
        System.out.println( manu );

        manu .dirigir();
        System.out.println( manu );
    }
}
