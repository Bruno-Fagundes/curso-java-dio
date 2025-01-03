package dio.bruno.desafios;

import  java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, soma;

        System.out.println("Digite o valor do primeiro número: ");
        numero1 = scanner.nextInt();

        System.out.println("Digite o valor do segundo número: ");
        numero2 = scanner.nextInt();

        soma = numero1 + numero2;

        System.out.println("SOMA = " + soma);
    }

}
