public class PessoaApp {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa (1,"Luskas");
        Pessoa p2 = new Pessoa (2,"Vitu");


            // Acessador
        System.out.println("Pessoa" + p1.getCodigo() +"nome"+p1.getNome());  
        
        //Modificador
        p1.SetNome("Vanessa");

        System.out.println("Pessoa: "+p1.getCodigo()+"nome"+p1.getNome());
    }
}
