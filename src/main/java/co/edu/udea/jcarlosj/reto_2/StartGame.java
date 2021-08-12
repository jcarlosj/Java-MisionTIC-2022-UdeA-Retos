package co.edu.udea.jcarlosj.reto_2;

public class StartGame {
    public static void main( String[] args ) throws Exception {

        // 1. Comienza la partida: Crea instancias de Jugador y Enemigo
        Jugador gamer = new Jugador( "Explorador", 'm', 0, 5, 100 );
        Enemigo enemy = new Enemigo( "Bitter", 'f', 0, 0, 80 );
        System .out .println( "1. Comienza partida \n " + gamer + " \n " + enemy + " \n " );

        // 2. Jugador golpea 2 veces y se mueve 10 a la derecha y 5 a la izquierda
        gamer .golpear( enemy );
        gamer .golpear( enemy );
        gamer .moverDerecha( 10 );
        gamer .moverAbajo( 5 );
        System .out .println( "2. Jugador golpea 2 veces y se mueve \n " + gamer + " \n " + enemy + " \n " );

        // 3. Enemigo golpea 2 veces, Jugador recoge un botiquin
        enemy .golpear( gamer );
        enemy .golpear( gamer );
        gamer .recogerBotiquin();
        System .out .println( "3. Enemigo golpea 2 veces, Jugador recoge botiquin \n " + gamer + " \n " + enemy + " \n " );

        // 4. Jugador usa botiquin 2 veces y golpea 3 veces
        gamer .usarBotiquin();
        gamer .usarBotiquin();
        gamer .golpear( enemy );
        gamer .golpear( enemy );
        gamer .golpear( enemy );
        System .out .println( "4. Jugador recoge 2 botiquines y golpea 3 veces \n " + gamer + " \n " + enemy + " \n " );

        // 5. Enemigo golpea 2 veces
        enemy .golpear( gamer );
        enemy .golpear( gamer );
        System .out .println( "5. Enemigo golpea 2 veces \n " + gamer + " \n " + enemy + " \n " );

        // 6. Jugador golpea 2 veces
        gamer .golpear( enemy );
        gamer .golpear( enemy );
        System .out .println( "6. Jugador golpea 2 veces \n " + gamer + " \n " + enemy + " \n " );

        // 7. Jugador golpea 3 veces
        gamer .golpear( enemy );
        gamer .golpear( enemy );
        gamer .golpear( enemy );
        System .out .println( "7. Jugador golpea 3 veces \n " + gamer + " \n " + enemy + " \n " );

    }
}