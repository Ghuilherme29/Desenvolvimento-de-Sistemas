package modelo;

public class Produto {
    private int id;
    private String nome;
    private int preco;
    private String categoria;
    private int quantidade_estoque; 

    public Produto (int id, String nome, String categoria, int quantidade_estoque) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade_estoque = quantidade_estoque;
    }

    public int getId (){
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public int getPreco () {
        return preco;
    }

    public void setPreco (int preco) {
        this.preco = preco;
    }

    public String getCategoria () {
        return categoria;
    }

    public void setCategoria (String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque (int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

}
