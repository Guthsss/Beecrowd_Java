package beecrowd1018;

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
        int n = input.nextInt();

        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(n);

        for (int note : banknotes) {
            int qtd = n / note;
            n %= note;
            System.out.println(qtd + " nota(s) de R$ " + note + ",00");
            input.close();
        }
    }

}