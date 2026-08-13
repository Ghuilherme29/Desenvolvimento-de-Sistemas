import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o nome:");
        String nome=sc.nextLine();
        

        System.out.print("Informe N1: ");
        double N1=sc.nextDouble();

        System.out.print("Informe N2: ");
        double N2=sc.nextDouble();

        double media= (N1+N2) / 2;

        System.out.println("Olá " + nome+ "! Sua média é: " + media);
        sc.close();
    }
}
