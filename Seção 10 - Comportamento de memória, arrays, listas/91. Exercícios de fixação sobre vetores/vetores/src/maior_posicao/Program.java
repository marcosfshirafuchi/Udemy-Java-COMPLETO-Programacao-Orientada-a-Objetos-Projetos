package maior_posicao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();
        double[] vet = new double[n];
        double maior = 0.0;
        int posicao = 0;
        for (int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = scanner.nextDouble();
        }

        for (int i = 0; i < vet.length; i++){
            if (vet[i] > maior){
                maior = vet[i];
                posicao = i;
            }
        }
        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f%n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d",posicao);
        scanner.close();
    }
}
