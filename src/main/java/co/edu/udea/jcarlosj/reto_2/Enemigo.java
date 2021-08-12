package co.edu.udea.jcarlosj.reto_2;

public class Enemigo extends Personaje {
    // Atributos
    private int evolucionesAplicadas;
    private int resistencia;

    // Constructor
    public Enemigo( String name, char gender, double x, double y, double damage ) {
        super( name, gender, x, y, damage );

        this .resistencia = 1;
    }

    // Metodos
    // TODO: Definir funcionalidad del metodo evolucionar
    public void evolucionar() {}

    // TODO: Definir funcionalidad del metodo
    @Override
    public void recibirImpacto() {}

    @Override
    public String toString() {
        return "Enemigo [ " +
            super .toString() +
            ", \n   evolucionesAplicadas: " + this .evolucionesAplicadas +
            ", \n   resistencia: " + this .resistencia +
        "\n ]";
    }

}
