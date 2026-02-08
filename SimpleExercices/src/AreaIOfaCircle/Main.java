package AreaIOfaCircle;

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
        double r = input.nextDouble();
        System.out.printf("A=%.4f", (3.14159*Math.pow(r, 2)));
        System.out.println();
    }
}