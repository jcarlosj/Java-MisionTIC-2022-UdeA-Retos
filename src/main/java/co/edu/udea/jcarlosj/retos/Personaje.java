package co.edu.udea.jcarlosj.retos;

public class Personaje {
    // Atributos 
    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double distanciaTotal;
    private int numeroBotiquines;
    private double vida;

    // Cosntructor
    public Personaje( String nombre, char sexo ) {
        this .nombre = nombre;
        this .sexo = sexo;
        this .vida = 100;
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

    public double getDistanciaTotal() {
        return this .distanciaTotal;
    }

    public void setDistanciaTotal(double distanciaTotal) {
        this .distanciaTotal = distanciaTotal;
    }

    public int getNumeroBotiquines() {
        return this .numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this .numeroBotiquines = numeroBotiquines;
    }

    public double getVida() {
        return this .vida;
    }

    public void setVida(double vida) {
        this .vida = vida;
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

    public void moverDerecha( double d ) {
        this .posicionX += d;
        this .distanciaTotal += d;
    }

    public void moverIzquierda( double d ) {
        this .posicionX -= d;
        this .distanciaTotal += d;
    }

    public void moverArriba( double d ) {
        this .posicionY += d;
        this .distanciaTotal += d;
    }

    public void moverAbajo( double d ) {
        this .posicionY -= d;
        this .distanciaTotal += d;
    }

    public double calcularDistanciaRespectoOrigen() {
        return Math .sqrt( Math .pow( this .posicionX, 2 ) + Math .pow( this .posicionY, 2 ) );
    }

    @Override
    public String toString() {
        return "Personaje [ distanciaTotal: " + distanciaTotal + ", nombre: " + nombre + ", numeroBotiquines: "
                + numeroBotiquines + ", posicionX: " + posicionX + ", posicionY: " + posicionY + ", sexo: " + sexo
                + ", vida: " + vida + " ]";
    }

    public static void main( String[] args ) throws Exception {
        Personaje explorer = new Personaje( "Explorador", 'm' );

        explorer .moverDerecha( 2 );
        explorer .moverAbajo( 5 );
        explorer .moverIzquierda( 1 );

        System.out.println( explorer );
        System.out.println( explorer .calcularDistanciaRespectoOrigen() );
        System.out.println( explorer .getVida() );

        explorer .setVida( explorer .getVida() - 40 );
        System.out.println( explorer .getVida() );
        System.out.println( explorer );

        explorer .recogerBotiquin();
        explorer .recogerBotiquin();
        explorer .recogerBotiquin();
        System.out.println( explorer );

        explorer .usarBotiquin();
        explorer .usarBotiquin();
        System.out.println( explorer );


    }

}
