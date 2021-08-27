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
    public void agregarPedidoLista( Pedido p ) {}

    public void eliminarPedido( String nPedido ) {}

    public double calcularGanancias() {}

    public double promedioGananciasTotales() {}

    public double desviacionEstandarGananciasTotales() {}

    public double retornarCostoPedido( double ID ) {}


    @Override
    public String toString() {
        return
            "\npedidoSeleccionado: " + this .pedidoSeleccionado +
            "Restaurante { " +
            "\n  pedidos: " + pedidos +
            "\n}";
    }

    

}
