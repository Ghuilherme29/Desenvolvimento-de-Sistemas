package Diversao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SistemaCarros {

    public static void main(String[] args) {
        ArrayList<Carro> lista = new ArrayList<>();
        int opcao = 0;

        while (opcao != 7) {
            String menu = "=== MENU ===\n" +
                    "1 - Cadastrar Carro\n" +
                    "2 - Listar Carros\n" +
                    "3 - Detalhar Carro\n" +
                    "4 - Alterar Carro\n" +
                    "5 - Remover Carro\n" +
                    "6 - Gravar Arquivo\n" +
                    "7 - Sair\n\n" +
                    "Escolha uma opção:";

            String entrada = JOptionPane.showInputDialog(menu);
            
           
            if (entrada == null) {
                break;
            }

            opcao = Integer.parseInt(entrada);

            switch (opcao) {
                case 1:
                    String marca = JOptionPane.showInputDialog("Marca:");
                    String modelo = JOptionPane.showInputDialog("Modelo:");
                    int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));

                    Carro c = new Carro(marca, modelo, ano);
                    lista.add(c);
                    
                    JOptionPane.showMessageDialog(null, "Carro cadastrado!");
                    break;

                case 2:
                    String textoLista = "=== LISTA DE CARROS ===\n";
                    for (int i = 0; i < lista.size(); i++) {
                        textoLista += (i + 1) + " - " + lista.get(i).getMarca() + " / " + lista.get(i).getModelo() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, textoLista);
                    break;

                case 3:
                    int posDetalhar = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do carro:")) - 1;
                    Carro carroSelecionado = lista.get(posDetalhar);
                    JOptionPane.showMessageDialog(null, carroSelecionado.exibirDetalhes());
                    break;

                case 4:
                    int posAlterar = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do carro a alterar:")) - 1;
                    
                    String novaMarca = JOptionPane.showInputDialog("Nova Marca:");
                    String novoModelo = JOptionPane.showInputDialog("Novo Modelo:");
                    int novoAno = Integer.parseInt(JOptionPane.showInputDialog("Novo Ano:"));

                    lista.get(posAlterar).setMarca(novaMarca);
                    lista.get(posAlterar).setModelo(novoModelo);
                    lista.get(posAlterar).setAno(novoAno);

                    JOptionPane.showMessageDialog(null, "Carro alterado com sucesso!");
                    break;

                case 5:
                    int posRemover = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do carro a remover:")) - 1;
                    lista.remove(posRemover);
                    JOptionPane.showMessageDialog(null, "Carro removido!");
                    break;

                case 6:
                    try {
                        FileWriter arq = new FileWriter("carros.txt");
                        PrintWriter gravarArq = new PrintWriter(arq);

                        for (int i = 0; i < lista.size(); i++) {
                            gravarArq.println("Marca: " + lista.get(i).getMarca());
                            gravarArq.println("Modelo: " + lista.get(i).getModelo());
                            gravarArq.println("Ano: " + lista.get(i).getAno());
                            gravarArq.println("--------------------------------");
                        }

                        arq.close(); 
                        JOptionPane.showMessageDialog(null, "Dados salvos em carros.txt!");
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(null, "Erro ao salvar arquivo!");
                    }
                    break;

                case 7:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }
    }
}