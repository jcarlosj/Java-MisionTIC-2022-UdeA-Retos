package co.edu.udea.jcarlosj;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        int [] vectorEntrada = { 0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8 };
        int resultado = sumaPares( vectorEntrada );
        System.out.println( "resultado: " + resultado );
    }

    public static int sumaPares( int [] vector ) {
        int s = 0;

        for ( int i = 0; i < vector.length; i++ ) {
            s += ( vector[ i ] > 0 && vector[ i ] % 2 == 0 ) ? vector[ i ] : 0;
        }

        return s;
    }
}
