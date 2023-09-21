package interfaces.estabelecimento;

import interfaces.equipamentos.impressora.DeskJet;
import interfaces.equipamentos.impressora.Impressora;
import interfaces.equipamentos.impressora.LaserJet;
import interfaces.equipamentos.multifuncional.EquipamentoMultiFuncional;

/*
Dilema o equipamento multifuncional precisa ter todas as características de imprimir, copiar e digitalizar.
Depois de converter tudo para interface e alterar conforme o conceito de interfaces.
A nossa classe Fabrica tem que criar objetos que possa ter as ações correspondentes

*/
public class Fabrica {
    public static void main(String[] args) {
        // A impressora selecinada 
        Impressora impressora = new EquipamentoMultiFuncional();
        impressora.imprimir();

    }
}
