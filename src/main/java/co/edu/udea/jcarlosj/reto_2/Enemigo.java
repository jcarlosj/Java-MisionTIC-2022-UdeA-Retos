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
    public void evolucionar() {

        if( this .getVida() <= 30 && this .evolucionesAplicadas == 0 ) {
            this .setDamage( this .getDamage() + 20 );
            this .evolucionesAplicadas += 1;
            System.out.println( "(< 30) Evoluciona: " + this .nombre + ": [ vida: " + this .getVida() + ", evolucionesAplicadas: " + this .evolucionesAplicadas + " ]" );
        }

        if( this .getVida() <= 10 && this .evolucionesAplicadas == 1 ) {
            this .resistencia += 1;
            this .evolucionesAplicadas += 1;
            this .moreResistencia = true;
            System.out.println( "(< 10) Evoluciona: " + this .nombre + ": [ vida: " + this .getVida() + ", evolucionesAplicadas: " + this .evolucionesAplicadas + " ]" );
        }
    }

    @Override
    public void recibirImpacto( double d ) {
        super .recibirImpacto( d / this .resistencia );
    }

    @Override
    public String toString() {
        return "Enemigo [ " +
            super .toString() +
            ", \n   evolucionesAplicadas: " + this .evolucionesAplicadas + ", resistencia: " + this .resistencia +
        "\n ]";
    }

}
