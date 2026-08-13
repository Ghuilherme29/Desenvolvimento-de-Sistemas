import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("informe o N1: ");
        double N1=sc.nextDouble();

        System.out.print("informe o N2: ");
        double N2=sc.nextDouble();

        System.out.print("informe o N3: ");
        double N3=sc.nextDouble();

       double media = (N1+N2+N3) / 3;

       System.out.println("sua média é " + media);
     
       sc.close();
    }
}
