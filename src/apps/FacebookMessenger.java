package apps;

public class FacebookMessenger extends ServicoMensagemInstantenea{
    @Override
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando Mensagem via Facebook...");
        salvarNoHistorico();
    }
    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem via Facebook");
    }
}
