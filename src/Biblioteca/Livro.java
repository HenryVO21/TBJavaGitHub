package Biblioteca;

public class Livro extends Publicacao{
    private boolean situacao;

    public Livro( boolean situacao, String titulo){
        super(titulo);
        this.situacao = false;
    }

    public boolean Empretimo(){

    }
}
