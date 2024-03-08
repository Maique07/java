package data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Maique
 */
public class Data {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("data/hora atual: " + c.getTime());
        System.out.println("\nAno: " + c.get(Calendar.YEAR));
        System.out.println("\nMês: " + (c.get(Calendar.MONTH) + 1));
        System.out.println("\nDia: " + c.get(Calendar.DAY_OF_MONTH));

        int hora = c.get(Calendar.HOUR_OF_DAY);
        if (hora > 6 && hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora > 12 && hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
        Date datadenascimento = null;
        SimpleDateFormat formatodata = new SimpleDateFormat("dd/mm/yyy");
        formatodata.setLenient(false);
        System.out.println("Informe a data de nascimento no formato dd/MM/yyyy: ");
        Scanner s = new Scanner(System.in);
        String teclado = s.next();

        try {
            datadenascimento = formatodata.parse(teclado);
            System.out.println("Data Informada sem formatação: " + datadenascimento);
            System.out.println("data com formatação: " + formatodata.format(datadenascimento));
        } catch (Exception e) {
            System.out.println("data invalida");
        }
        Calendar hoje = Calendar.getInstance();
        hoje.getTime();
        Calendar datanas = Calendar.getInstance();
        datanas.setTime(datadenascimento);
        int idade = hoje.get(Calendar.YEAR) - datanas.get(Calendar.YEAR);
           if (hoje.get(Calendar.MONTH) < datanas.get(Calendar.MONTH)) {
            idade--;
        }
        System.out.println("Idade: " + idade);
    }

}
