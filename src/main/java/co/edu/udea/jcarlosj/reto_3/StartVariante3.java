package co.edu.udea.jcarlosj.reto_3;

public class StartVariante3 {
    public static void main(String[] args) throws Exception {
        Bronce bronce = new Bronce( "PS10", 'p' );
        System .out .println( bronce );

        bronce .aumentarInclinacion( 5 );
        bronce .disminuirInclinacion( 5 );
        bronce .gestionarAireAcondicionado();
        System .out .println( bronce );

        System .out .println( bronce .imprimirMenuPantalla() );
    }
}
