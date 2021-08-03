package co.edu.udea.jcarlosj.proyecto.biblioteca;

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
            datatable[ index ][ 0 ] = material .getID();
            datatable[ index ][ 1 ] = material .getTitle();
            datatable[ index ][ 2 ] = material .getCode();
            datatable[ index ][ 3 ] = material .getAuthor();
            datatable[ index ][ 4 ] = material .getYear();
            index ++;
        }

        return datatable;
    }

    @Override
    public String toString() {
        return "Library [ ID: " + ID + ", books: " + books + ", quantityBooks: " + quantityBooks + " ]";
    }

    public static void main( String[] args ) throws Exception {
        Library library = new Library();
        library .add( "Software libre para una sociedad libre", "FREE", "Richard Stalmman", 2002 );
        library .add( "El patrón Bitcoin", "DERF", "Saifedean Ammous", 2018 );
        library .add( "Java para Niños", "JERN", "Nadia Ameziane Garcia", 2017 );

        Object[][] data = ( Object[][] ) library .getList();
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
