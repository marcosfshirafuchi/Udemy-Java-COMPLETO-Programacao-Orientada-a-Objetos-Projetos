package abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    /**
     * <h1> Java e Orientação a Objetos <br>
     * Prof. Dr. Nelio Alves  <br>
     * Exercícios de fixação sobre vetores</h1><br>
     * <b>Problema "abaixo_da_media"     <br><br></b>
     * Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
     * mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
     * os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. <br><br>
     *
     * Exemplo: <br>
     * Quantos elementos vai ter o vetor? 4 <br>
     * Digite um numero: 10.0 <br>
     * Digite um numero: 15.5  <br>
     * Digite um numero: 13.2 <br>
     * Digite um numero: 9.8 <br><br>
     *
     * MEDIA DO VETOR = 12.125 <br>
     * ELEMENTOS ABAIXO DA MEDIA: <br>
     * 10.0 <br>
     * 9.8<br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 04/05/2025
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scanner.nextInt();
        int[] vet = new int[n];
        double[] vect = new double[n];
        for (int i  = 0; i < vet.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextDouble();
        }
        double soma = 0.0;
        for (int i  = 0; i < vet.length; i++){
            soma += vect[i];
        }
        double media = soma / n;
        System.out.println();
        System.out.println("MEDIA DO VETOR = " + media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i  = 0; i < vet.length; i++){
            if (vect[i] < media){
                System.out.println(vect[i]);
            }
        }
        scanner.close();

    }
}
