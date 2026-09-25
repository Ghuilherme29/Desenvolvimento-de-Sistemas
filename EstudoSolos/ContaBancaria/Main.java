public class Main {
    public static void main(String[] args) {
        // Inserindo o objeto da classe ContaBancaria
        ContaBancaria minhaConta = new ContaBancaria();


        // Atribuindo valores aos atributos
        minhaConta.titular = "Maria Silva";
        minhaConta.saldo = 100.0;


        // Testando os métodos
        minhaConta.exibirSaldo();


        // Fazendo um depósito
        minhaConta.depositar(250);
        minhaConta.exibirSaldo();


        // Fazendo um saque válido
        minhaConta.sacar(100.0);
        minhaConta.exibirSaldo();

        
        // Tentando fazer um saldo maior que o saldo disponivel
        minhaConta.sacar(500.0);
    }
}
