package co.edu.udea.jcarlosj.reto_4;

import java.time.LocalDate;
import java.time.Period;

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
        // Verifica que diaNacimiento sea un numero entre 1 y 31
        if( diaNacimiento > 0 && diaNacimiento < 32 )
            this .diaNacimiento = diaNacimiento;

    }
    public int getMesNacimiento() {
        return this .mesNacimiento;
    }
    public void setMesNacimiento( int mesNacimiento ) {
        // Verifica que mesNacimiento sea un numero entre 1 y 12
        if( mesNacimiento > 0 && mesNacimiento < 13 )
            this .mesNacimiento = mesNacimiento;

    }
    public int getYearNacimiento() {
        return this .yearNacimiento;
    }
    public void setYearNacimiento( int yearNacimiento ) {
        // Verifica que yearNacimiento sea un numero entre 1900 y 3000
        if( yearNacimiento > 1899 && yearNacimiento < 3001 )
            this .yearNacimiento = yearNacimiento;

    }

    // Metodos
    public int calcularEdad() {
        LocalDate fechaNacimiento = LocalDate .of( this .yearNacimiento, this .mesNacimiento, this .diaNacimiento );
        LocalDate fechaActual = LocalDate .now();

        Period periodo = Period .between( fechaNacimiento, fechaActual );

        return periodo .getYears();
    }

    public double salarioQuincenal() {

        return this .salarioPorHora * this .horasTrabajadas;
    }

    @Override
    public String toString() {
        return
            "\n    { " +
            "nombre: " + nombre +
            ", CC: " + CC +
            ", diaNacimiento: " + diaNacimiento +
            ", mesNacimiento: " + mesNacimiento +
            ", yearNacimiento: " + yearNacimiento +
            ", horasTrabajadas: " + horasTrabajadas +
            ", salarioPorHora: " + salarioPorHora +
            " }";
    }

}
