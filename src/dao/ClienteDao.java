package dao;

import java.util.ArrayList;

import modelo.Cliente;

public class ClienteDao {
    
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void cadastrar_cliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> listarCliente() {
        return clientes;
    }

    public Cliente buscarCliente(int codigo) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == codigo) {
                return cliente;
            }
        }
        return null;
    }

    public boolean alterar (int codigo, String nome, String telefone, String email) {
        Cliente cliente = buscarCliente(codigo);

        if (cliente != null) {
            cliente.setNome(nome);
            cliente.setTelefone(telefone);
            cliente.setEmail(email);
            return true;
        }
        return false;
    }

    public boolean remover (int codigo) {
        Cliente cliente = buscarCliente(codigo);

        if (cliente != null) {
            clientes.remove(cliente);
            return true;
        }
        return false;    
    }

}
