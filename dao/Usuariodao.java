package dao;
import java.util.ArrayList;
import modelo.Usuario;

public class Usuariodao {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public Usuariodao() {
        if (usuarios.isEmpty()) {
            usuarios.add(new Usuario("Guilherme", "SenhaSegura"));
        }
    }

    public boolean autenticar (String usuario, String senha) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario) && u.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }
    public void cadastrar (Usuario usuario) {
        usuarios.add(usuario);
    }
}
