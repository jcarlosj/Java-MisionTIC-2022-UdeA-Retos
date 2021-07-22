package co.edu.udea.jcarlosj;

public class Ejercicio6 {
    public static void main( String[] args ) {
        char [] vector = { ' ', 'P', 'r', 'o', ' ', 'g', 'r', 'a', ' ', 'm', 'a', 'r' };
        System.out.println( join( vector ) );
    }

    public static String join( char [] vector ){
        String vectorConcatenado = "";

        for( char character : vector) {
            vectorConcatenado += character;
        }

        return vectorConcatenado;
    }
}
