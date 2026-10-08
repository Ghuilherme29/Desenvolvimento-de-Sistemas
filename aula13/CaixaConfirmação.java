package aula13;

import javax.swing.JOptionPane;

public class CaixaConfirmação {
    public static void main(String[] args) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?","Confirmação", JOptionPane.YES_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Você escolheu sim", "resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Você escolheu não", "Resultado", JOptionPane.WARNING_MESSAGE);
        }

    }
}
