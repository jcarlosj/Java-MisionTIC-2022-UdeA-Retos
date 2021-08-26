package co.edu.udea.jcarlosj.reto_4;

public class StartVariante1 {
    public static void main(String[] args) throws Exception {
        Nomina empresa = new Nomina();
        System .out .println( empresa );

        Trabajador juan = new Trabajador( "Juan", "78783432", 120, 30, 24, 11, 1977 );
        Trabajador manu = new Trabajador( "Manu", "78783431", 150, 40, 3, 6, 1993 );
        Trabajador carlos = new Trabajador( "Carlos", "78783433", 90, 35, 24, 11, 1977 );

        empresa .agregarTrabajador( juan );
        empresa .agregarTrabajador( manu );
        empresa .agregarTrabajador( carlos );
        System .out .println( empresa );

        empresa .eliminarTrabajador( "78783433" );
        System .out .println( empresa );

        System .out .println( "total salarios quincenales de todos los trabajadores: " + empresa .calcularSalarioQuincenaNomina() );
        System .out .println( "promedio edad trabajadores en nomina: " + empresa .promedioEdadNomina() );
        System .out .println( "desviacion estandar edad trabajadores en nomina: " + empresa .desviacionEstandarEdadNomina() );

    }
}
