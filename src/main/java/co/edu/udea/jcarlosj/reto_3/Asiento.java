package co.edu.udea.jcarlosj.reto_3;

public abstract class Asiento {
    // Atributos
    protected char tipo;
    private String ID;
    private boolean pantallaEncendida;
    private double inclinacionSilla;
    private boolean luzLecturaEncendida;
    private boolean luzAsistenciaEncendida;
    private boolean aireAcondicionadoEncendido;

    // Constructor
    public Asiento( String iD, char tipo ) {
        this .ID = iD;
        this .tipo = tipo;

        this .inclinacionSilla = 90;
    }

    // Getters and setters
    public char getTipo() {
        return this .tipo;
    }

    public void setTipo( char tipo ) {
        this .tipo = tipo;
    }

    public String getID() {
        return this .ID;
    }

    public void setID( String iD ) {
        this .ID = iD;
    }

    public boolean isPantallaEncendida() {
        return this .pantallaEncendida;
    }

    public void setPantallaEncendida( boolean pantallaEncendida ) {
        this .pantallaEncendida = pantallaEncendida;
    }

    public double getInclinacionSilla() {
        return this .inclinacionSilla;
    }

    public void setInclinacionSilla( double inclinacionSilla ) {
        if( inclinacionSilla < 0 ) this .inclinacionSilla = 0;
        else if( inclinacionSilla < 136 ) this .inclinacionSilla = inclinacionSilla;
        else this .inclinacionSilla = 135;
    }

    public boolean isLuzLecturaEncendida() {
        return this .luzLecturaEncendida;
    }

    public void setLuzLecturaEncendida( boolean luzLecturaEncendida ) {
        this .luzLecturaEncendida = luzLecturaEncendida;
    }

    public boolean isLuzAsistenciaEncendida() {
        return this .luzAsistenciaEncendida;
    }

    public void setLuzAsistenciaEncendida( boolean luzAsistenciaEncendida ) {
        this .luzAsistenciaEncendida = luzAsistenciaEncendida;
    }

    public boolean isAireAcondicionadoEncendido() {
        return this .aireAcondicionadoEncendido;
    }

    public void setaireAcondicionadoEncendido( boolean aireAcondicionadoEncendido ) {
        this .aireAcondicionadoEncendido = aireAcondicionadoEncendido;
    }


    // Metodos Abstractos
    public abstract String imprimirMenuPantalla();

    // Metodos
    public void gestionarAireAcondicionado() {
        this .aireAcondicionadoEncendido = ! this .aireAcondicionadoEncendido;
    }

    public void gestionarPantalla() {
        this .pantallaEncendida = ! this .pantallaEncendida;
    }

    public void gestionarLuzLectura() {
        this .luzLecturaEncendida = ! this .luzLecturaEncendida;
    }

    public void gestionarLuzAsistencia() {
        this .luzAsistenciaEncendida = ! this .luzAsistenciaEncendida;
    }

    public void aumentarInclinacion( double d ) {
        this .setInclinacionSilla( this .getInclinacionSilla() + d );
    }

    public void disminuirInclinacion( double d ) {
        this .setInclinacionSilla( this .getInclinacionSilla() - d );
    }

    @Override
    public String toString() {
        return
            "\n   ID: " + this .ID +
            "\n   aireAcondicionadoEncendido: " + this .aireAcondicionadoEncendido +
            "\n   inclinacionSilla: " + this .inclinacionSilla +
            "\n   luzAsistenciaEncendida: " + this .luzAsistenciaEncendida +
            "\n   luzLecturaEncendida: " + this .luzLecturaEncendida +
            "\n   pantallaEncendida: " + this .pantallaEncendida +
            "\n   tipo: " + this .tipo;
    }

}
