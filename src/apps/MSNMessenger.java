package apps;

public class MSNMessenger extends ServicoMensagemInstantenea {
    @Override
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando Mensagem via MSN...");
        salvarNoHistorico();
    }
    @Override
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem via MSN...");
    }
}