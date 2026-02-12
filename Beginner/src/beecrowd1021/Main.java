package beecrowd1021;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Beecrowd 1021 - Notas e Moedas
 * <p>
 * Lê um valor monetário (ex.: 576.73) e imprime a decomposição do valor
 * em notas e moedas, seguindo o formato exigido pelo beecrowd.
 * <p>
 * Estratégia:
 * - Converte o valor para centavos (inteiro) para evitar erros de ponto flutuante.
 * - Para cada nota/moeda, calcula quantas unidades cabem e atualiza o restante.
 */
public class Main {

    /**
     * Ponto de entrada do programa.
     *
     * @param args não utilizado
     * @throws IOException mantido por compatibilidade com alguns templates do beecrowd
     */
    public static void main(String[] args) throws IOException {
        // Garante que o separador decimal seja '.' (padrão US), como no beecrowd
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        // Lê o valor informado (ex.: 576.73)
        double value = input.nextDouble();

        /*
         * Converte para centavos para trabalhar com inteiros:
         * - Multiplica por 100
         * - Arredonda para o inteiro mais próximo (reduz problemas de precisão do double)
         */
        int cents = (int) Math.round(value * 100.0);

        // Valores das notas e moedas em centavos
        int[] noteValues = {10000, 5000, 2000, 1000, 500, 200}; // 100, 50, 20, 10, 5, 2
        int[] coinValues = {100, 50, 25, 10, 5, 1};            // 1, 0.50, 0.25, 0.10, 0.05, 0.01

        System.out.println("NOTAS:");
        for (int note : noteValues) {
            // Quantidade de notas do valor atual
            int qty = cents / note;

            // Atualiza o restante após retirar essas notas
            cents %= note;

            // Imprime no formato do enunciado (note/100.0 converte de centavos para reais)
            System.out.printf("%d nota(s) de R$ %.2f%n", qty, note / 100.0);
        }

        System.out.println("MOEDAS:");
        for (int coin : coinValues) {
            // Quantidade de moedas do valor atual
            int qty = cents / coin;

            // Atualiza o restante após retirar essas moedas
            cents %= coin;

            // Imprime no formato do enunciado
            System.out.printf("%d moeda(s) de R$ %.2f%n", qty, coin / 100.0);
        }

        input.close();
    }
}