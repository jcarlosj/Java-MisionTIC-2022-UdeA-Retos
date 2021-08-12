package co.edu.udea.jcarlosj.reto_2;

public class StartGame {
    public static void main( String[] args ) throws Exception {

        Jugador gamer = new Jugador( "Explorador", 'm', 0, 5, 100 );
        Enemigo enemy = new Enemigo( "Bitter", 'f', 0, 0, 80 );
        println( "1. Comienza la partida: Crea instancias de Jugador y Enemigo", gamer, enemy );

        gamer .golpear( enemy );
        gamer .golpear( enemy );
        gamer .moverDerecha( 10 );
        gamer .moverAbajo( 5 );
        println( "2. Jugador golpea 2 veces y se mueve", gamer, enemy );

        enemy .golpear( gamer );
        enemy .golpear( gamer );
        gamer .recogerBotiquin();
        println( "3. Enemigo golpea 2 veces, Jugador recoge botiquin", gamer, enemy );

        gamer .usarBotiquin();
        gamer .usarBotiquin();
        gamer .golpear( enemy );
        gamer .golpear( enemy );
        gamer .golpear( enemy );
        println( "4. Jugador usa botiquin 2 veces y golpea 3 veces", gamer, enemy );

        enemy .golpear( gamer );
        enemy .golpear( gamer );
        println( "5. Enemigo golpea 2 veces", gamer, enemy );

        gamer .golpear( enemy );
        gamer .golpear( enemy );
        println( "6. Jugador golpea 2 veces", gamer, enemy );

        gamer .golpear( enemy );
        gamer .golpear( enemy );
        gamer .golpear( enemy );
        println( "7. Jugador golpea 3 veces", gamer, enemy );

    }

    public static void println( String msg, Personaje gamer, Personaje enemy ) {
        System .out .println( "-------------------------------- " );
        System .out .println( msg + " \n " + gamer + " \n " + enemy + " \n " );
    }
}