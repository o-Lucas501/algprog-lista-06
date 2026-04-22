import java.util.Scanner;

public class atv07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;
        int multiplicacao = 1;

        // Leitura dos números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = sc.nextInt();

            soma += numeros[i];
            multiplicacao *= numeros[i];
        }

        // Exibição dos números
        System.out.print("Números: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        // Resultados
        System.out.println("\nSoma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);

        sc.close();
    }
}