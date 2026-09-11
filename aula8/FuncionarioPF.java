class FuncionarioPF extends Funcionario {
    private String disciplina;

    public FuncionarioPF(String nome, double salario, String disciplina) {
        super(nome, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Disciplina: " + disciplina);
    }
}