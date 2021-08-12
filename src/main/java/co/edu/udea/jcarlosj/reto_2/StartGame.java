package co.edu.udea.jcarlosj.reto_2;

public class StartGame {
    public static void main( String[] args ) throws Exception {

        // 1. Comienza la partida: Crea instancias de Jugador y Enemigo
        Jugador gamer = new Jugador( "Explorador", 'm', 0, 5, 100 );
        Enemigo enemy = new Enemigo( "Bitter", 'f', 0, 0, 80 );
        System .out .println( "1. Comienza partida \n " + gamer + " \n " + enemy + " \n " );

    }
}