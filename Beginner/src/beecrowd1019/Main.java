package beecrowd1019;

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
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();

            int h = n / 3600;
            n = n % 3600;

            int m = n / 60;
            int s = n % 60;

            System.out.printf("%d:%d:%d%n", h, m, s);
        }
    }

}