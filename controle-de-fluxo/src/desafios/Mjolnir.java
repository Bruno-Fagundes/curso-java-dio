package desafios;

import java.util.Scanner;

public class Mjolnir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int forcaNewtons, casosDeTeste;
        String nome;

        casosDeTeste = scanner.nextInt();

        for (int i = 0; i < casosDeTeste; i++) {
            nome = scanner.next();
            forcaNewtons = scanner.nextInt();
            if (nome.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
