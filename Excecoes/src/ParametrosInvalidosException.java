/**
 * 
 * Essa é a classe da minha exceção personalizada como podemos ver ela possui um construtor especifico que aceita uma mensagem
 * 
 * @author Wesley Leopoldo
 * @version 1.0
 * @since 26/05/2024
 * mensagem que serve para receber uma mesagem especifica na nossa aplicação...
 * 
 */

 //
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem){
        super(mensagem);
    }
}
