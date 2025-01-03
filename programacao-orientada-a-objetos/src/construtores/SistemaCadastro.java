package construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        // Criando uma pessoa no sistema
        Pessoa pessoa = new Pessoa("Bruno", "123");

        // Definindo o endereco da pessoa
        pessoa.setEndereco("Rua Das Marias");

        System.out.println(pessoa.getNome() + " - " + pessoa.getCpf() + " - " + pessoa.getEndereco());
    }
}
