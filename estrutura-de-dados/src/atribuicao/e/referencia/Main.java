package atribuicao.e.referencia;

public class Main {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA; // Atribuicao de tipo primitivo

        System.out.print("intA: " + intA + "\nintB: " + intB);
        intA = 2;
        System.out.print("\nintA: " + intA + "\nintB: " + intB);

        MeuObjeto objetoA = new MeuObjeto(1);
        MeuObjeto objetoB = objetoA; // Atribuicao de objeto

        System.out.print("\n\nobjetoA: " + objetoA + "\nobjetoB: " + objetoB);
        objetoA.setNumero(2);
        System.out.print("\nobjetoA: " + objetoA + "\nobjetoB: " + objetoB);
    }
}