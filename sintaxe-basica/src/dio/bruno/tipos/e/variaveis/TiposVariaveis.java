package dio.bruno.tipos.e.variaveis;

import java.util.Scanner; // Importa a classe Scanner

public class TiposVariaveis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada

        System.out.print("Digite um numero: ");
        int numero1 = scanner.nextInt(); // Lê um número inteiro

        System.out.print("Digite outro numero: ");
        int numero2 = scanner.nextInt(); // Lê outro número inteiro

        Somar(numero1, numero2); // Chama o método Somar
        scanner.close(); // Fecha o scanner para evitar vazamentos de recursos
    }

    static void Somar(int a, int b) {
        System.out.print("Resultado: " + (a + b)); // Imprime a soma dos dois números
    }
}
