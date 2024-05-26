/**
 * <h1>Desafio de Código Simulação bancária</h1>
 * @author Wesley Leopoldo
 * @version 1.0
 * @since 26/05/2024
 * 
 * <p> Querido colega desenvolvedor peço que leia com atenção cada instrução da documentação do código para uma melhor experiência
 * tanto sua como do nossos queridos usúarios.
 * 
 * importando classe Scanner
 */
import java.util.Scanner;

/**
 * Está é a classe principal do banco...
 * @see SimulacaoBancaria
 */
public class SimulacaoBancaria {
    // Nesse trecho vemos as váriaveis, como a continuar que é para o loop
    //*saldo é a váriavel do saldo em conta
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0;
        boolean continuar = true;

        while(continuar){
            System.out.print("Digite a ação desejada: ");
            int opcao = scanner.nextInt();

            switch(opcao){

                case 1:{
                    System.out.print("Digite o valor para deposito: ");
                    double deposito = scanner.nextDouble();
                    saldo = depositar(saldo, deposito);
                    System.out.println("Saldo atual: " + saldo);
                    deposito = 0;
                    break;
                }
                case 2:{
                    try {
                        System.out.print("Digite o valor do saque: ");
                        double saque = scanner.nextDouble();
                        saldo = sacar(saldo, saque);
                        System.out.println("Saldo atual: " + saldo);
                        saque = 0;
                    }catch(ValorInvalido e){
                        System.err.println(e.getMessage());
                    }
                    break;
                }
                case 3:{
                    System.out.println("Seu saldo atual: " + saldo);
                    break;
                }
                case 0:{
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                }
                default:{
                    System.out.println("Opção inválida. Tente novamente");
                }
            }
        
        }

        
    }
    /**
     * aqui vemos a função depositar que como o nome sugere ele recebe dois parâmetros soma:
     * 
     * @param saldo
     * @param deposito
     * 
     * E logo após isso retorna o novo valor do Saldo...
     * @return saldoNovo
     */
    static double depositar(double saldo, double deposito){
        double saldoNovo = saldo + deposito;
        return saldoNovo;
    }

    /**
     * Já aqui vemos a função para sacar o dinheiro onde ele recebe os parâmetros passados no input:
     * 
     * @param saldo
     * @param saque
     * 
     * subtrai esses parâmetros e retorna o valor sacado porém somente se o Usúario tiver saldo suficiente:
     * 
     * @return saldoNovo
     * 
     * E o tratamento de exceções personalizado se encontra aqui:
     * 
     * @throws ValorInvalido
     */
    static double sacar(double saldo, double saque) throws ValorInvalido{
        if(saque > saldo){
            throw new ValorInvalido("Saldo insuficiente.");
        }
        else{
            double saldoNovo = saldo - saque;
            return saldoNovo;
        }
    }
}

/**
 * 
 * @author Wesley leopoldo
 * Essa é a classe da Exceção personalizada, por padrão ela já vem com um construtor padrão do Exception,
 * mas optei por trabalhar meus novos conhecimentos adquiridos e criar um construtor especifico e personalizado.
 */
class ValorInvalido extends Exception{
    public ValorInvalido(String mensagem){
        super(mensagem);
    }
}