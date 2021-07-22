package co.edu.udea.jcarlosj;
public class Ejercicio3 {
    public static void main( String[] args ) {
        int [] vectorEntrada = { 0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8 };
        double resultado = mean( vectorEntrada );
        System.out.println( "resultado: " + resultado );
    }

    public static double mean( int [] vector ){
        double promedio = 0.0;

        for ( int i = 0; i < vector.length; i++ ) {
            promedio += vector[ i ];
        }

        return promedio / vector.length;
    }
}
