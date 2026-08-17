import java.util.Scanner;

public class Cond04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informar o nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe a senha: ");
        String senha=sc.nextLine();


        if (nome.equals("Isabele") && senha.equals("1234")) {
            System.out.println("Login realizado com sucesso");
        } else if  (nome.equals("Jennifer") && senha.equals("4567")) {
            System.out.println("Login realizado");
        } else {
            System.out.println("Dados incorretos.");
        }

        sc.close();
    }
}
