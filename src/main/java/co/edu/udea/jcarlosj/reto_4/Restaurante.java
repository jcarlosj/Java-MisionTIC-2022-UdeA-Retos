package co.edu.udea.jcarlosj.reto_4;

import java.util.ArrayList;

public class Restaurante {
    // Atributos
    private ArrayList<Pedido> pedidos;
    private Pedido pedidoSeleccionado;


    // Constructor
    public Restaurante() {
        this .pedidos = new ArrayList<Pedido>();
        this .pedidoSeleccionado = null;
    }


    // Getters and setters
    public ArrayList<Pedido> getPedidos() {
        return this .pedidos;
    }

    public void setPedidos( ArrayList<Pedido> pedidos ) {
        this .pedidos = pedidos;
    }

    // Metodos
    private void buscar( String nPedido ) {

        for( Pedido pedido : this .pedidos ) {
            // Verifica que el # de pedido que se requiere buscar en la lista
            if( pedido .getnPedido() .equals( nPedido ) ) {
                this .pedidoSeleccionado = pedido;
            }

        }

    }

    public void agregarPedidoLista( Pedido p ) {
        this .buscar( p .getnPedido() );      // Busca un Pedido

        // Verifica que no exista un pedido con el mismo # de pedido
        if( this .pedidoSeleccionado == null ) {
            this .pedidos .add( p );
        }

        this .pedidoSeleccionado = null;

    }

    public void eliminarPedido( String ID ) {
        this .buscar( ID );                 // Busca un Pedido

        // Verifica que existe un pedido con # de pedido
        if( this .pedidoSeleccionado != null ) {
            this .pedidos .remove( this .pedidoSeleccionado );
            this .pedidoSeleccionado = null;
        }
    }

    public double calcularGanancias() {
        double costoTodosPedidos = 0.0;

        for( Pedido pedido : this .pedidos )
            costoTodosPedidos += pedido .getCostoPedido();

        return costoTodosPedidos;
    }

    public double promedioGananciasTotales() {

        return this .calcularGanancias() / this .pedidos .size();
    }

    public double desviacionEstandarGananciasTotales() {
        double total = 0.0;

        for( Pedido pedido : this .pedidos ) {
            total += Math .pow( pedido .getCostoPedido() - this .promedioGananciasTotales(), 2 );
        }

        return Math .sqrt( ( 1 / (double) this .pedidos .size() ) * total );
    }

    public double retornarCostoPedido( String ID ) {
        double costoPedido = -1;

        this .buscar( ID );                 // Busca un Trabajador

        // Verifica que existe un trabajador con # de identificacion
        if( this .pedidoSeleccionado != null ) {
            costoPedido = this .pedidoSeleccionado .getCostoPedido();
            this .pedidoSeleccionado = null;
        }

        return costoPedido;
    }


    @Override
    public String toString() {
        return
            "\npedidoSeleccionado: " + this .pedidoSeleccionado +
            "\nRestaurante { " +
            "\n  pedidos: " + pedidos +
            "\n}";
    }

    

}
