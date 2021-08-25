package co.edu.udea.jcarlosj.reto_2;

public class CuentaBanco {
    // Atributos
    private String numeroCuenta;
    private String nombrePropietario;
    private double saldo;
    private double comision = 0.05;

    // Constructor
    public CuentaBanco( String numeroCuenta, String nombrePropietario, double saldo ) {
        this .numeroCuenta = numeroCuenta;
        this .nombrePropietario = nombrePropietario;
        this .saldo = saldo;
    }

    // Getters and setters
    public String getNumeroCuenta() {
        return this .numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this .numeroCuenta = numeroCuenta;
    }

    public String getNombrePropietario() {
        return this .nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this .nombrePropietario = nombrePropietario;
    }

    public double getSaldo() {
        return this .saldo;
    }

    public void setSaldo(double saldo) {
        this .saldo = saldo;
    }


    // Metodos
    public void depositar( double c ) {
        this .setSaldo( this .getSaldo() + c );
    }

    public void retirar( double c ) {
        double retiroMasComision = c + this .comision * c;

        if( retiroMasComision <= this .getSaldo() )
            this .setSaldo( this .getSaldo() - retiroMasComision );

    }

    @Override
    public String toString() {
        return
            "\n   comision: " + comision +
            "\n   nombrePropietario: " + nombrePropietario +
            "\n   numeroCuenta: " + numeroCuenta +
            "\n   saldo: " + saldo;
    }

}
