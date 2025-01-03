package estruturas.de.repeticao;
import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando..." );
        do {
            // Executando repetidas vezes ate alguem atender
            System.out.println("Telefone tocando");
        }while (tocarTelefone());
        System.out.println("Alo!!!");
    }
    private static boolean tocarTelefone() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;
    }
}
