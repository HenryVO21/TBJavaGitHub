package Estudante;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int quantidade = teclado.nextInt();
        teclado.nextLine();

        Estudante[] estudantes = new Estudante[quantidade];

        for (int i = 0; i < estudantes.length; i++) {

            System.out.println("\n--- ALUNO " + (i + 1) + " ---");

            System.out.print("Digite o nome do aluno: ");
            String nome = teclado.nextLine();

            estudantes[i] = new Estudante(nome);

            estudantes[i].InsereNotas();

            System.out.println("\nComo deseja calcular a média?");
            System.out.println("1 - Média normal");
            System.out.println("2 - Média ponderada");
            System.out.print("Escolha: ");

            int escolha = teclado.nextInt();

            switch (escolha) {

                case 1:
                    System.out.println("Média: " + estudantes[i].CalculaMedia());
                    break;

                case 2:
                    int[] pesos = new int[5];

                    System.out.println("\n--- PESOS ---");

                    for (int j = 0; j < 5; j++) {
                        System.out.print("Digite o peso da " + (j + 1) + "ª nota: ");
                        pesos[j] = teclado.nextInt();
                    }

                    System.out.println("Média ponderada: "
                            + estudantes[i].CalculaMedia(pesos));
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println("\nNome: " + estudantes[i].getNomeAluno());
            System.out.println("Média: " + estudantes[i].CalculaMedia());
            System.out.println("Menor nota: " + estudantes[i].MenorNota());
        }

        Estudante[] aprovados = Estudante.Aprovados(estudantes);

        System.out.println("\n--- ALUNOS APROVADOS ---");

        if (aprovados == null) {
            System.out.println("Nenhum aluno aprovado.");
        } else {
            for (int i = 0; i < aprovados.length; i++) {
                System.out.println(
                        aprovados[i].getNomeAluno() +
                                " - Média: " +
                                aprovados[i].CalculaMedia()
                );
            }
        }

        teclado.close();
    }
}