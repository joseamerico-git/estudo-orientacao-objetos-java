package com.lanchonete.model;

import com.lanchonete.area.cliente.Cliente;
import com.lanchonete.atendimento.Atendente;
import com.lanchonete.atendimento.cozinha.Almoxarife;
import com.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {

    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        // ações que não precisam estar disponíveis para toda a aplicação

        // tornamos private cozinheiro.prepararLanche(), lavaIngredientes() etc...;

        // ações que o estabelecimento precisa ter ciência
        cozinheiro.adicionarComboNoBalcao();
        
        //Como o almoxarife está sendo usado somente no pacote em que está enserido
        // perde o sentido instancia-lo aqui nesse pacote
        //Almoxarife almoxarife = new Almoxarife();

        // Ações que não precisam estar disponíveis para toda a aplicação
        //almoxarife.controlaEntrada();
        //almoxarife.controlaSaida();

        Cliente cliente = new Cliente();
        
        cliente.fazerPedido();

        // Não deveria, mas o estabelecimento ainda não definiu normas de atendimento

        cliente.pegarPedidoBalcao();

        
        Atendente atendente = new Atendente();

        // Imagine o cliente ouvindo que o gás acabou?
        //cozinheiro.pedirAlmoxarifeTrocarGas(almoxarife);
        // Será que no estabelecimento eu preciso saber que o atendente está servindo a mesa?
        // Eentão esse método pode ser alterado para default ou private(privado)
        
        atendente.servidoMesa();
        
        //atendente.pegandoPedidoBalcao();
        atendente.receberPagamento();

    }

}
