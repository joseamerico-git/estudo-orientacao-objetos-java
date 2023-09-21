package praticando.entrevistaresolvida.apps;

public class FacebookMesseger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
      verificarSaldo();
    validarConectadoInternet();   
    
    System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
       System.out.println("Recebendo mensagem pelo Facebook");
    }

    @Override
    protected void salvarHistoricoMensagem() {
       System.out.println("SALVANDO AS MENSAGENS NO SERVIDOR DO FACEBOOK");
    }

   
    
}
