package Estudante;

import java.util.Scanner;

public class Estudante {

    private String nome;
    private double[] notas;

    public Estudante(String nome, double notas){
        this.nome = nome;
        this.notas = new double[5];
    }

    public void InsereNotas(){
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 5; i ++){
            System.out.println("Digite a "+ (i+1) +"nota do aluno: ");
            notas[i] = teclado.nextDouble();
        }
    }


}
