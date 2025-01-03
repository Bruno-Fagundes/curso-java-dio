package pilares.da.poo.interfasse.equipamentos.multifuncional;

import pilares.da.poo.interfasse.equipamentos.copiadora.Copiadora;
import pilares.da.poo.interfasse.equipamentos.digitalizadora.Digitalizadora;
import pilares.da.poo.interfasse.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar() {
        System.out.println("Copiando via Equipamento Multifuncional");
    }
    public void digitalizar() {
        System.out.println("Digitalizando via Equipamento Multifuncional");
    }
    public void imprimir() {
        System.out.println("Imprimindo via Equipamento Multifuncional");
    }
}
