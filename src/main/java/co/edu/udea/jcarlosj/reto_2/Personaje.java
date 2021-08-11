package co.edu.udea.jcarlosj.reto_2;

public class Personaje {
    // Atributos
    protected String nombre;
    protected char sexo;
    protected double posicionX;
    protected double posicionY;
    protected double damage;
    protected double vida;

    // Cosntructor
    public Personaje( String nombre, char sexo, double x, double y, double damage ) {
        this .nombre = nombre;
        this .sexo = sexo;
        this .vida = 100;
        this .posicionX = x;
        this .posicionY = y;
        this .damage = damage;
    }

    // Getters and setters
    public String getNombre() {
        return this .nombre;
    }

    public void setNombre(String nombre) {
        this .nombre = nombre;
    }

    public char getSexo() {
        return this .sexo;
    }

    public void setSexo(char sexo) {
        this .sexo = sexo;
    }

    public double getVida() {
        return this .vida;
    }

    public void setVida(double vida) {
        this .vida = ( vida >= 0 && vida <= 100 ) ? vida : this .vida;
    }

    public double getPosicionX() {
        return this .posicionX;
    }

    public void setPosicionX(double posicionX) {
        this .posicionX = posicionX;
    }

    public double getPosicionY() {
        return this .posicionY;
    }

    public void setPosicionY(double posicionY) {
        this .posicionY = posicionY;
    }

    public double getDamage() {
        return this .damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    // Metodos
    public void golpear( Personaje personaje ) {
        double castigo = this .damage / this .calcularDistanciaRespectoPersonaje( personaje );

        if( castigo <= personaje .vida ) {
            personaje .vida -= castigo;
        }
    }

    public void recibirImpacto( double d ) {
        this .vida = ( d > this .vida ) ? 0 : this .vida - d;
    }


    public double calcularDistanciaRespectoPersonaje( Personaje personaje ) {
        return Math .abs(
            Math .sqrt(
                Math .pow( this .posicionX - personaje .posicionX, 2 ) +
                Math .pow( this .posicionY - personaje .posicionY, 2 )
            )
        );
    }

    @Override
    public String toString() {
        return
            "\n   nombre: " + this .nombre +
            ", \n   sexo: " + this .sexo +
            ", \n   posicionX: " + this .posicionX +
            ", \n   posicionY: " + this .posicionY +
            ", \n   damage: " + this .damage +
            ", \n   vida: " + this .vida;
    }

}
