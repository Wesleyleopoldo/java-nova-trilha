package estabelecimento;

import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMutifuncional;

public class Fabrica {
    public static void main(String [] args){
        EquipamentoMutifuncional emf = new EquipamentoMutifuncional();
        Impressora impressora = new DeskJet();
        EquipamentoMutifuncional digital = new EquipamentoMutifuncional();
        Scanner scanner = new Scanner();

        impressora.imprimir();

        emf.copiar();

        scanner.digitalizar();
    }
}