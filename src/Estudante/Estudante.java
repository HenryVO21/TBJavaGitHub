package Estudante;

import java.util.Scanner;

public class Estudante {

    private String nomeAluno;
    private double[] notas;

    public Estudante(String nomeAluno, double notas){
        this.nomeAluno = nomeAluno;
        this.notas = new double[5];
    }

    public void InsereNotas(){
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 5; i ++){
            System.out.println("Digite a "+ (i+1) +"nota do aluno: ");
            notas[i] = teclado.nextDouble();
            if (notas[i] < 0){
                System.out.println("\nValor invalido...");
                while (notas[i]<0){
                    System.out.println("\nDigite novamente:");
                    notas[i] = teclado.nextDouble();
                }
            }
        }
    }
    public double CalculaMedia(){
        double somaNota = 0;
        for (int i = 0 ; i < 5 ; i++){
            somaNota += notas[i];
        }
        return somaNota/5;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public double[] getNotas() {
        return notas;
    }

    public double MenorNota(){
        double menorNota = 0;
        for (int i =0; i < 5; i++){
            if (i == 0) {
                menorNota = notas[i];
            } else {
                if (menorNota < notas[i]) {
                    menorNota = notas[i];
                }
            }
        }
        return menorNota;
    }

    public static Estudante[] Aprovodos(Estudante[] estudantes){
        int quantidadeAprovados = 0;

        for(int i = 0 ; i < estudantes.length; i++){
            if( estudantes[i].CalculaMedia() < 6){
                quantidadeAprovados++;
            }
        }
        if(quantidadeAprovados==0){
            return null;
        }
        int posicao = 0;
        Estudante[] alunosAprovados = new Estudante[quantidadeAprovados];

        for (int i = 0 ; i < estudantes.length; i++){
            if (estudantes[i].CalculaMedia() > 6){
                alunosAprovados[posicao] = estudantes[i];
                posicao ++;
            }
        }
        return alunosAprovados;
    }
    public double CalculaMedia(int peso){
        double somaNota = 0;
        int quantidadeProvas = 0;
        for (int i = 0 ; i < 5 ; i++){
            somaNota += notas[i];
        }
        return somaNota/5;
    }
}
