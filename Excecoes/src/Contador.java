/**
 * <h1>código co projeto contador</h1>
 * <p>Por favor professor não me traumatize mais desse jeito kkkk
 * nesse codigo importei a classe @java.util.Scanner para receber os inputs do Usúario
 * e criei o bloco try-catch e abaixo coloquei as mensagens personalizadas.
 * 
 * Estudei muito e vi essa forma de fazer com que ao lançar a exceção no metodo colocar a mensagem diretamente lá com um construtor especifico
 * confesso que tive uma ajudinha do meu amigo chatGPT para entender um pouco melhor isso porem sem copia e cola.
 * Porque eu sei que poderia ter colocado da maneira ensinada como:
 * 
 * <code>public class ParametrosInvalidosException extends Excepition{
 * 
 * }
 * 
 * sem construtor especifico mas já que aprendi essa forma também vamos usala né?
 * 
 * estava com algumas dificuldades porém consegui tirar de letra
 * 
 * @author Wesley Leopoldo
 * @version 1.0
 * @since 26/05/2024
 * 
 */


import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
         try{   
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = scanner.nextInt();
            
            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = scanner.nextInt();
      
            contar(parametroUm, parametroDois);
         }catch(ParametrosInvalidosException e){
            System.out.println("Erro capturado: " + e.getMessage());
         }

    }

    /**
     * <p>Aí está nosso metodo contar confesso que ainda tenho muita dificuldade com o laço for até mesmo de como aplica-lo,
     * mas estou comaçando a me familiarizar melhor com ele.</p>
     * @param parametroUm
     * @param parametroDois
     * @throws ParametrosInvalidosException
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois)
            throw new ParametrosInvalidosException("O segundo parâmetro tem que ser maior que o primeiro!!!");
        int contagem = parametroDois - parametroUm;
        for(int x = 1;x <= contagem; x ++){
            System.out.print(x + " ");
        }
    }
}
