package co.edu.udea.jcarlosj.reto_3;

public class StartVariante1 {
    public static void main( String[] args ) throws Exception {
        BotonPrueba btn = new BotonPrueba( 20, 5, "Orange", "White", "Hola Mundo!" );
        System.out.println( btn );

        btn .hacerClick();
        System.out.println( btn );
    }
}
