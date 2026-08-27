import java.util.Scanner;

public class Vet07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];

        System.out.println("===Cadastro de Nomes===");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome: ");
            nomes[i] = sc.nextLine();
        }

        System.out.println("\nLista atual:");
        listar(nomes);

        System.out.println("\nDigite a posição para alterar (0 a " + (nomes.length - 1) + "): ");
        int posAlterar = sc.nextInt();
        sc.nextLine();

        if (posAlterar >= 0 && posAlterar < nomes.length) {
            System.out.println("Digite o novo nome: ");
            nomes[posAlterar] = sc.nextLine();
        } else {
            System.out.println("Posição inválida!");
        }

        System.out.println("\nLista atualizada:");
        listar(nomes);

        sc.close();
    }

    public static void listar(String[] array) {
        for (int i = 0; i < array.length; i++) {
           
            System.out.println(i + " - " + array[i]);
        }
    }
}