class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, int ano, int cilindrada) {
        super(marca, ano); // Chama o construtor da classe pai (Veiculo)
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Aproveita a exibição da marca e do ano
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}