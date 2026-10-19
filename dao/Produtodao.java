package dao;
import java.util.ArrayList;
import modelo.Produto;

public class Produtodao {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public void cadastrar_produto (Produto produto) {
        produtos.add(produto);
    }

    public ArrayList<Produto> listarProduto() {
        return produtos;
    }

    public Produto buscarProduto (int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public boolean alterar (int id, String nome, int preco, String categoria, int quantidade_estoque) {
        Produto produto = buscarProduto(id);

        if (produto != null) {
            produto.setNome(nome);
            produto.setPreco(preco);
            produto.setCategoria(categoria);
            produto.setQuantidade_estoque(quantidade_estoque);
            return true;
        }
        return false;
    }

    public boolean remover (int id) {
        Produto produto = buscarProduto(id);

        if (produto != null) {
            produtos.remove(produto);
            return true;
        }
        return false;
    }

}