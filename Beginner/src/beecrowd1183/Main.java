package beecrowd1183;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Character c = scanner.next().toUpperCase().charAt(0);

        double sum = 0;
        int count = 0;
        Double[][] matriz = new Double[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matriz[i][j] = scanner.nextDouble();
                if (j > i) {
                    sum += matriz[i][j];
                    count ++;
                }
            }
        }
        if (c.equals('S')) {
            System.out.println(String.format("%.1f", sum));
        } else {
            System.out.println(String.format("%.1f", sum / count));
        }

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

    }

}