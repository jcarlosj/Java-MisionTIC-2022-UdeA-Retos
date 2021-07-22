package co.edu.udea.jcarlosj;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main( String[] args ) {

        Scanner sc = new Scanner( System.in );
        long factorial = 1;
        System.out.print( "Ingrese # para calcular su factorial: " );
        int numero = sc.nextInt();

        for( int i=2; i<=numero; i++ ) {
            factorial *= i;
        }

        System.out.println( factorial );

    }
}
