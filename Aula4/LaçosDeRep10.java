
import java.util.Scanner;

public class LaçosDeRep10 {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner (System.in);
        do {
            System.out.println("1- Iniciar jogo");
            System.out.println("2- Carregar jogo");
            System.out.println("3- Configuração");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            op=sc.nextInt();

        } while (op!=1);
            switch (op) {
             case 1 :
                System.out.println("Iniciar jogo");
                break;
             case 2 :
                System.out.println("Carregar o jogo");
                break;
             case 3 :
                System.out.println("Configuração");
                break;
             case 4 :
                System.out.println("Sair");
                break;
            default:
                
        }
       
        }
       
    }

