public class NotaFiscal {
    public static void main(String[] args) {
        String nome_cliente = "Carlos";
        String nome_prd = "Xícara";
        int quantidade = 12;
        double valor_unitario = 17.80;

        double total = quantidade * valor_unitario;

        System.out.printf("-----------NOTA FISCAL------------   %n | Nome do Cliente: %s%n | Nome do produto: %s%n | Quantidade: %d%n | Valor Unitario: %.2f%n | Total: %.2f%n ----------------------------------",
            nome_cliente,
            nome_prd,
            quantidade,
            valor_unitario,
            total
        );
    }
}
