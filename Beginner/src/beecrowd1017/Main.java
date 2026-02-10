package beecrowd1017;

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
        int kmL = 12;
        try (Scanner input = new Scanner(System.in)) {
            int time = input.nextInt();
            int avg = input.nextInt();

            double liters = (time * avg) / (double) kmL;
            System.out.printf("%.3f%n", liters);


        }
    }

}