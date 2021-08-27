package co.edu.udea.jcarlosj.reto_4;

public class StartVariante2 {
    public static void main( String[] args ) throws Exception {
        Restaurante sopasysopitas = new Restaurante();
        System.out.println( sopasysopitas );

        Pedido pedido1 = new Pedido( "3492", "7987823", 340, 26, 8, 2021 );
        System.out.println( pedido1 );
    }
}
