package listas.encadeadas;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("Teste 1, Indice 0");
        minhaListaEncadeada.add("Teste 2, Indice 1");
        minhaListaEncadeada.add("Teste 3, Indice 2");
        minhaListaEncadeada.add("Teste 4, Indice 3");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));

        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.remove(3));
        System.out.println(minhaListaEncadeada);
    }
}
