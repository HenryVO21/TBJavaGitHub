package Formula1;

public class Patrocinadores {
    public String nome_pat;
    public double valor_pat;

    public Patrocinadores() {

    }

    public Patrocinadores(String nome_pat, double valor_pat) {
        this.nome_pat = nome_pat;
        this.valor_pat = valor_pat;
    }

    public void mostrar() {
        System.out.println(
                "\nNome do patrocinador: " + nome_pat +
                        "\nValor do patrocínio: R$ " + valor_pat
        );
    }
}