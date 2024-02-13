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
     * @param x
     * @return
     *
     */
    public static int digitos(int x) {
        int i = 0;
        if (x == 0) {
            return 1;
        } else {
            while (x != 0) {
                i++;
                x = x / 10;
            }
            return i;
        }
    }

    public static void main(String[] args) {
        int x;
        int a;
        String c = JOptionPane.showInputDialog("obs numero tem que ser maior ou igual a zero\ninforme um numero inteiro: ");
        x = Integer.parseInt(c);
        if (x <= -1) {
            JOptionPane.showMessageDialog(null, "numero invalido");
        } else {
            a = digitos(x);
            JOptionPane.showMessageDialog(null, "o numero de digitos é " + a);
        }

    }
}
