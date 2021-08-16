package co.julio;

public class Personaje {
    //Inserte acá los atributos

    private String nombre;
    private char sexo;
    private double posicionX;
    private double posicionY;
    private double damage;
    private double vida;


    //Inserte acá el método constructor
    public Personaje(String nombre, char sexo, int posicionX, int posicionY, int damage) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.damage = damage;
        this.vida=100;
    }


    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void golpear(Personaje p) {

        p .recibirImpacto( this .damage /calcularDistanciaRespectoPersonaje(p) );

        // if(p.getVida()>0){
        //     p.setVida((p.getVida()-(this.damage /calcularDistanciaRespectoPersonaje(p))));
        // }else{
        //     p.setVida(0);
        // }
    }

    public void recibirImpacto(double g) {
        System.out.println( "???? vida: " + this .getVida() + ", golpe: " + g );
        setVida(getVida()-g);
    }

    public double calcularDistanciaRespectoPersonaje(Personaje p) {
        //double MayX=0, MayY=0,MayorDistancia=0;
        // if(posicionY<0){
        //     setVida(getVida()-5);
        // }

        // if (p.posicionX > posicionX) {
        //     MayX = p.posicionX-posicionX;
        // }

        // if (posicionX > p.posicionX) {
        //     MayX = posicionX-p.posicionX;
        // }
        // if(p.posicionY>posicionY){
        //     MayY=p.posicionY-posicionY;
        // }

        // if(posicionY>p.posicionY){
        //     MayY=posicionY-p.posicionY;
        // }

        // if(MayX>MayY){
        //     MayorDistancia=MayX;
        // }

        // if(MayY>MayX){
        //     MayorDistancia=MayY;
        // }

        //return MayorDistancia;

        // Math .sqrt( ( x2 - x1 ) + ( y2 - y1 ) );
        return Math .sqrt( 
            Math .pow( ( this .posicionX - p .posicionX ), 2 ) +
            Math .pow( ( this .posicionY - p .posicionY ), 2 )
        );

    }


    //Inserte acá los SETTERS Y GETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getVida() {
        return this .vida;
    }

    public void setVida(double vida) {
        if( vida < 0 ) {
            this .vida = 0;
        }
        else if( vida <= 100 ) {
            this.vida = vida;
        }
        else {
            this .vida = 100;
        }
    }

    @Override
    public String toString() {
        return
            "\n   nombre: " + this .nombre + ", sexo: " + this .sexo +
            ", \n   posicionX: " + this .posicionX + ", posicionY: " + this .posicionY +
            ", \n   damage: " + this .damage + ", vida: " + this .vida;
    }
}
