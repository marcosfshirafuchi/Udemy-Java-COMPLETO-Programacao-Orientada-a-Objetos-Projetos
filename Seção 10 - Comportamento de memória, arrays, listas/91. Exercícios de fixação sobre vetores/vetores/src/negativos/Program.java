package negativos;

import java.util.Scanner;

public class Program {
    /**
     * <h1> Java e Orientação a Objetos <br>
     * Prof. Dr. Nelio Alves  <br>
     * Exercícios de fixação sobre vetores</h1><br>
     * <b>Problema "negativos" <br><br></b>
     * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
     * e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. <br><br>
     * Exemplo: <br>
     * Quantos numeros voce vai digitar? 6 <br>
     * Digite um numero: 8 <br>
     * Digite um numero: -2 <br>
     * Digite um numero: 9 <br>
     * Digite um numero: 10 <br>
     * Digite um numero: -3 <br>
     * Digite um numero: -7 <br>
     * NUMEROS NEGATIVOS:<br> -2<br> -3<br> -7 <br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 27/04/2025
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int N = scanner.nextInt();
        int[] vect = new int[N];
        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextInt();
        }
        int contNumerosNegativos = 0;
        for (int i = 0; i < vect.length; i++){
            if (vect[i]< 0){
                contNumerosNegativos++;
            }
        }
        int[] numerosNegativos = new int[contNumerosNegativos];
        int j = 0;
        for (int i = 0; i < vect.length; i++){
            if (vect[i]< 0){
                numerosNegativos[j] = vect[i];
                j++;
            }
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < numerosNegativos.length; i++){
            System.out.println(numerosNegativos[i]);
        }
        scanner.close();
    }
}
