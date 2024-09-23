package src;

public class Catalogo {
    private String genero;
    private String titulo;

    public Catalogo(String genero, String titulo){
        this.genero = genero;
        this.titulo = titulo;
    }
    public Catalogo(){}


    public String getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }



}
