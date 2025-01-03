import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String numeroAgencia, nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.of("pt", "BR"));

        System.out.println("Digite o número da conta do banco: ");
        numero = scanner.nextInt();

        scanner.nextLine(); // Se não usar isso ele pula uma linha

        System.out.println("Digite o número da agência: ");
        numeroAgencia = scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o valor do seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +  ", obrigado por criar uma conta em nosso banco" +
        " sua agência é " + numeroAgencia + ", conta " + numero + " e seu saldo R$"
        + saldo + " já está disponível para saque");
    }
}
