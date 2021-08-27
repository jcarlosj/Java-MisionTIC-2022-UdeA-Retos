package co.edu.udea.jcarlosj.reto_4;

public class StartVariante2 {
    public static void main( String[] args ) throws Exception {
        Restaurante sopasysopitas = new Restaurante();
        System.out.println( sopasysopitas );

        Pedido pedido1 = new Pedido( "3492", "7987823", 340, 26, 7, 2021 );
        Pedido pedido2 = new Pedido( "3493", "7987824", 210, 26, 8, 2021 );
        Pedido pedido3 = new Pedido( "3494", "7987824", 40, 26, 9, 2021 );

        sopasysopitas .agregarPedidoLista( pedido1 );
        sopasysopitas .agregarPedidoLista( pedido2 );
        sopasysopitas .agregarPedidoLista( pedido3 );
        System.out.println( sopasysopitas );

        sopasysopitas .eliminarPedido( "3494" );
        System.out.println( sopasysopitas );

        System .out .println( "total ganancias de todos los pedidos: " + sopasysopitas .calcularGanancias() );
        System .out .println( "promedio ganancias totales de todos los pedidos: " + sopasysopitas .promedioGananciasTotales() );
        System .out .println( "desviacion estandar del costo de todos los pedidos: " + sopasysopitas .desviacionEstandarGananciasTotales() );
    }
}
