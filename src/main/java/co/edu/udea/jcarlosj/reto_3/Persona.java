package co.edu.udea.jcarlosj.reto_3;

public abstract class Persona {
    // Atributos
    private String id;
    protected String nombre;
    private String email;
    protected String idioma;
    protected String url;

    // Constructor
    protected Persona( String id, String nombre, String email, String idioma ) {
        this .id = id;
        this .nombre = nombre;
        this .email = email;
        this .idioma = idioma;

        this .url = "educursos.com";
    }

    // Getters and setters
    public String getId() {
        return this .id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this .nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return this .email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdioma() {
        return this .idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getUrl() {
        return this .url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    // Metodo Abstracto
    public abstract void dirigir();

    @Override
    public String toString() {
        return
            "\n   email: " + email +
            "\n   id: " + id +
            "\n   idioma: " + idioma +
            "\n   nombre: " + nombre +
            "\n   url: " + url;
    }

}
