package co.edu.udea.jcarlosj.reto_2;

public class Jugador extends Personaje {
    // Atributos
    private int numeroBotiquines;

    // Constructor
    public Jugador( String name, char gender, double x, double y, double damage ) {
        super( name, gender, x, y, damage );
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
    }

    public void usarBotiquin() {
        if( this .numeroBotiquines > 0 ) {
            this .numeroBotiquines --;
            this .setVida( this .getVida() + 5 );
        }
    }

    // TODO: Definir funcionalidad del metodo golpear
    public void golpear() {}
    
    @Override
    public String toString() {
        return "Jugador [ " +
            super .toString() +
            ", \n   numeroBotiquines: " + this .numeroBotiquines +
        "\n ]";
    }
}
