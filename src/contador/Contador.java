package contador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o primeiro parâmetro: ");
            int inicio = scanner.nextInt();

            System.out.print("Digite o segundo parâmetro: ");
            int fim = scanner.nextInt();

            if (inicio > fim) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            for (int i = inicio; i <= fim; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (InputMismatchException e) {
            System.err.println("Erro: Os parâmetros devem ser números inteiros");
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        }
    }
}