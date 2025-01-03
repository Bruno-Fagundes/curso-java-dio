package pilares.da.poo.interfasse.equipamentos.estabelecimento;

import pilares.da.poo.interfasse.equipamentos.copiadora.Copiadora;
import pilares.da.poo.interfasse.equipamentos.digitalizadora.Digitalizadora;
import pilares.da.poo.interfasse.equipamentos.impressora.Deskjet;
import pilares.da.poo.interfasse.equipamentos.impressora.Impressora;
import pilares.da.poo.interfasse.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
