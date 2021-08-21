package co.edu.udea.jcarlosj.reto_3;

public class BotonPrueba extends Boton {

    public BotonPrueba( double ancho, double alto, String colorFondo, String colorTexto, String texto ) {
        super( ancho, alto, colorFondo, colorTexto, texto );
    }

    public void hacerClick() {
        this .texto = "Hello World!";
    }

    @Override
    public String toString() {
        return "BotonPrueba [ " + super .toString() + " \n]";
    }

}
