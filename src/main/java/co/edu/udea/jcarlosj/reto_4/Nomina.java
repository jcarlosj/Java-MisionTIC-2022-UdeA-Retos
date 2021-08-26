package co.edu.udea.jcarlosj.reto_4;

import java.util.ArrayList;

public class Nomina {
    // Atributos
    private ArrayList<Trabajador> trabajadores;

    // Constructor
    public Nomina() {
        this .trabajadores = new ArrayList<Trabajador>();
    }

    // Metodos
    public void agregarTrabajador( Trabajador trabajador ) {}

    public void eliminarTrabajador( String trabajador ) {}

    public double calcularSalarioQuincenaNomina( String trabajador ) {}

    public double promedioEdadNomina() {}

    public double desviacionEstandarEdadNomina() {}

    public double salarioQuincenalTrabajador( String trabajador ) {}

    @Override
    public String toString() {
        return
            "Nomina [ " +
            "\n  trabajadores: " + this .trabajadores + "\n]";
    }

}
