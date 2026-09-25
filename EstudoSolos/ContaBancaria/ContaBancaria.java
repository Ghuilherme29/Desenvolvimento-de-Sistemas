public class ContaBancaria {

    // Atributos
    String titular;
    double saldo;

    // Método para depositar
    public void depositar (double valor) {
        if (valor > 0) {
            saldo += valor; // Soma o valor depositado ao saldo atual
            System.out.println("Depósito de R$ "+  valor +" realizado com sucesso" );
        } else {
            System.out.println("O valor do depósito deve ser maior que zero.");
        }
    }

        // Método para Sacar
        public void sacar (double valor) {
            if (valor > saldo) {
                System.out.println("O saldo insuficiente para o saque de R$ " + valor);
            } else if (valor <= 0) {
                System.out.println("O valor do saque deve ser positivo.");
            } else {
                saldo -= valor; // Subtrai o valor sacado do saldo atual
                System.out.println("Saque de R$ " +valor + " realizado com sucesso.");
            }
        
                }
           
           // Método para exibir o saldo
           public void exibirSaldo() {
            System.out.println("---------------------------------");
            System.out.println("Titular" + titular);
            System.out.println("Saldo atual-" + saldo);
            System.out.println("---------------------------------");
           }
           
            }
