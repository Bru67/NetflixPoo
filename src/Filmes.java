package src;

public class Filmes extends Catalogo{
    private String duracao;

    public Filmes(String genero, String titulo, String duracao){
        super(genero, titulo);
        this.duracao = duracao;
    }

    public String getDuracao() {
        return duracao;
    }
}
