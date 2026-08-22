package Biblioteca;

public class Livro extends Publicacao{
    private boolean situacao;

    public Livro(String titulo, boolean situacao){
        super(titulo);
    }

    public void Empretimo(){
        try {
            if(!situacao){
                throw new Exception("Livro Indisponivel!");
            }
            situacao = false;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void Devolutiva(){
        System.out.println("Livro Disponivel!");
        situacao = true;
    }

    public boolean ViewStatusBook(){
        return situacao;
    }
}
