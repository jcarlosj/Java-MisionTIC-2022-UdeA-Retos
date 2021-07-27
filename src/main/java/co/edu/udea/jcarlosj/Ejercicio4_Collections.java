package co.edu.udea.jcarlosj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Ejercicio4_Collections {

    public static void main( String[] args ) throws Exception {
        int[] vector = { 0, 2, 1, 65, 66, 78, 12, 11, 90, 13 };
        int[] newVector = ordenamientoPersonalizado( vector );

        System.out.print("Original: ");
        for (int value : vector) {
            System.out.print(value + " ");
        }
        System.out.println("");

        System.out.print("Resultado: ");
        for (int value : newVector) {
            System.out.print(value + " ");
        }
        System.out.println("");
    }

    public static int[] uneEnArray( TreeSet<Integer> primera, TreeSet<Integer> segunda ) {
        int[] newVector = new int[ primera.size() + segunda.size() ];

        // Define Iterators
        Iterator valueAsc = primera .iterator();
        Iterator valueDes = segunda .iterator();

        System .out .println( "TreeSet: " + primera );
        System .out .println( "TreeSet: " + segunda );

        int i = 0;
        while( valueAsc .hasNext() ) {
            newVector[ i++ ] = (int) valueAsc .next();
        }
        while (valueDes .hasNext()) {
            newVector[ i++ ] = (int) valueDes .next();
        }

        return newVector;
    }

    public static ArrayList<TreeSet<Integer>> separaDatos( int [] vector ) {
        // Define Collections
        TreeSet<Integer> primeraMitad = new TreeSet<Integer>();
        TreeSet<Integer> segundaMitad = new TreeSet<Integer>();

        for( int i = 0; i < vector.length / 2; i++ ) {
            primeraMitad .add( vector[ i ] );
        }
        for ( int i = vector .length - 1; i >= vector .length / 2; i-- ) {
            segundaMitad .add( vector[ i ] );
        }

        System .out .println( "TreeSet: " + primeraMitad );
        System .out .println( "TreeSet: " + segundaMitad );

        ArrayList<TreeSet<Integer>> parts = new ArrayList<TreeSet<Integer>>();
        parts .add( primeraMitad );
        parts .add( (TreeSet<Integer>) segundaMitad .descendingSet() );

        return parts;
    }

    public static int[] ordenamientoPersonalizado( int [] vector ) {

        ArrayList<TreeSet<Integer>> parts = separaDatos( vector );

        return uneEnArray( parts .get( 0 ), parts .get( 1 ) );
    }
}
