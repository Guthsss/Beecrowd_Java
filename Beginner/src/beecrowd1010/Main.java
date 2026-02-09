package beecrowd1010;

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
        String line1 = input.nextLine();
        String line2 = input.nextLine();

        String[] parts1 = line1.split(" ");
        int code1 = Integer.parseInt(parts1[0]);
        int units1 = Integer.parseInt(parts1[1]);
        double price1 = Double.parseDouble(parts1[2]);

        String[] parts2 = line2.split(" ");
        int code2 = Integer.parseInt(parts2[0]);
        int units2 = Integer.parseInt(parts2[1]);
        double price2 = Double.parseDouble(parts2[2]);

        double valueToPay = (units1 * price1) + (units2 * price2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valueToPay );

        input.close();
    }

}