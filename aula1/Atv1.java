import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("informe o N1: ");
        double N1=sc.nextDouble();

        System.out.print("informe o N2: ");
        double N2=sc.nextDouble();


       double soma = N1 + N2 ;
       double multi = N1 * N2;
       double div =  N1 / N2;
       double sub =  N1 - N2;

       System.out.println("Soma: " + soma);
       System.out.println("Subtração: " + sub);
       System.out.println("Multtiplição: " + multi);
       System.out.println("divisão: " + div);

       sc.close();
    }
}
