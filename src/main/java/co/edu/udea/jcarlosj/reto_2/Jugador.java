package co.edu.udea.jcarlosj.reto_2;

public class Jugador extends Personaje {
    // Atributos
    private int numeroBotiquines;
    private int incrementaSalud = 5;

    // Constructor
    public Jugador( String name, char gender, double x, double y, double damage ) {
        super( name, gender, x, y, damage );
    }

    // Getters and setters
    public int getNumeroBotiquines() {
        return this .numeroBotiquines;
    }

    public void setNumeroBotiquines( int numeroBotiquines ) {
        this .numeroBotiquines = numeroBotiquines;
    }

    // Metodos
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

    public void recogerBotiquin() {
        this .numeroBotiquines ++;
        System .out .println( this .nombre + " recoge botiquin: [ # botiquines: " + this .numeroBotiquines + " ] " );
    }

    public void usarBotiquin() {
        if( this .numeroBotiquines > 0 ) {
            this .numeroBotiquines --;

            this .setVida( this .getVida() + this .incrementaSalud );

            System .out .println( this .nombre + " usa botiquin: [ incrementa: " + this .incrementaSalud + ", vida: " + this .getVida() + " ] " );
        }
    }

    public void golpear( Enemigo p ) {
        super .golpear( p );
        p .evolucionar();
    }
    
    @Override
    public String toString() {
        return "Jugador [ " +
            super .toString() +
            ", \n   numeroBotiquines: " + this .numeroBotiquines +
        "\n ]";
    }
    
}
