import java.util.Random;
import java.util.Scanner;

public class MontyHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int portaPremiada = random.nextInt(3) + 1;
        int portaVazia;
        int portaEscolhida;

        System.out.println("Bem-vindo ao jogo Monty Hall!");
        System.out.println("Escolha uma porta (1, 2 ou 3):");
        portaEscolhida = scanner.nextInt();

        portaVazia = encontrarPortaVazia(portaPremiada, portaEscolhida);

        System.out.println("A porta " + portaVazia + " está vazia.");
        System.out.println("Você gostaria de trocar de porta? (s/n)");
        String opcaoTroca = scanner.next();

        if (opcaoTroca.equals("s")) {
            portaEscolhida = trocarPorta(portaEscolhida, portaVazia);
        }

        if (portaEscolhida == portaPremiada) {
            System.out.println("Parabéns! Você ganhou o prêmio!");
        } else {
            System.out.println("Que pena! Você não ganhou o prêmio.");
        }
    }

    public static int encontrarPortaVazia(int portaPremiada, int portaEscolhida) {
        Random random = new Random();
        int portaVazia;
        do {
            portaVazia = random.nextInt(3) + 1;
        } while (portaVazia == portaPremiada || portaVazia == portaEscolhida);
        return portaVazia;
    }

    public static int trocarPorta(int portaEscolhida, int portaVazia) {
        int novaPorta;
        do {
            novaPorta = new Random().nextInt(3) + 1;
        } while (novaPorta == portaEscolhida || novaPorta == portaVazia);
        return novaPorta;
    }
}
