import java.util.Random;
import java.util.Scanner;

public class Lotofacil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    apostar0a100();
                    break;
                case 2:
                    apostarAaZ();
                    break;
                case 3:
                    apostarParOuImpar();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("**************************");
        System.out.println("Menu LOTOFÁCIL:");
        System.out.println("1) Apostar de 0 a 100");
        System.out.println("2) Apostar de A à Z");
        System.out.println("3) Apostar em par ou ímpar");
        System.out.println("0) Sair");
        System.out.println("**************************");
    }

    public static void apostar0a100() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Aposte um número de 0 a 100:");
        int numeroApostado = scanner.nextInt();

        if (numeroApostado < 0 || numeroApostado > 100) {
            System.out.println("Aposta inválida.");
            return;
        }

        int numeroSorteado = random.nextInt(101);

        if (numeroApostado == numeroSorteado) {
            System.out.println("Você ganhou R$ 1.000,00 reais.");
        } else {
            System.out.println("Que pena! O número sorteado foi: " + numeroSorteado);
        }
    }

    public static void apostarAaZ() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aposte uma letra de A a Z:");
        char letraApostada = scanner.next().toUpperCase().charAt(0);

        if (!Character.isLetter(letraApostada)) {
            System.out.println("Aposta inválida.");
            return;
        }

        char letraPremiada = 'J'; // Letra premiada escolhida aleatoriamente

        if (letraApostada == letraPremiada) {
            System.out.println("Você ganhou R$ 500,00 reais.");
        } else {
            System.out.println("Que pena! A letra sorteada foi: " + letraPremiada);
        }
    }

    public static void apostarParOuImpar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aposte um número inteiro:");
        int numeroApostado = scanner.nextInt();

        if (numeroApostado % 2 == 0) {
            System.out.println("Você ganhou R$ 100,00 reais.");
        } else {
            System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
        }
    }
}
