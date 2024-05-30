package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMutifuncional implements Impressora, Digitalizadora, Copiadora{
    
    public void imprimir(){
        System.out.println("IMPRIMINDO POR MULTIFUNCIONAL...");
    }
    public void digitalizar(){
        System.out.println("DIGITALIZANDO POR MULTIFUNCIONAL...");
    }
    public void copiar(){
        System.out.println("COPIANDO POR MULTIFUNCIONAL...");
    }
}
