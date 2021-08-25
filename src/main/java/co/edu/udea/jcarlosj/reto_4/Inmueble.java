package co.edu.udea.jcarlosj.reto_4;

public class Inmueble {
    // Atributos
    private String nCasa;
    private String IDArrendador;
    private double costoMensual;
    private int cantidadMesesArrendado;

    // Constructor
    public Inmueble( String nCasa, String IDArrendador, double costoMensual, int cantidadMesesArrendado ) {
        this .nCasa = nCasa;
        this .IDArrendador = IDArrendador;
        this .costoMensual = costoMensual;
        this .cantidadMesesArrendado = cantidadMesesArrendado;
    }

    // Getters and setters
    public String getnCasa() {
        return this .nCasa;
    }

    public void setnCasa( String nCasa ) {
        this .nCasa = nCasa;
    }

    public String getIDArrendador() {
        return this .IDArrendador;
    }

    public void setIDArrendador( String iDArrendador ) {
        IDArrendador = iDArrendador;
    }

    public double getCostoMensual() {
        return this .costoMensual;
    }

    public void setCostoMensual( double costoMensual ) {
        this .costoMensual = costoMensual;
    }

    public int getCantidadMesesArrendado() {
        return this .cantidadMesesArrendado;
    }

    public void setCantidadMesesArrendado( int cantidadMesesArrendado ) {
        this .cantidadMesesArrendado = cantidadMesesArrendado;
    }


    @Override
    public String toString() {
        return
            "\n    { " +
            "nCasa: " + this .nCasa +
            ", IDArrendador: " + this .IDArrendador +
            ", costoMensual: " + this .costoMensual +
            ", cantidadMesesArrendado: " + this .cantidadMesesArrendado +
            " }";
    }

}
