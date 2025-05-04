package soma_vetores;

import java.util.Scanner;

public class Program {
    /**
     * <h1> Java e Orientação a Objetos <br>
     * Prof. Dr. Nelio Alves  <br>
     * Exercícios de fixação sobre vetores</h1><br>
     * <b>"Problema "soma_vetores"   <br><br></b>
     * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
     * terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
     * o vetor C gerado. <br><br>
     *
     * Exemplo: <br>
     * Quantos valores vai ter cada vetor? 6 <br>
     * Digite os valores do vetor A: <br>
     * 8 <br>
     * 2 <br>
     * 11 <br>
     * 14 <br>
     * 13 <br>
     * 20 <br>
     * Digite os valores do vetor B: <br>
     * 5 <br>
     * 10 <br>
     * 3  <br>
     * 1 <br>
     * 10 <br>
     * 7 <br>
     * VETOR RESULTANTE: <br>
     * 13 <br>
     * 12 <br>
     * 14 <br>
     * 15 <br>
     * 23 <br>
     * 27 <br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 04/05/2025
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = scanner.nextInt();
        int[] vetA = new int[n];
        int[] vetB = new int[n];
        int[] vetC = new int[n];
        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vetA.length;i++){
            vetA[i] = scanner.nextInt();
        }
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vetB.length;i++){
            vetB[i] = scanner.nextInt();
        }
        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < vetC.length;i++){
            vetC[i] = vetA[i] + vetB[i];
        }

        for (int i = 0; i < vetC.length;i++){
            System.out.println(vetC[i]);
        }
        scanner.close();
    }
}
