package usuario;
/*
 * Simulação do uso da classe MSNMessenger
 */
import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantenea;
import apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
        ServicoMensagemInstantenea smi = null;

        String appEscolhido = "tlg";

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }
        else if(appEscolhido.equals("fcb")){
            smi = new FacebookMessenger();
        }
        else if(appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }
    
        smi.enviarMensagem();
        smi.receberMensagem();

	}
}