public class Cliente extends Pessoa implements Pagamento {

    public Cliente(String nome) {
        super(nome);
    }

    @Override 
    public void pagar (double valor) {
        System.out.println("Pagamenyo realizado: R$ "+ valor);
    }
    
    public void comprar (String produto) {
        System.out.println("Produto Comprado: " + produto);
    }
    
    public void comprar (String produto, int quantidade, double valor) {
        System.out.println("Produto Comprado: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("valor Unitário: " + valor);
        System.out.println("Total: " + (quantidade * valor));

    }
    
}
