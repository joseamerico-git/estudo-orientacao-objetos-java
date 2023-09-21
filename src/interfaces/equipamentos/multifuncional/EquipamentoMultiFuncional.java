package interfaces.equipamentos.multifuncional;

import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.digitalizadora.Digitalizadora;
import interfaces.equipamentos.impressora.Impressora;

/*  Precisa implementar as funcionalidades de impressora copiadora e
    digitalizadora. Precisamos tornar as classes que antes eram normais como a
    classe Copiadora para Interface
*/
public class EquipamentoMultiFuncional implements Copiadora, Impressora, Digitalizadora {

    @Override
    public void digitalizar() {
       System.out.println("MULTIFUNCIONAL DIGITALIZANDO");
    }

    @Override
    public void imprimir() {
         System.out.println("MULTIFUNCIONAL IMPRIMINDO");
    }

    @Override
    public void copiar() {
        System.out.println("MULTIFUNCIONAL COPIANDO");
    }

}
