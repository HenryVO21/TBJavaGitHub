package Formula1;

public class Pessoa {
    public String nome, nacionalidade;
    public int idade;

    public Pessoa() {

    }

    public Pessoa(String nome, String nacionalidade, int idade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void mostrar() {
        System.out.println(
                "\nNome: " + nome +
                        "\nIdade: " + idade +
                        "\nNacionalidade: " + nacionalidade
        );
    }
}