package Biblioteca;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do livro: ");
        String ttLivro = teclado.nextLine();

        Livro lv = new Livro(ttLivro);




    }
}
