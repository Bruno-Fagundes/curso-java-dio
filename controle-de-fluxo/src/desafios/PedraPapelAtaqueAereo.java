package desafios;

import java.util.Scanner;

public class PedraPapelAtaqueAereo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String jogador1, jogador2;

        for (int i = 0; i < N; i++) {
            jogador1 = scanner.next();
            jogador2 = scanner.next();

            // Verifica casos de empate
            if (jogador1.equalsIgnoreCase(jogador2)) {
                if (jogador1.equalsIgnoreCase("ataque")) {
                    System.out.println("Aniquilacao mutua");
                } else if (jogador1.equalsIgnoreCase("papel")) {
                    System.out.println("Ambos venceram");
                } else if (jogador1.equalsIgnoreCase("pedra")) {
                    System.out.println("Sem ganhador");
                }
            }
            // Verifica casos em que ataque está presente (ataque ganha de tudo)
            else if (jogador1.equalsIgnoreCase("ataque")) {
                System.out.println("Jogador 1 venceu");
            }
            else if (jogador2.equalsIgnoreCase("ataque")) {
                System.out.println("Jogador 2 venceu");
            }
            // Verifica casos entre pedra e papel (pedra ganha do papel)
            else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("papel")) {
                System.out.println("Jogador 1 venceu");
            }
            else if (jogador2.equalsIgnoreCase("pedra") && jogador1.equalsIgnoreCase("papel")) {
                System.out.println("Jogador 2 venceu");
            }
        }
    }
}