package tratamento.de.excecao;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23.765-064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
           System.out.println("O CEP nao corresponde com as regras de negocio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
            // Simulando um cep formatado
            return "23.765-064";
    }
}
