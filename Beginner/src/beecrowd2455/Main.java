package beecrowd2455;

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
        Scanner scanner = new Scanner(System.in);

        int p1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int p2 = scanner.nextInt();
        int c2 = scanner.nextInt();

        if (p1 * c1 == p2 * c2) {
            System.out.println(0);
        } else if (p1 * c1 > p2 * c2) {
            System.out.println(-1);
        } else {
            System.out.println(1);
        }

        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

    }

}