package dio.bruno.operadores;

public class Operadores {

    public static void main(String[] args) {
        String nomeUm = "Bruno";
        String nomeDois = "Bruno";

        System.out.println(nomeUm == nomeDois); // true

        int a = 5, b = 6;

        boolean simOuNao = a == b;

        if (a < b) { // true
            System.out.println("A nossa condicao e verdadeira");
        }

        System.out.println("A e igual a b? " + simOuNao); // false

        simOuNao = a != b;
        System.out.println("A e diferente a b? " + simOuNao); // true

        simOuNao = a > b;
        System.out.println("A e maior que b? " + simOuNao); // false

    }
}
