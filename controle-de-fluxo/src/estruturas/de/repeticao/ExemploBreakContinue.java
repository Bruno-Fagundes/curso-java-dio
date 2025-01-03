package estruturas.de.repeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                continue; // Muda o fluxo dessa iteracao nao para a aplicacao nem o for
            }
            System.out.println(numero);
        }
    }
}
