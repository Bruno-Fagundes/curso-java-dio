package pilha;

public class No {
    private int dados;
    private No referenciaNo = null;

    public No() {
    }

    public No(int dados) {
        this.dados = dados;
    }

    public int getDados() {
        return dados;
    }

    public void setDados(int dados) {
        this.dados = dados;
    }

    public No getReferenciaNo() {
        return referenciaNo;
    }

    public void setReferenciaNo(No referenciaNo) {
        this.referenciaNo = referenciaNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dados=" + dados +
                '}';
    }
}
