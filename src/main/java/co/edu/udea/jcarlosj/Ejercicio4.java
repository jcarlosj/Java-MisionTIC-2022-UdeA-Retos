package co.edu.udea.jcarlosj;
public class Ejercicio4 {
    public static void main( String[] args ) {
        int [] vectorEntrada = { 0, 2, 1, 65, 66, 78, 12, 11, 90, 13 };
        mostrar( vectorEntrada, "Vector Original" );
        ordenamientoPersonalizado( vectorEntrada );
        //mostrarDetalleVector( vectorResultante );
        mostrar( vectorEntrada, "Ordenamiento Personalizado" );

    }

    public static void mostrar( int vector [], String title ) {
        System.out.println( "===== " + title + " =====" );
        for( int num : vector) {
            System.out.printf( "%d ", num );
        }
        System.out.println( "" );
    }

    public static void mostrarDetalleVector( int[] vector ) {
        int lon = vector.length;
        int lonMedia = vector.length / 2;

        System.out.println( "===== Detalle Vector =====" );

        for( int i = 0, j = lon - 1; i < lonMedia && j >= lonMedia; i++, j-- ) {
            //System.out.println( "-" + vector[ i ] );
            //System.out.println( "i = " + i + ", j = " + j );
            System.out.printf( "vector[ %d ] = %d \tvector[ %d ] = %d \n", i, vector[ i ], j, vector[ j ] );
        }
    }

    public static void ordenamientoPersonalizado( int [] vector ){
        int lon = vector.length;
        int lonMedia = vector.length / 2;

        //System.out.println( "Longitud = " + lon );
        //System.out.println( "Longitud Media = " + lonMedia );

        for( int i = 0, j = lon - 1; i < lonMedia && j >= lonMedia; i++, j-- ) {
            int indexPrimerMenor = i;
            int indexSegundoMenor = j;
            //System.out.println( "-" + vector[ i ] );
            //System.out.println( "i = " + i + ", j = " + j );
            //System.out.printf( "vector[ %d ] = %d \tvector[ %d ] = %d \n", i, vector[ i ], j, vector[ j ] );

            indexPrimerMenor = obtenerMenorPrimeraMitad( vector, indexPrimerMenor );
            intercambiarValores( vector, i, indexPrimerMenor );

            indexSegundoMenor = obtenerMenorSegundaMitad( vector, indexSegundoMenor );
            intercambiarValores( vector, j, indexSegundoMenor );

        }

    }

    public static int obtenerMenorPrimeraMitad( int[] vector, int indexMenor ) {
        int lon = vector.length;
        int lonMedia = vector.length / 2;
        int i = indexMenor;

        for( int k = i + 1; k < lonMedia; k++ ) {
            if ( vector[ k ] < vector[ indexMenor ]) {
                indexMenor = k;
            }
        }

        return indexMenor;
    }

    public static int obtenerMenorSegundaMitad( int[] vector, int indexMenor ) {
        int lon = vector.length;
        int lonMedia = vector.length / 2;
        int i = indexMenor;

        for( int k = i - 1; k >= lonMedia; k-- ) {
            if ( vector[ k ] < vector[ indexMenor ]) {
                indexMenor = k;
            }
        }

        return indexMenor;
    }

    public static int [] intercambiarValores( int[] vector, int index, int indexMenor ) {
        if( index != indexMenor ) {
            //permutamos los valores
            int aux = vector[ index ];
            vector[ index ] = vector[ indexMenor ];
            vector[ indexMenor ] = aux;
        }

        return vector;
    }

}
