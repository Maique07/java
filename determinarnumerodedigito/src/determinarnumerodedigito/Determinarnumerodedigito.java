/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
       String c = JOptionPane.showInputDialog("informe um numeor inteiro: ");
       x = Integer.parseInt(c);
       while(x != 0){
        x = x /10;
        i++;
    }
       JOptionPane.showMessageDialog(null, "o numero de digitos é "+ i);
    
}
}