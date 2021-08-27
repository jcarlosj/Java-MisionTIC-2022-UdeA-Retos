package co.edu.udea.jcarlosj.reto_4;

public class Pedido {
    // Atributos
    private String nPedido;
    private String IDCliente;
    private double costoPedido;
    private int diaPedido;
    private int mesPedido;
    private int yearPedido;

    // Constructor
    public Pedido( String nPedido, String iDCliente, double costoPedido, int diaPedido, int mesPedido, int yearPedido ) {
        this .nPedido = nPedido;
        this .IDCliente = iDCliente;
        this .costoPedido = costoPedido;
        this .diaPedido = diaPedido;
        this .mesPedido = mesPedido;
        this .yearPedido = yearPedido;
    }

    // Getters and setters
    public String getnPedido() {
        return this .nPedido;
    }

    public void setnPedido(String nPedido) {
        this .nPedido = nPedido;
    }

    public String getIDCliente() {
        return this .IDCliente;
    }

    public void setIDCliente(String iDCliente) {
        IDCliente = iDCliente;
    }

    public double getCostoPedido() {
        return this .costoPedido;
    }

    public void setCostoPedido(double costoPedido) {
        this .costoPedido = costoPedido;
    }

    public int getDiaPedido() {
        return this .diaPedido;
    }

    public void setDiaPedido(int diaPedido) {
        this .diaPedido = diaPedido;
    }

    public int getMesPedido() {
        return this .mesPedido;
    }

    public void setMesPedido(int mesPedido) {
        this .mesPedido = mesPedido;
    }

    public int getYearPedido() {
        return this .yearPedido;
    }

    public void setYearPedido(int yearPedido) {
        this .yearPedido = yearPedido;
    }

    @Override
    public String toString() {
        return
            "\n    { " +
            "IDCliente: " + this .IDCliente +
            ", costoPedido: " + this .costoPedido +
            ", diaPedido: " + this .diaPedido +
            ", mesPedido: " + this .mesPedido +
            ", nPedido: " + this .nPedido +
            ", yearPedido: " + this .yearPedido +
            " }";
    }

    
}
