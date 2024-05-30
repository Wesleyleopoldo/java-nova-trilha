package apps;

public class Telegram extends ServicoMensagemInstantenea{
    
    @Override
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando Mensagem pelo Telegram...");
        salvarNoHistorico();
    }
    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo Telegram...");
    }
}
