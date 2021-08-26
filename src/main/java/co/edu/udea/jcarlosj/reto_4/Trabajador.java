package co.edu.udea.jcarlosj.reto_4;

public class Trabajador {
    // Atributos
    private String nombre;
    private String CC;
    private double salarioPorHora;
    private int horasTrabajadas;
    private int diaNacimiento;
    private int mesNacimiento;
    private int yearNacimiento;

    // Constructor
    public Trabajador( String nombre, String cC, double salarioPorHora, int horasTrabajadas, int diaNacimiento, int mesNacimiento, int yearNacimiento ) {
        this .nombre = nombre;
        this .CC = cC;
        this .salarioPorHora = salarioPorHora;
        this .horasTrabajadas = horasTrabajadas;
        this .diaNacimiento = diaNacimiento;
        this .mesNacimiento = mesNacimiento;
        this .yearNacimiento = yearNacimiento;
    }
    // Getters and setters
    public String getNombre() {
        return this .nombre;
    }
    public void setNombre( String nombre ) {
        this .nombre = nombre;
    }
    public String getCC() {
        return this .CC;
    }
    public void setCC( String cC ) {
        this .CC = cC;
    }
    public double getSalarioPorHora() {
        return this .salarioPorHora;
    }
    public void setSalarioPorHora( double salarioPorHora ) {
        this .salarioPorHora = salarioPorHora;
    }
    public int getHorasTrabajadas() {
        return this .horasTrabajadas;
    }
    public void setHorasTrabajadas( int horasTrabajadas ) {
        this .horasTrabajadas = horasTrabajadas;
    }
    public int getDiaNacimiento() {
        return this .diaNacimiento;
    }
    public void setDiaNacimiento( int diaNacimiento ) {
        this .diaNacimiento = diaNacimiento;
    }
    public int getMesNacimiento() {
        return this .mesNacimiento;
    }
    public void setMesNacimiento( int mesNacimiento ) {
        this .mesNacimiento = mesNacimiento;
    }
    public int getYearNacimiento() {
        return this .yearNacimiento;
    }
    public void setYearNacimiento( int yearNacimiento ) {
        this .yearNacimiento = yearNacimiento;
    }

    // Metodos
    public int calcularEdad() {}

    public double salarioQuincena() {}

    @Override
    public String toString() {
        return
            "Trabajador [" +
            "\n  nombre: " + nombre +
            "\n  CC: " + CC +
            "\n  diaNacimiento: " + diaNacimiento +
            "\n  mesNacimiento: " + mesNacimiento +
            "\n  yearNacimiento: " + yearNacimiento +
            "\n  horasTrabajadas: " + horasTrabajadas +
            "\n  salarioPorHora: " + salarioPorHora +
            "\n]";
    }

}
