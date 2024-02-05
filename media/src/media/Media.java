package media;

import javax.swing.JOptionPane;

/**
 *
 * @author Maique
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a;
        float f = 0;
        float not_recup = 0;
        float x, y = 0, media = 0;
        for (int i = 1; i <= 3; i++) {
            a = JOptionPane.showInputDialog("informe sua nota " + i);
            x = Float.parseFloat(a);
            y += x;
        }
        media = y / 3;
        if (media >= 7) {
            JOptionPane.showMessageDialog(null, "a media é " + media + "\naluno aprovado");
        } else {
            JOptionPane.showMessageDialog(null, "a media é " + media + "\naluno reprovado tera que fazer recuperação");
            String r = JOptionPane.showInputDialog("informe sua nota na recuperação");
            not_recup = Float.parseFloat(r);

            f = (media + not_recup) / 2;
            if (f >= 5) {
                JOptionPane.showMessageDialog(null, "aluno aprovado na recuperação");
            } else {
                JOptionPane.showMessageDialog(null, "aluno reprovou");
            }
        }
    }

}
