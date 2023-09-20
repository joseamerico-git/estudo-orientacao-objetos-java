package com.lanchonete.atendimento;

public class Atendente {
     
    void trocarGas(){
        System.out.println("ATENDENTE TROCANDO O GÁS PARA MEU AMIGO");
    }

    public void servidoMesa(){
        pegandoPedidoBalcao();
        System.out.println("ATENDENTE SERVINDO A MESA");
    }
    // Poderia ser removido, pois a expecificação não permitia
    private void pegandoPedidoBalcao(){
        System.out.println("ATENDENTE PEGANDO O PEDIDO NO BALCÃO");
    }
    
    public void receberPagamento(){
        System.out.println("ATENDENTE RECEBENDO PAGAMENTO");
    }


}
