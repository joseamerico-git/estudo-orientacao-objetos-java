package praticando.entrevistaresolvida.apps;

public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected abstract void salvarHistoricoMensagem();

    protected void verificarSaldo() {
      
        System.out.println("Verificando saldo");
    }

    protected void validarConectadoInternet() {
        System.out.println("Validando a conexão ");
    }

}
