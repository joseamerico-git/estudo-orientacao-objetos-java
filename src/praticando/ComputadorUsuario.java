package praticando;

public class ComputadorUsuario {
    public static void main(String[] args) {
        MSNMesseger msn = new MSNMesseger();
        msn.enviarMensagem();

        // msn.validarConectadoInternet(); --> eliminando as partes incovenientes
        // aplicando o conceito de encapsulamento
        // msn.salvarHistoricoMensagem();
    }
}
