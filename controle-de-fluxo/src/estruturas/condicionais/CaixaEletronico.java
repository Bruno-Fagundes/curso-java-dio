package estruturas.condicionais;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 400;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo Insuficiente!");
        }
        System.out.println(saldo);
    }
}
