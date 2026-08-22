package Biblioteca;

public class Livro extends Publicacao {
    private boolean situacao;

    public Livro(String titulo, boolean situacao) {
        super(titulo);
        this.situacao = situacao;
    }

    public void Empretimo() {
        try {
            if (!situacao) {
                throw new Exception("\n\n\nLivro Indisponivel!\nAviso: o livro já possui um emprestimo registrado.");
            }
            situacao = false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void Devolutiva() {
        try {
            if (situacao){
                throw new Exception("\n\n\nAviso: O respectivo livro consta como devolvido.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        situacao = true;
    }

    public boolean ViewStatusBook() {
        return situacao;
    }
}
