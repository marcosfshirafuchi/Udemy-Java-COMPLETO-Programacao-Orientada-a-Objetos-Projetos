package numeros_pares;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();
        int[] vet = new int[n];
        for (int i = 0; i < vet.length; i++){
            System.out.print("Digite um numero: ");
            vet[i] = scanner.nextInt();
        }
        System.out.println();
        int quantidadeDePares = 0;
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i< vet.length; i++){
            if (vet[i] % 2 == 0) {
                System.out.print(vet[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i< vet.length; i++){
            if (vet[i] % 2 == 0){
                quantidadeDePares++;
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + quantidadeDePares);

        scanner.close();
    }
}
