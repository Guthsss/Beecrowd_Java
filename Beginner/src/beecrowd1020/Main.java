package beecrowd1020;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int days  = input.nextInt();

        int year = days/365;
        int daysleft = days%365;

        int month = daysleft/30;
        daysleft = daysleft%30;

        System.out.println(year + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(daysleft + " dia(s)");
    }

}