package Biblioteca;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do livro: ");
        String ttLivro = sc.nextLine();

        Livro lv = new Livro(ttLivro, true);

        System.out.println("\nDigite o nome do Periódico: ");
        String ttPeriodico = sc.nextLine();

        System.out.print("Digite o numero do Volume: ");
        int volume = sc.nextInt();

        Periodico pr = new Periodico(ttPeriodico,volume);

        System.out.println("\n--- LIVRO ---");
        System.out.println("Título: " + lv.getTitulo());
        System.out.println("Disponível: " + lv.ViewStatusBook());

        System.out.println("\n--- PERIÓDICO ---");
        System.out.println("Título: " + pr.getTitulo());
        System.out.println("Volume: " + pr.getVolume());

        int escolha;

        do {
            System.out.println("\nO que deseja fazer?");
            System.out.println("0 - Sair");
            System.out.println("1 - Emprestar livro");
            System.out.println("2 - Devolver livro");
            System.out.println("3 - Status do livro");
            System.out.print("Escolha: ");
            escolha = sc.nextInt();

            switch (escolha){
                case 0:
                    System.out.println();


            }

        }


        sc.close();


    }
}
