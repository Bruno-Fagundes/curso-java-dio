package escola;

public class Aluno {
    private String nome;
    private int idade;

    public String getNome() {
        return  nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void soma(int numero1, int numero2) {
        System.out.println("Resultado: " + somaDeValores(numero1, numero2));
    }

    private int somaDeValores(int a, int b) {
        return (a+b);
    }
}
