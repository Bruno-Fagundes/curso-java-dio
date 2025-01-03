package enums;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro estadoBrasileiro: EstadoBrasileiro.values()) {
            System.out.println(estadoBrasileiro.getSigla() + " - " + estadoBrasileiro.getNome());
        }

        EstadoBrasileiro estadoBrasileiro = EstadoBrasileiro.CEARA;

        System.out.println(estadoBrasileiro.getNome());
        System.out.println(estadoBrasileiro.getSigla());
        System.out.println(estadoBrasileiro.getNomeMaiusculo());
        System.out.println(estadoBrasileiro.getIbge());
    }
}
