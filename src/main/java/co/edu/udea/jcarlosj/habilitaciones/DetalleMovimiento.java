package co.edu.udea.jcarlosj.habilitaciones;

public class DetalleMovimiento {
    // Atributos
    private int dia;
    private int mes;
    private int year;
    private int tipoMovimiento;
    private double saldoMovido;
    private String cuentaInteraccion;

    // Constructor
    public DetalleMovimiento( int dia, int mes, int year, int tipoMovimiento, double saldoMovido, String cuentaInteraccion ) {
        this .dia = dia;
        this .mes = mes;
        this .year = year;
        this .tipoMovimiento = tipoMovimiento;
        this .saldoMovido = saldoMovido;
        this .cuentaInteraccion = cuentaInteraccion;
    }
    // Getters and setters
    public int getDia() {
        return this .dia;
    }
    public void setDia(int dia) {
        // Concepto: Restriccion rango de 1 a 31
        if( dia > 0 && dia < 32 ) {
            this.dia = dia;
        }
    }
    public int getMes() {
        return this .mes;
    }
    public void setMes(int mes) {
        // Concepto: Restriccion rango de 1 a 12
        if( mes > 0 && mes < 13 ) {
            this.mes = mes;
        }
    }
    public int getYear() {
        return this .year;
    }
    public void setYear(int year) {
        // Concepto: Restriccion rango de 1900 a 3000
        if( year > 1899 && year < 3001 ) {
            this.year = year;
        }
    }
    public int getTipoMovimiento() {
        return this .tipoMovimiento;
    }
    public void setTipoMovimiento(int tipoMovimiento) {
        // Concepto: Restriccion rango de 1 a 4
        if( tipoMovimiento > 0 && tipoMovimiento < 5 ) {
            this.tipoMovimiento = tipoMovimiento;
        }
    }
    public double getSaldoMovido() {
        return this .saldoMovido;
    }
    public void setSaldoMovido(double saldoMovido) {
        this.saldoMovido = saldoMovido;
    }
    public String getCuentaInteraccion() {
        return this .cuentaInteraccion;
    }
    public void setCuentaInteraccion(String cuentaInteraccion) {
        // Concepto: Restriccion entre transacciones/(depositos y retiros)
        if( tipoMovimiento > 0 && tipoMovimiento < 3 ) {
            this.cuentaInteraccion = cuentaInteraccion;
        }
        else if( tipoMovimiento > 2 && tipoMovimiento < 5 ) {
            this .cuentaInteraccion = "NONE";
        }

    }

    @Override
    public String toString() {
        return
            "{ cuentaInteraccion: " + this .cuentaInteraccion +
            ", dia: " + this .dia +
            ", mes: " + this .mes +
            ", saldoMovido: " + this .saldoMovido +
            ", tipoMovimiento: " + this .tipoMovimiento +
            ", year: " + this .year +
            " }";
    }

}
