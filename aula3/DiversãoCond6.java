import java.util.Scanner;

public class DiversãoCond6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Escolha o operador (+, - , *, / ): ");
        String Operador = sc.nextLine();
        
        System.out.println("OPERANDO1: ");
        double OPERANDO1 = sc.nextDouble();

        System.out.println("Digite o 2ª OPERANDO:  ");
        double OPERANDO2 =  sc.nextDouble();


         double resultado = 0;

        if (Operador.equals("+")) {
            resultado = OPERANDO1 + OPERANDO2;
        } else if  (Operador.equals("-")) {
            resultado = OPERANDO1 - OPERANDO2;
        
        } else if  (Operador.equals("*")) {
            resultado = OPERANDO1 * OPERANDO2;
        }
         else if  (Operador.equals("/")) {
            resultado = OPERANDO1 / OPERANDO2;
        }
        System.out.printf("Resultado: %.2f", resultado);

        sc.close();
    }
}