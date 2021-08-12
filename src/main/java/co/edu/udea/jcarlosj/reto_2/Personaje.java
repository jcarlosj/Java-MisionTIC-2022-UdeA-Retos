package co.edu.udea.jcarlosj.reto_2;

public class Personaje {
    // Atributos
    private String nombre;
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
        this .vida = vida;
    }

    // Metodos
    // TODO: Definir funcionalidad del metodo golpear
    public void golpear() {}

    // TODO: Definir funcionalidad del metodo recibirImpacto
    public void recibirImpacto() {}

    // TODO: Definir funcionalidad del metodo calcularDistanciaRespectoPersonaje
    public void calcularDistanciaRespectoPersonaje() {}

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
