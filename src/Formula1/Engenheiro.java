package Formula1;

public class Engenheiro extends Pessoa {
    public Piloto trb_piloto;

    public Engenheiro() {

    }

    public Engenheiro(String nome, String nacionalidade, int idade, Piloto trb_piloto) {
        super(nome, nacionalidade, idade);
        this.trb_piloto = trb_piloto;
    }

    public void mostrar() {
        System.out.println(
                "\nNome do engenheiro: " + nome +
                        "\nIdade do engenheiro: " + idade +
                        "\nNacionalidade do engenheiro: " + nacionalidade +
                        "\nPiloto com quem trabalha: " + trb_piloto.getNome()
        );
    }
}