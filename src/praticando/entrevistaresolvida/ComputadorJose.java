package praticando.entrevistaresolvida;

import java.util.Locale;
import java.util.Scanner;

import praticando.entrevistaresolvida.apps.FacebookMesseger;
import praticando.entrevistaresolvida.apps.MsnMesseger;
import praticando.entrevistaresolvida.apps.ServicoMensagemInstantanea;
import praticando.entrevistaresolvida.apps.TelegranMesseger;

public class ComputadorJose {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Selecione o aplicativo: \n 1 - fbmsn \n 2 - msn \n 3 - Telegram \n 4 - sair");
       
        int op = scanner.nextInt();

        if (op == 1) {
            smi = new FacebookMesseger();
            //smi.enviarMensagem();
        } else if (op == 2) {
            smi = new MsnMesseger();
           // smi.enviarMensagem();
        } else if (op == 3) {
            smi = new TelegranMesseger();
            //smi.enviarMensagem();
        } else if (op == 4) {
            return;
        } else {
            System.out.println("Opção inválida!");
        
        }

        smi.enviarMensagem();
        
        
        //smi.validarConectadoInternet();

    }
}
