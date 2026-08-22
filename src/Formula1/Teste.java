package Formula1;

public class Teste {
    public static void main(String[] args) {

        Piloto p = new Piloto();
        p.nome = "Ayrton Senna";
        p.idade = 27;
        p.nacionalidade = "Brasil";
        p.numeroVitorias = 41;

        Engenheiro eng = new Engenheiro();
        eng.nome = "Adrian Newey";
        eng.idade = 65;
        eng.nacionalidade = "Inglaterra";
        eng.trb_piloto = p;

        Patrocinadores p1 = new Patrocinadores();
        p1.nome_pat = "Shell";
        p1.valor_pat = 10000;

        Patrocinadores p2 = new Patrocinadores();
        p2.nome_pat = "Petrobras";
        p2.valor_pat = 20000;

        Patrocinadores p3 = new Patrocinadores();
        p3.nome_pat = "Pirelli";
        p3.valor_pat = 15000;

        Equipe e = new Equipe();
        e.nome_equipe = "Ferrari";
        e.fundacao = 1929;
        e.engenheiro = eng;

        e.patrocinadores[0] = p1;
        e.patrocinadores[1] = p2;
        e.patrocinadores[2] = p3;

        Formula1 f1 = new Formula1();
        f1.numero = 1;
        f1.posicao = 2;
        f1.piloto = p;
        f1.equipe = e;

        f1.mostrar();
    }
}