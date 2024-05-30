package apps;


public abstract class ServicoMensagemInstantenea {
    
    public abstract void enviarMensagem();
	
    public abstract void receberMensagem();

    protected void salvarNoHistorico(){
        System.out.println("Salvando mensagem no Historico");
    }

    protected void validarConexao() {
        System.out.println("Testando conexão");
    }
}