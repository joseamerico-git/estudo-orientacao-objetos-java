package com.lanchonete.atendimento.cozinha;

public class Almoxarife {

    private void controlaEntrada(){
        System.out.println("CONTROLANDO ENTRADA DOS ITENS ");
    }

     private void controlaSaida(){
        System.out.println("CONTROLANDO SAÍDA DOS ITENS ");
    }

     void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTES");
        //...? com as alterações de alguns métodos para private Controlar entrada e saída 
        //controlar entrada e saída aqui dentro da classe seria o ideal
        //como o método é ControlaAida()  não é público e sim defautl ele estará visível somente na própria classe.
        controlaSaida();

    }

     void trocarGas(){
        System.out.println("ALMOXARIFE TROCANDO O GÁS");
    }
    
}
