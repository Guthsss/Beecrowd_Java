package beecrowd1016;

import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    public static void main(String[] args) {
        final int MINUTOS_POR_KM = 2;

        try (Scanner input = new Scanner(System.in)) {
            int distanciaKm = input.nextInt();
            int tempoMin = distanciaKm * MINUTOS_POR_KM;

            System.out.println(tempoMin + " minutos");
        }
    }
}