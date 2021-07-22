package co.edu.udea.jcarlosj;

public class Ejercicio5 {
    public static void main( String[] args ) {
        int [] v1 = { 0, 2, 1, 65, 66, 78, 12, 11, 90, 13 };
        int [] v2 = { 0, -2, 1, 9, 4, 78, 12, 11, 90, 13 };
        mostrarResultado( sumaVectorial( v1, v2 ) );
    }

    public static int [] sumaVectorial( int [] v1, int [] v2 ){
        int resultado [] = null;

        if( v1.length == v2.length ) {
            resultado = new int[ v1.length ];

            for( int i = 0; i < v1 .length; i++ ) {
                resultado[ i ] = v1[ i ] + v2[ i ];
            }
        }

        return resultado;
    }

    public static void mostrarResultado( int [] vector ) {
        System.out.println( "===== Resultado de la suma vectorial entre los dos vectores =====" );
        for( int i = 0; i < vector .length; i++ ) {
            System.out.print( vector[ i ] + " " );
        }
        System.out.println( "" );
    }
}
