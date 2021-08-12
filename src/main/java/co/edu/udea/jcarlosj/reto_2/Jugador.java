package co.edu.udea.jcarlosj.reto_2;

public class Jugador extends Personaje {
    // Atributos
    private int numeroBotiquines;

    public Jugador( String name, char gender, double x, double y, double damage ) {
        super( name, gender, x, y, damage );
    }

    // Getters and setters
    public int getNumeroBotiquines() {
        return this .numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this .numeroBotiquines = numeroBotiquines;
    }

    // Metodos
    public void usarBotiquin() {
        int incrementa = 5;

        if( this .numeroBotiquines > 0 ) {
            this .numeroBotiquines --;

            double newLifeValue = this .vida + incrementa;
            this .vida = ( newLifeValue > 100 ) ? 100 : newLifeValue;

            System .out .println( " Usa botiquin: [ nombre: " + this .nombre + ", incrementa: " + incrementa + ", vida: " + this .vida + " ] " );
        }

    }

    public void recogerBotiquin() {
        this .numeroBotiquines ++;
    }

    public void moverDerecha( double d ) {
        this .posicionX += d;
    }

    public void moverIzquierda( double d ) {
        this .posicionX -= d;
    }

    public void moverArriba( double d ) {
        this .posicionY += d;
    }

    public void moverAbajo( double d ) {
        this .posicionY -= d;
    }

    @Override
    public void golpear( Personaje p ) {
        super .golpear( p );

        if( p instanceof Enemigo ) {
            Enemigo enemigo = ( Enemigo ) p;
            enemigo .evolucionar();
        }

    }

    @Override
    public String toString() {
        return "Jugador [ " +
            super .toString() +
            ", \n   numeroBotiquines: " + this .numeroBotiquines +
        "\n ]";
    }

}
