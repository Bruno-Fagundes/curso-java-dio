package pilha;

public class Pilha {
    private No referenciaNoEntradaPilha;

    public Pilha() {
        this.referenciaNoEntradaPilha = null;
    }

    public void push(No novoNo) {
        No referenciaAuxiliar = referenciaNoEntradaPilha;
        referenciaNoEntradaPilha = novoNo;
        referenciaNoEntradaPilha.setReferenciaNo(referenciaAuxiliar);
    }

    public No pop() {
        if(!this.isEmpty()) {
            No noPopped = referenciaNoEntradaPilha;
            referenciaNoEntradaPilha = referenciaNoEntradaPilha.getReferenciaNo();
            return noPopped;
        }
        return null;
    }

    public No top() {
        return  referenciaNoEntradaPilha;
    }

    public boolean isEmpty() {
    //    if(referenciaNoEntradaPilha == null) {
    //        return true;
    //    }
    //    return false;

        return referenciaNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "--------------\n";
        stringRetorno += "    Pilha\n";
        stringRetorno += "--------------\n";

        No noAuxiliar =  referenciaNoEntradaPilha;

        while(true) {
            if(noAuxiliar != null) {
                stringRetorno += "[No{dados=" + noAuxiliar.getDados() + "}]\n";
                noAuxiliar = noAuxiliar.getReferenciaNo();
            } else {
                break;
            }
        }
        stringRetorno += "===============\n";
        return stringRetorno;
    }
}
