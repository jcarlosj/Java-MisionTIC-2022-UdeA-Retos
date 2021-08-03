package co.edu.udea.jcarlosj.proyecto.biblioteca;

public class Material {
    // Atributos
    private final int ID;
    private String title;
    private String code;
    private String author;
    private int year;

    // Constructor
    public Material( int id, String title, String code, String author, int year ) {
        this .ID = id;
        this .title = title;
        this .code = code;
        this .author = author;
        this .year = year;
    }

    // Getters and setters
    public int getID() {
        return this .ID;
    }

    public String getTitle() {
        return this .title;
    }

    public void setTitle( String title ) {
        this .title = title;
    }

    public String getCode() {
        return this .code;
    }

    public void setCode( String code ) {
        this .code = code;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor( String author ) {
        this .author = author;
    }

    public int getYear() {
        return this .year;
    }

    public void setYear( int year ) {
        this .year = year;
    }

    @Override
    public String toString() {
        return "Material [ ID: " + this .ID + ", author: " + this .author + ", code: " + this .code + ", title: " + this .title + ", year: " + this .year + " ]";
    }

}
