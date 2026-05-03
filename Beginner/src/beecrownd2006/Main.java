package beecrownd2006;

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

        int t = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < 5; i++) {
            int x = scanner.nextInt();
            if (x == t) {
                count ++;
            }
        }
        System.out.println(count);


        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */

    }

}