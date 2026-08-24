import java.util.Scanner;

public class Diversão5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) { 
            System.out.println(numero + " x " + (i + 1) + " = " + (numero * (i + 1)));
        }

        sc.close();
    }
}
