package Biblioteca;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o nome do livro: ");
        String ttLivro = sc.nextLine();

        Livro lv = new Livro(ttLivro, true);

        System.out.print("Digite o nome do Periódico");
        String ttPeriodico = sc.nextLine();

        System.out.print("Digite o nome do Periódico");
        int volume = sc.nextInt();

        Periodico pr = new Periodico(ttPeriodico,volume);

        System.out.println("\n--- LIVRO ---");
        System.out.println("Título: " + lv.getTitulo());
        System.out.println("Disponível: " + lv.ViewStatusBook());

        System.out.println("\n--- PERIÓDICO ---");
        System.out.println("Título: " + pr.getTitulo());
        System.out.println("Volume: " + pr.getVolume());

        lv.Empretimo();


    }
}
