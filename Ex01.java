public class Ex01 {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 4;

        // Guarda o bloco de código perigoso que pode gerar uma falha (como dividir por zero ou ler um arquivo inexistente).
        try {
            int resultado = a / b ;
            System.out.println("Resultado: " + resultado);

        // Captura a exceção específica caso ela aconteça no try, executando um código alternativo para lidar com o problema    
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é posivel dividir por zero!");
        }
        finally {
            System.err.println("Tchau!");
        }
    }
}
