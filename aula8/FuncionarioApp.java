import java.util.Scanner;
public class FuncionarioApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FuncionarioPF  funcionarioPF = null;
        FuncionarioTC funcionarioTC = null;
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== SISTEMA DE FUNCIONÁRIOS =====");
            System.out.println("1 - Cadastrar FuncionarioPF");
            System.out.println("2 - Cadastrar FuncionarioTC");
            System.out.println("3 - Exibir FuncionarioPF");
            System.out.println("4 - Exibir FuncionarioTC");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.print("Nome do FuncionarioPF: ");
                    String nomePF = scanner.nextLine();
                    System.out.print("Salário: ");
                    double salarioPF = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Disciplina: ");
                    String disciplina = scanner.nextLine();

                    funcionarioPF = new FuncionarioPF(nomePF, salarioPF, disciplina);
                    System.out.println("FuncionarioPF cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Nome do FuncionarioTC: ");
                    String nomeTC = scanner.nextLine();
                    System.out.print("Salário: ");
                    double salarioTC = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Setor: ");
                    String setor = scanner.nextLine();

                    funcionarioTC = new FuncionarioTC(nomeTC, salarioTC, setor);
                    System.out.println("FuncionarioTC cadastrado com sucesso!");
                    break;

                case 3:
                    if (funcionarioPF != null) {
                        System.out.println("\n--- Dados do FuncionarioPF ---");
                        funcionarioPF.exibirInfo();
                    } else {
                        System.out.println("Nenhum FuncionarioPF cadastrado ainda.");
                    }
                    break;

                case 4:
                    if (funcionarioTC != null) {
                        System.out.println("\n--- Dados do FuncionarioTC ---");
                        funcionarioTC.exibirInfo();
                    } else {
                        System.out.println("Nenhum FuncionarioTC cadastrado ainda.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}