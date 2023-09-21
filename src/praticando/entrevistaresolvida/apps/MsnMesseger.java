package praticando.entrevistaresolvida.apps;

public class MsnMesseger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        verificarSaldo();
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Messenger");   
    }

    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("SALVANDO MENSAGENS NO SERVIDOR DO MESSEGER");    
    }
    
}
