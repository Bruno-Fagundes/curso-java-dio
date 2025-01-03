package dio.bruno.desafios;

import java.util.Locale;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double numero1, numero2, media;

        System.out.println("Digite o valor do primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.println("Digite o valor do segundo número: ");
        numero2 = scanner.nextDouble();

        media = (numero1 *  3.5 + numero2 * 7.5) / 11;

        System.out.printf("MEDIA = %.2f", media);
        System.out.println();
    }
}
