package beecrowd1021;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double value = input.nextDouble();
        int cents = (int) Math.round(value * 100.0);

        int[] noteValues = {10000, 5000, 2000, 1000, 500, 200};
        int[] coinValues = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int note : noteValues) {
            int qty = cents / note;
            cents %= note;
            System.out.printf("%d nota(s) de R$ %.2f%n", qty, note / 100.0);
        }

        System.out.println("MOEDAS:");
        for (int coin : coinValues) {
            int qty = cents / coin;
            cents %= coin;
            System.out.printf("%d moeda(s) de R$ %.2f%n", qty, coin / 100.0);
        }
        input.close();
    }
}