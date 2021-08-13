package co.edu.udea.jcarlosj.reto_2;

public class Personaje {
    // Atributos
    protected String nombre;
    private char sexo;
    protected double posicionX;
    protected double posicionY;
    private double damage;
    private double vida;

    // Constructor
    public Personaje( String nombre, char sexo, double x, double y, double damage ) {
        this .nombre = nombre;
        this .sexo = sexo;
        this .posicionX = x;
        this .posicionY = y;
        this .damage = damage;

        this .vida = 100;
        this .moreResistencia = false;
    }

    // Getters and setters
    public String getNombre() {
        return this .nombre;
    }

    public void setNombre( String nombre ) {
        this .nombre = nombre;
    }

    public char getSexo() {
        return this .sexo;
    }

    public void setSexo( char sexo ) {
        this .sexo = sexo;
    }

    public double getPosicionX() {
        return this .posicionX;
    }

    public void setPosicionX( double posicionX ) {
        this .posicionX = posicionX;
    }

    public double getPosicionY() {
        return this .posicionY;
    }

    public void setPosicionY( double posicionY ) {
        this .posicionY = posicionY;
    }

    public double getDamage() {
        return this .damage;
    }

    public void setDamage( double damage ) {
        this .damage = damage;
    }

    public double getVida() {
        return this .vida;
    }

    public void setVida( double vida ) {
        // Verifica que el valor ingresado sea del rango que maximo y minimo que puede tener un personaje
        this .vida = ( vida > -1 && vida < 101 )
            ?   vida
            :   100;
    }

    // Metodos
    public void golpear( Personaje p ) {    // p: Personaje que recibe el daño
        double fuerzaImpacto = this .damage / this .calcularDistanciaRespectoPersonaje( p );
        p .recibirImpacto( fuerzaImpacto );

        System.out.println( " Golpean a " + p .nombre + ": [ damage: " + this .damage + ", fuerza: " + fuerzaImpacto + ", vida: " + p .vida + " ] " );
    }

    public void recibirImpacto( double d ) {
        // Verifica que haya puntos de vida disponibles para restar vida
        if ( this .havePuntosVida( d ) )
            this .setVida( this .getVida() - d );
        else
            this .setVida( 0 );
    }

    public double calcularDistanciaRespectoPersonaje( Personaje p ) {
        return Math .abs(
            Math .sqrt(
                Math .pow( this .posicionX - p .posicionX, 2 ) +
                Math .pow( this .posicionY - p .posicionY, 2 )
            )
        );
    }

    // Verifica si hay puntos de vida para restar
    protected boolean havePuntosVida( double d ) {
        return d <= this .getVida();
    }

    // Suma puntos de vida
    protected void agregarPuntosVida( int d ) {
        this .setVida( this .getVida() + d );
    }

    @Override
    public String toString() {
        return
            "\n   nombre: " + this .nombre + ", sexo: " + this .sexo +
            ", \n   posicionX: " + this .posicionX + ", posicionY: " + this .posicionY +
            ", \n   damage: " + this .damage + ", vida: " + this .vida;
    }

}
