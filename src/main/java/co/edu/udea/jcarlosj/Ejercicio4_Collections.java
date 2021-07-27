package co.edu.udea.jcarlosj;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
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

    public static int[] ordenamientoPersonalizado( int [] vector ) {

        int[] newVector = new int[vector.length];

        // Define Collections
        Set<Integer> primeraMitad = new HashSet<Integer>();
        Set<Integer> segundaMitad = new HashSet<Integer>();

        TreeSet asc = new TreeSet();
        TreeSet des = new TreeSet();

        TreeSet<Integer> resDes = new TreeSet<Integer>();

        for (int i = 0; i < vector.length / 2; i++) {
            primeraMitad.add(vector[i]);
            asc.addAll(primeraMitad);
        }
        System.out.println("HashSet" + primeraMitad);
        System.out.println("TreeSet: " + asc);

        for (int i = vector.length - 1; i >= vector.length / 2; i--) {
            segundaMitad.add(vector[i]);
            des.addAll(segundaMitad);
            resDes = (TreeSet<Integer>) des.descendingSet();
        }

        System.out.println("TreeSet: " + resDes);

        Iterator valueAsc = asc.iterator();

        int i = 0;
        while (valueAsc.hasNext()) {
            newVector[i++] = (int) valueAsc.next();
        }

        Iterator valueDes = resDes.iterator();

        while (valueDes.hasNext()) {
            newVector[i++] = (int) valueDes.next();
        }

        return newVector;
    }
}
