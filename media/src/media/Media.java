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
        float x, y = 0, media = 0;
        for (int i = 1; i <= 3; i++) {
            a = JOptionPane.showInputDialog("informe a nota");
            x = Float.parseFloat(a);
            y += x;
        }
        media = y / 3;
        JOptionPane.showMessageDialog(null, "a media é " + media);

    }

}
