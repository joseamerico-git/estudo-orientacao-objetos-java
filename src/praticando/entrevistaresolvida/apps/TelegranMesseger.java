package praticando.entrevistaresolvida.apps;

public class TelegranMesseger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        verificarSaldo();
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }

    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("SALVANDO HISTÓRICO NO SERVIDOR DO TELEGRAM");
    }
    
}
