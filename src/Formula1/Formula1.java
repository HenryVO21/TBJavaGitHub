package Formula1;

public class Formula1 {
    public int numero, posicao;
    public Equipe equipe;
    public Piloto piloto;

    public void mostrar() {
        System.out.println("\n========== Informações do Piloto ==========");

        piloto.mostrar();

        System.out.println("\n========== Equipe do Piloto ==========");

        equipe.mostrar();

        System.out.println("\nNúmero da F1: " + numero);
        System.out.println("Posição do piloto: " + posicao);
    }
}