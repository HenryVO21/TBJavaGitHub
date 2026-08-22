package Lampadas.Lampada3;

public class Lampada {

    // Variável que armazena a potência da lâmpada em watts
    private int watts;

    // Variável que indica se a lâmpada está ligada (true) ou desligada (false)
    public boolean botao;

    // Construtor que recebe o estado inicial da lâmpada (ligada ou desligada)
    public Lampada(boolean inicial){
        this.botao = inicial;
        this.watts = 60; // valor padrão inicial
    }

    // Construtor que recebe a potência da lâmpada
    public Lampada(int watts){
        this.watts = watts;
        this.botao = false; // por padrão inicia desligada
    }

    // Construtor padrão: define 60W e lâmpada desligada
    public Lampada(){
        this.watts = 60;
        this.botao = false;
    }

    // Metodo que alterna o estado da lâmpada (liga/desliga)
    public void interruptor(){
        if(botao){
            botao = false;
        } else {
            botao = true;
        }
    }

    // Metodo que exibe se a lâmpada está acesa ou apagada
    public void mostrarEstado(){
        if(botao){
            System.out.println("A luz está acesa!");
        } else {
            System.out.println("A luz está apagada!");
        }
    }

    // Metodo que exibe a potência da lâmpada
    public void mostrarPotencia(){
        System.out.println("A potencia da lampada é: " + watts + "W");
    }

    // Metodo GET: retorna o valor da potência da lâmpada
    public int getWatts(){
        return watts;
    }

    // Metodo SET: altera a potência garantindo que esteja entre 1 e 1000
    public void setWatts(int watts){
        if(watts >= 1 && watts <= 1000){
            this.watts = watts;
            System.out.println("Valor válido!");
        } else {
            System.out.println("Valor inválido! A potência deve estar entre 1 e 1000.");
        }
    }
}
