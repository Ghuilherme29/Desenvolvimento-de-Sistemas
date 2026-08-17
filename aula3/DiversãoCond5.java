import java.util.Scanner;

public class DiversãoCond5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informar o nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe a senha: ");
        String senha=sc.nextLine();


        if (nome.equals("Ingrid") && senha.equals("123DFR")) {
            System.out.println("Porta aberta");
        
        } else {
            System.out.println("Senha não confere.");
        }

        sc.close();
    }
}
