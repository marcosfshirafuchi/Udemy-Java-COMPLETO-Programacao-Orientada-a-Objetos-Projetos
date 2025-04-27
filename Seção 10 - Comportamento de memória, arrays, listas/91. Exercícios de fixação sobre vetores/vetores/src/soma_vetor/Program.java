package soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int N = scanner.nextInt();
        double[] vect = new double[N];
        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextDouble();
        }
        System.out.println();
        System.out.print("VALORES = ");
        for (int i = 0; i < vect.length; i++){
            System.out.print(vect[i] + " ");
        }
        double soma = 0.0;
        for (int i = 0; i < vect.length; i++){
            soma = vect[i];
        }

        System.out.println();
        System.out.printf("SOMA = %.2f%n",soma);
        double media = soma / N;
        System.out.printf("MEDIA = %.2f%n",media);
        scanner.close();
    }
}
