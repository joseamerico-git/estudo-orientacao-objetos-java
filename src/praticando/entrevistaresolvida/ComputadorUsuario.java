package praticando.entrevistaresolvida;

public class ComputadorUsuario {
    public static void main(String[] args) {
        System.out.println("MSN");
        MsnMesseger msn = new MsnMesseger();
        msn.enviarMensagem();
        msn.receberMensagem();
        System.out.println("FACEBOOK");
        FacebookMesseger fbMsn = new FacebookMesseger();
        fbMsn.enviarMensagem();
        fbMsn.receberMensagem();
        System.out.println("TELEGRAM");
        TelegranMesseger tlMsn = new TelegranMesseger();
        tlMsn.enviarMensagem();
        tlMsn.receberMensagem();

    }
}
