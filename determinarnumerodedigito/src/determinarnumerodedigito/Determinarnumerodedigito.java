package determinarnumerodedigito;

import javax.swing.JOptionPane;

/**
 *
 * @author Maique
 */
public class Determinarnumerodedigito {

    /*  Escreva
um programa que determine o número de dígitos de um valor inteiro maior ou
igual a 0.*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        int i = 0;
        String c = JOptionPane.showInputDialog("obs numero tem que ser maior ou igual a zero\ninforme um numero inteiro: ");
        x = Integer.parseInt(c);
        if (x <= -1) {
            JOptionPane.showMessageDialog(null, "numero invalido");
        } else {
            while (x != 0) {
                x = x / 10;
                i++;
            }
        }
        JOptionPane.showMessageDialog(null, "o numero de digitos é " + i);

    }
}
