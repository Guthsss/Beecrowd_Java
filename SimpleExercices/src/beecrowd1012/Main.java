package beecrowd1012;

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
        String line = input.nextLine();
        String[] parts = line.split(" ");
        double a = Double.parseDouble(parts[0]);
        double b = Double.parseDouble(parts[1]);
        double c = Double.parseDouble(parts[2]);

        double triangular = (a * c) / 2;
        double circular = 3.14159 * Math.pow(c, 2);
        double trapeze = ((a + b) * c) / 2;
        double quadrant = Math.pow(b, 2);
        double rectangular = a * b;
        System.out.printf("TRIANGULO: %.3f%n", triangular);
        System.out.printf("CIRCULO: %.3f%n", circular);
        System.out.printf("TRAPEZIO: %.3f%n", trapeze);
        System.out.printf("QUADRADO: %.3f%n", quadrant);
        System.out.printf("RETANGULO: %.3f%n", rectangular);
    }

}
