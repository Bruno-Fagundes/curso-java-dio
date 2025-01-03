package escola;

import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do Aluno:");
        aluno.setIdade(scanner.nextInt());

        scanner.nextLine();

        System.out.println("Digite o nome do Aluno:");
        aluno.setNome(scanner.nextLine());

        //aluno.setIdade(22);
        //aluno.setNome("Bruno");

        System.out.println("O aluno " + aluno.getNome() + " tem " + aluno.getIdade() + " ano(s).");

        aluno.soma(1,2);
    }
}
