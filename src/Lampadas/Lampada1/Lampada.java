package Lampadas.Lampada1;

public class Lampada {

    // Variável que armazena o estado da lâmpada (true = acesa, false = apagada)
    public boolean botao;

    // Construtor que obriga definir o estado inicial da lâmpada ao criar o objeto
    Lampada(boolean inicial){
        botao = inicial;
    }

    // Metodo que alterna o estado da lâmpada (liga/desliga)
    public void interruptor(){
        if(botao){
            botao = false;
        } else {
            botao = true;
        }
    }

    // Metodo que exibe no console se a lâmpada está acesa ou apagada
    public void mostrar(){
        if(botao){
            System.out.println("A luz está acesa!");
        } else {
            System.out.println("A luz está apagada!");
        }
    }
}
