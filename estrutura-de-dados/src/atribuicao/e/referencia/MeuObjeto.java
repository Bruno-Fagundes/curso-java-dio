package atribuicao.e.referencia;

public class MeuObjeto {

    Integer numero;

    public MeuObjeto(Integer numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return this.numero.toString();
    }
}












