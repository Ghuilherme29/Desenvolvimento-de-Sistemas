import java.util.Scanner;
public class DiversãoCond7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Verde || Azul || Amarelo || Vermelho: ");
        String Cores = sc.nextLine();

        if (Cores.equals("Verde")){
            System.out.println("R$ 10,00");

        } else if (Cores.equals("Azul")){
            System.out.println("R$ 20,00");

        } else if (Cores.equals("Amarelo")){
            System.out.println("R$ 30,00");

        } else if (Cores.equals("Vermelho")){
            System.out.println("R$ 40");
        }

        sc.close();
    }
}
