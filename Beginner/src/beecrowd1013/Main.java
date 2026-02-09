package beecrowd1013;

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
        String[] values = line.split(" ");
        int a = Integer.parseInt(values[0]);
        int b = Integer.parseInt(values[1]);
        int c = Integer.parseInt(values[2]);
        int biggerAB = (a + b + Math.abs(a - b)) / 2;
        int bigger = (biggerAB + c + Math.abs(biggerAB - c)) / 2;
        System.out.printf("%d eh o maior\n", bigger);
    }

}