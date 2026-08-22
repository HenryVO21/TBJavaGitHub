package Lampadas.Lampada3;

public class Teste {

    public static void main(String[] args) {

        // Cria uma lâmpada com 100W
        Lampada l1 = new Lampada(100);

        // Mostra o estado inicial
        l1.mostrarEstado();

        // Liga/desliga a lâmpada
        l1.interruptor();
        l1.mostrarEstado();

        // Mostra a potência atual
        l1.mostrarPotencia();

        // Testa valores de potência
        l1.setWatts(500);   // válido
        l1.setWatts(2000);  // inválido

        // Mostra valor final
        System.out.println("Potência atual: " + l1.getWatts() + "W");
    }
}
