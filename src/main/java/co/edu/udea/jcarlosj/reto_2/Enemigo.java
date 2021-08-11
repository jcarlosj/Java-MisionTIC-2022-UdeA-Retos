package co.edu.udea.jcarlosj.reto_2;

public class Enemigo extends Personaje {
    // Atributos
    private int evolucionesAplicadas;
    private int resistencia;

    public Enemigo( String name, char gender, double x, double y, double damage ) {
        super( name, gender, x, y, damage );

        this .resistencia = 1;
    }

    // Getters and setters
    public int getEvolucionesAplicadas() {
        return this .evolucionesAplicadas;
    }

    public void setEvolucionesAplicadas( int evolucionesAplicadas ) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }

    public int getResistencia() {
        return this .resistencia;
    }

    public void setResistencia( int resistencia ) {
        this .resistencia = resistencia;
    }

    // Metodos
    public void evolucionar() {
        if( this .vida < 11 && this .evolucionesAplicadas == 1 ) {
            this .evolucionesAplicadas += 1;
            this .resistencia ++;
        }
        else if( this .vida < 31 && this .evolucionesAplicadas == 0 ) {
            this .evolucionesAplicadas += 1;
            this .damage += 20;
        }

    }

    @Override
    public void recibirImpacto( double d ) {
        if ( d > this .vida )  {
            this .vida -= d / this .resistencia;
        }
    }

    @Override
    public String toString() {
        return "Enemigo [ " +
            super .toString() +
            ", \n   evolucionesAplicadas: " + this .evolucionesAplicadas +
            ", \n   resistencia: " + this .resistencia +
        "\n ]";
    }

}
