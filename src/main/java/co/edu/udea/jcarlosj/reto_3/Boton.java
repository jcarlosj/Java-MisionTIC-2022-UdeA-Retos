package co.edu.udea.jcarlosj.reto_3;

public abstract class Boton {
    // Atributos
    private double ancho;
    private double alto;
    private String colorFondo;
    private String colorTexto;
    protected String texto;

    // Cosntructor
    public Boton( double ancho, double alto, String colorFondo, String colorTexto, String texto ) {
        this .ancho = ancho;
        this .alto = alto;
        this .colorFondo = colorFondo;
        this .colorTexto = colorTexto;
        this .texto = texto;
    }

    public double getAncho() {
        return this .ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return this .alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String getColorFondo() {
        return this .colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public String getColorTexto() {
        return this .colorTexto;
    }

    public void setColorTexto(String colorTexto) {
        this.colorTexto = colorTexto;
    }

    public String getTexto() {
        return this .texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }


    // Metodo Abstracto
    public abstract void hacerClick();

    @Override
    public String toString() {
        return
            "\n   alto: " + this .alto +
            "\n   ancho: " + this .ancho +
            "\n   colorFondo: " + this .colorFondo +
            "\n   colorTexto: " + this .colorTexto +
            "\n   texto: " + this .texto;
    }

}
