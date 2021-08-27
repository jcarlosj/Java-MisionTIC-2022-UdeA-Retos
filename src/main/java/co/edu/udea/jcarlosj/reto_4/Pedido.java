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
        // Verifica que diaPedido sea un numero entre 1 y 31
        if( diaPedido > 0 && diaPedido < 32 )
            this .diaPedido = diaPedido;

    }

    public int getMesPedido() {
        return this .mesPedido;
    }

    public void setMesPedido(int mesPedido) {
        // Verifica que mesPedido sea un numero entre 1 y 12
        if( mesPedido > 0 && mesPedido < 13 )
            this .mesPedido = mesPedido;
    }

    public int getYearPedido() {
        return this .yearPedido;
    }

    public void setYearPedido(int yearPedido) {
        // Verifica que yearPedido sea un numero entre 1900 y 3000
        if( yearPedido > 1899 && yearPedido < 3001 )
            this .yearPedido = yearPedido;
    }

    @Override
    public String toString() {
        return
            "\n    { " +
            "IDCliente: " + this .IDCliente +
            ", nPedido: " + this .nPedido +
            ", costoPedido: " + this .costoPedido +
            ", diaPedido: " + this .diaPedido +
            ", mesPedido: " + this .mesPedido +
            ", yearPedido: " + this .yearPedido +
            " }";
    }

}
