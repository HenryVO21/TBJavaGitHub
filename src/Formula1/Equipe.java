package Formula1;

public class Equipe {
    public String nome_equipe;
    public int fundacao;
    public Engenheiro engenheiro;
    public Patrocinadores[] patrocinadores;

    public Equipe() {
        patrocinadores = new Patrocinadores[3];
    }

    public void mostrar() {
        System.out.println(
                "\nNome da equipe: " + nome_equipe +
                        "\nAno de fundação: " + fundacao
        );

        System.out.println("\n---------- Engenheiro da Equipe ----------");

        if (engenheiro != null) {
            engenheiro.mostrar();
        } else {
            System.out.println("Nenhum engenheiro cadastrado.");
        }

        System.out.println("\n---------- Patrocinadores ----------");

        for (int i = 0; i < patrocinadores.length; i++) {
            if (patrocinadores[i] != null) {
                patrocinadores[i].mostrar();
            }
        }
    }
}