package intervalodetempo;

import java.util.Scanner;

/**
 *
 * @author Maique
 */
public class Intervalodetempo {

    /*    Dados
seis números inteiros representando dois intervalos de tempo (horas, minutos e
segundos), faça um programa para calcular a soma e a diferença desses
intervalos.*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int difeH = 0, difeM = 0, difeS = 0;
        int somaS = 0, somaM = 0, somaH = 0;
        Scanner x = new Scanner(System.in);
        System.out.println("informe a hora, minuto e segundos inicial: ");
        int HI = x.nextInt();
        int MI = x.nextInt();
        int SI = x.nextInt();
        System.out.println("informe a hora minuto e segundos final: ");
        int HF = x.nextInt();
        int MF = x.nextInt();
        int SF = x.nextInt();
        somaH = HF + HI;
        somaM = MF + MI;
        somaS = SF + SI;
        if (somaS >= 60) {
            somaS -= 60;
            somaM += 1;
        }
        if (somaM >= 60) {
            somaM -= 60;
            somaH += 1;
        }
      
        difeH = HF - HI;
        difeM = MF - MI;
        difeS = SF - SI;
        if (difeS <= -1) {
            difeS += 60;
            difeM -= 1;
        }
        if (difeM <= -1) {
            difeM += 60;
            difeH -= 1;
        }
        if (difeH <= -1) {
            difeH += 24;
        }
        System.out.println("A soma dos tempos é:" + somaH + "hora " + somaM + "minutos " + somaS + "segundos ");
        System.out.println("O intervalo de tempo é:" + difeH + "hora " + difeM + "minutos " + difeS + "segundos ");
    }

}
