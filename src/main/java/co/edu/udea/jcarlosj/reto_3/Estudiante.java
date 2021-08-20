package co.edu.udea.jcarlosj.reto_3;

public class Estudiante extends Persona {

    public Estudiante( String id, String name, String email, String idioma ) {
        super( id, name, email, idioma );
    }

    public void dirigir() {
        System.out.println( " > " + this .url  );
        this .url += "/" + this .idioma + "/estudiante";
    }

    @Override
    public String toString() {
        return "Estudiante [ " + super.toString() + " \n]";
    }

}
