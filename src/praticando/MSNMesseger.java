package praticando;

public class MSNMesseger {

    public void enviarMensagem() {
        if (verificandoSaldo()) {
            System.out.println("ENVIANDO MENSAGEM");
            salvarHistoricoMensagem();

        } else {
            System.out.println("SALDO INSUFICIENTE PARA ENVIAR MENSAGENS RECARREGUE SEUS CRÉDITOS!");
        }
    }

    public void receberMensagem() {
        System.out.println("RECEBENDO MENSAGEM");
    }

    private void validarConectadoInternet() {
        System.out.println("VALIDANDO A CONEXÃO");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("SALVANDO MENSAGENS NO HISTÓRICO");
    }

    boolean verificandoSaldo() {
        System.out.println("VERIFICANDO O SALDO ");
        return true;
    }

}
