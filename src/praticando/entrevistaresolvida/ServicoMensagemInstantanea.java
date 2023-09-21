package praticando.entrevistaresolvida;

public class ServicoMensagemInstantanea {
    
  public void enviarMensagem(){
    validarConectadoInternet();
    System.out.println("Enviando mensagem...");
  }

private void validarConectadoInternet() {
    System.out.println("Verificando conexão");
}
public void receberMensagem(){
    System.out.println("Recebendo mensagem ");
}

}
