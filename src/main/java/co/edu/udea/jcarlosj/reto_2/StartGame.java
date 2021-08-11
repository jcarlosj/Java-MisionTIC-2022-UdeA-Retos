package co.edu.udea.jcarlosj.reto_2;

public class StartGame {
    public static void main( String[] args ) throws Exception {

        // 1. Comienza la partida: Crea instancias de Jugador y Enemigo
        Jugador gamer = new Jugador( "Exploradora", 'f', -1.0, -1.0, 130.0 );
        Enemigo enemy = new Enemigo( "Bitter", 'f', 0, 0, 80 );
        //System .out .println( "1. Comienza partida \n " + gamer + " \n " + enemy );

        // 2. Jugador golpea 2 veces y se mueve 10 a la derecha y 5 a la izquierda
        // gamer .golpear( enemy );
        // gamer .golpear( enemy );
        // gamer .moverDerecha( 10 );
        // gamer .moverAbajo( 5 );
        //System .out .println( "2. Jugador golpea 2 veces y se mueve \n " + gamer + " \n " + enemy );

        // 3. Enemigo golpea 2 veces, Jugador recoge un botiquin
        // enemy .golpear( gamer );
        // enemy .golpear( gamer );
        // gamer .recogerBotiquin();
        //System .out .println( "3. Enemigo golpea 2 veces, Jugador recoge botiquin \n " + gamer + " \n " + enemy );

        // 4. Jugador usa botiquin 2 veces y golpea 3 veces
        // gamer .usarBotiquin();
        // gamer .usarBotiquin();
        // gamer .golpear( enemy );
        // gamer .golpear( enemy );
        // gamer .golpear( enemy );
        //System .out .println( "4. Jugador recoge 2 botiquines y golpea 3 veces \n " + gamer + " \n " + enemy );

        // 5. Enemigo golpea 2 veces
        // enemy .golpear( gamer );
        // enemy .golpear( gamer );
        //System .out .println( "5. Enemigo golpea 2 veces \n " + gamer + " \n " + enemy );

        // 6. Jugador golpea 2 veces
        // gamer .golpear( enemy );
        // gamer .golpear( enemy );
        //System .out .println( "6. Jugador golpea 2 veces \n " + gamer + " \n " + enemy );

        // 7. Jugador golpea 3 veces
        // gamer .golpear( enemy );
        // gamer .golpear( enemy );
        // gamer .golpear( enemy );
        //System .out .println( "7. Jugador golpea 3 veces \n " + gamer + " \n " + enemy );


        Jugador j = new Jugador( "Exploradora", 'f', -1.0, -1.0, 130.0 );
        j .golpear( enemy );
        j .golpear( enemy );
        j .usarBotiquin();
        j .recogerBotiquin();
        j .recogerBotiquin();
        j .usarBotiquin();
        j .moverArriba( 2 );
        enemy .golpear( j );
        System .out .println( "VPL. \n " + j );
    }
}