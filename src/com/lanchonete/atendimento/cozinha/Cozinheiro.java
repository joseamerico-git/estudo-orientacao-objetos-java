package com.lanchonete.atendimento.cozinha;

import com.lanchonete.atendimento.Atendente;

public class Cozinheiro{
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NO BALCÃO");
    }

      public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }

    private void preparaVitamina(){
        System.out.println("PREPARANDO VITAMINA");
    }

    /*
    Alterando default essa função deixa de existir 
    public void pedirAtendenteTrocarGas(Atendente meuAmigo){
            meuAmigo.trocarGas();
    }

     */

    private void pedirAlmoxarifeTrocarGas(Almoxarife almoxarife){
          almoxarife.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
    public void fritarIngredientes(){
        System.out.println("FRITANDO INGREDIENTES");
    }

}