package co.edu.udea.jcarlosj.proyecto.biblioteca;

import java.rmi.MarshalException;
import java.util.ArrayList;

public class Library {
    // Atributos
    private int ID;
    private ArrayList<Material> books;
    private int quantityBooks;
    private String selectedId = null;

    // Constructor
    public Library() {
        this .books = new ArrayList<Material>();
    }

    // Metodos
    public void add( String title, String code, String author, int year ) {
        this .books .add( new Material( this .ID++, title, code, author, year ) );
        this .quantityBooks = this .books. size();
    }

    public Object[][] getList() {
        Object[][] datatable = new Object[ this .books .size() ][ 5 ];
        int index = 0;

        for( Material material : this .books ) {

            Object[] datarow = this .getDatatable( material );

            for( int i = 0; i < datarow .length; i++ ) {
                datatable[ index ][ i ] = datarow[ i ];
            }
            index ++;
        }

        return datatable;
    }

    public Object[][] getById( int id ) {
        Object[][] datatable = new Object[ 1 ][ 5 ];

        for( Material material : this .books ) {
            if( id == material.getID() ) {
                Object[] datarow = this .getDatatable( material );

                for( int i = 0; i < datarow .length; i++ ) {
                    datatable[ 0 ][ i ] = datarow[ i ];
                }
            }
        }

        return datatable;
    }

    public Object[] getDatatable( Material material ) {
        Object[] datarow = {
            material .getID(),
            material .getTitle(),
            material .getCode(),
            material .getAuthor(),
            material .getYear()
        };
        
        return datarow;
    }

    @Override
    public String toString() {
        return "Library [ ID: " + ID + ", books: " + books + ", quantityBooks: " + quantityBooks + " ]";
    }

    public static void main( String[] args ) throws Exception {
        Library library = new Library();
        Object[][] data;

        library .add( "Software libre para una sociedad libre", "FREE", "Richard Stalmman", 2002 );
        library .add( "El patrón Bitcoin", "DERF", "Saifedean Ammous", 2018 );
        library .add( "Java para Niños", "JERN", "Nadia Ameziane Garcia", 2017 );

        // data = ( Object[][] ) library .getList();
        // iterateForEach( data );

        data = ( Object[][] ) library .getById( 1 );
        iterateForEach( data );

    }

    public static void iterateFor( Object[][] data ) {
        for( int i = 0; i < data .length; i++ ) {
            for( int j = 0; j < data[ i ] .length; j++ ) {
                System.out.print( data[ i ][ j ] + ", " );
            }
            System.out.println( "" );
        }
    }

    public static void iterateForEach( Object[][] data ) {
        for( Object[] row : data ) {
            for( Object col : row ) {
                System.out.print( col + ", " );
            }
            System.out.println( "" );
        }
    }

}
