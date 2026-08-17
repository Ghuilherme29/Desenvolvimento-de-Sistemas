import java.util.Scanner;

public class DiversãoCond3 {
    public static void main(String[] args) {
        
    
     Scanner sc = new Scanner(System.in);

        System.out.println("Informar a idade: ");
        int idade=sc.nextInt();

        if (idade<=13 && idade < 18 ) {
            System.out.println("Adolescente.");
        } else if (idade >= 18 && idade <=59 ){
            System.out.println("Adulto.");
        } else {
            System.out.println("Idoso");
        }

        sc.close();
}
}
