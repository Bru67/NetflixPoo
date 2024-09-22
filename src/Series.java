package src;

public class Series extends Catalogo{
    private int temporadas;
    private int mediaEpisodios;

    public Series(String genero, String titulo, int temporadas, int mediaEpisodios) {
        super(genero, titulo);
        this.temporadas = temporadas;
        this.mediaEpisodios = mediaEpisodios;
    }

    public int getTeporadas() {
        return temporadas;
    }

    public int getMediaEpisodios() {
        return mediaEpisodios;
    }
}
