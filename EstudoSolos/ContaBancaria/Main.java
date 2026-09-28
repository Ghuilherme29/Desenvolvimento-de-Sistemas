import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Criando o objeto Scanner para ler do teclado
        Scanner sc = new Scanner (System.in);

        // Instaciando a conta bancária
        ContaBancaria minhaConta = new ContaBancaria();

        // Solicita e lê o nome do titular
        System.out.println("Digite o nome do titular da conta: ");
        minhaConta.titular = sc.nextLine();

        // Solicita e lê o saldo inicial
        System.out.println("Digite o saldo inicial: R$ ");
        minhaConta.saldo = sc.nextDouble();

        // Exibe a situação inicial
        minhaConta.exibirSaldo();

        // Operação de Depósito
        System.out.println("Digite o valor que deseja depositar: R$ ");
        double valorSaque = sc.nextDouble();
        minhaCOnta.sacar(valorSaque);
       


        sc.close();


















        // ## Inserindo o objeto da classe ContaBancaria ##
       // ContaBancaria minhaConta = new ContaBancaria();


        //## Atribuindo valores aos atributos ##
        //minhaConta.titular = "Maria Silva";
        //minhaConta.saldo = 100.0;


        //## Testando os métodos ##
        //minhaConta.exibirSaldo();


        //## Fazendo um depósito ##
        //minhaConta.depositar(250);
        //minhaConta.exibirSaldo();


        //## Fazendo um saque válido ##
        //minhaConta.sacar(100.0);
        //minhaConta.exibirSaldo();

        
        // Tentando fazer um saldo maior que o saldo disponivel
        //minhaConta.sacar(500.0);
    }
}
