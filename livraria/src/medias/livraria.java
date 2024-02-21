package medias;

import javax.swing.JOptionPane;

/**
 *
 * @author Maique
 */
public class livraria {

    public static void main(String[] args) {
        int qt;
        String a;
        a = JOptionPane.showInputDialog("Informe a quantidade de livro");
        qt = Integer.parseInt(a);
        float v1 = (float) ((qt * 0.25) + 7.50);
        float v2 = (float) ((qt * 0.50) + 2.50);
        if (v1 < v2) {
            JOptionPane.showMessageDialog(null, "criterio A "+v1+"\ncriterio B "+v2+"\no melhor desconto é a 1 opção");
        }
        if (v2 < v1) {
            JOptionPane.showMessageDialog(null,  "criterio A "+v1+"\ncriterio B "+v2+"\no melhor desconto é a 2 opção");
        }

    }

}
