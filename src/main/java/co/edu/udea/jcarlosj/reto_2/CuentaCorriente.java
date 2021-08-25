package co.edu.udea.jcarlosj.reto_2;

public class CuentaCorriente extends CuentaBanco {
    // Atributos
    private double cuotaManejo;

    // Constructor
    public CuentaCorriente( String numeroCuenta, String nombrePropietario, double saldo, double cuotaManejo ) {
        super( numeroCuenta, nombrePropietario, saldo );

        this .cuotaManejo = cuotaManejo;
    }

    // Getters and setters
    public double getCuotaManejo() {
        return this .cuotaManejo;
    }

    public void setCuotaManejo(double cuotaManejo) {
        this .cuotaManejo = cuotaManejo;
    }


    // Metodos
    public void cobrarCuotaManejo() {
        this .setSaldo( this .getSaldo() - this .cuotaManejo );
    }

    @Override
    public String toString() {
        return "CuentaCorriente [" +
            super .toString() +
            "\n   cuotaManejo: " + cuotaManejo +
        "\n]";
    }

}
