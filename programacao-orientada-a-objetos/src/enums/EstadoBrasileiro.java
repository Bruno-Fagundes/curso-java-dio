package enums;

// Criando o enum EstadoBrasileiro
public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo", 11),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro", 12),
    PIAUI("PI", "Piauí", 13),
    MARANHAO("MA", "Maranhão", 14),
    CEARA("CE", "Ceará", 15);

    private final String nome;
    private final String sigla;
    private final int ibge;

    EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
