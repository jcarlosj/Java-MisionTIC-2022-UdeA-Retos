package co.edu.udea.jcarlosj.reto_2;

import java.time.Year;

public class Jugador extends Personaje {
    // Atributos
    private int numeroBotiquines;

    public Jugador( String name, char gender, double x, double y, double damage ) {
        super( name, gender, x, y, damage );
    }

    // Metodos
    public void usarBotiquin() {
        if( this .numeroBotiquines > 0 ) {
            this .numeroBotiquines --;
            this .vida += 5;
        }
    }

    public void recogerBotiquin() {
        this .numeroBotiquines ++;
    }

    public int getNumeroBotiquines() {
        return this .numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this .numeroBotiquines = numeroBotiquines;
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
    public void golpear( Personaje personaje ) {
        super . golpear( personaje );

        Enemigo enemigo = ( Enemigo ) personaje;
        enemigo .evolucionar();
    }

    @Override
    public String toString() {
        return "Jugador [ " +
            super .toString() +
            ", \n   numeroBotiquines: " + numeroBotiquines +
        "\n ]";
    }

}
