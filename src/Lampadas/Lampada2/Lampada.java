package Lampadas.Lampada2;

public class Lampada {

    // Variável que armazena a potência da lâmpada em watts
    public int watts;

    // Construtor que recebe a potência da lâmpada como parâmetro
    public Lampada(int watts){
        this.watts = watts;
    }

    // Construtor padrão (sem parâmetros), define a potência como 60W por padrão
    public Lampada(){
        this.watts = 60;
    }

    // Metodo que exibe a potência da lâmpada no console
    public void mostrar(){
        System.out.println("A potencia da lampada é: " + watts + "W");
    }
}
