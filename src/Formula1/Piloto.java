package Formula1;

public class Piloto extends Pessoa {
    public int numeroVitorias;

    public Piloto() {

    }

    public Piloto(String nome, String nacionalidade, int idade, int numeroVitorias) {
        super(nome, nacionalidade, idade);
        this.numeroVitorias = numeroVitorias;
    }

    public void mostrar() {
        System.out.println(
                "\nNome do piloto: " + nome +
                        "\nIdade: " + idade +
                        "\nNacionalidade: " + nacionalidade +
                        "\nNúmero de vitórias: " + numeroVitorias
        );
    }
}