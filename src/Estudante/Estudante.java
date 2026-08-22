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
}
