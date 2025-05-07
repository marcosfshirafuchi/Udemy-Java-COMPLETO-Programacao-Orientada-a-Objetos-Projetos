package mais_velho;

import java.util.Scanner;

public class Program {
    /**
     * <h1> Java e Orientação a Objetos <br>
     * Prof. Dr. Nelio Alves  <br>
     * Exercícios de fixação sobre vetores</h1><br>
     * <b>Problema "mais_velho"     <br><br></b>
     *
     * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
     * devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
     * da pessoa mais velha. <br><br>
     *
     * Exemplo: <br>
     * Quantas pessoas voce vai digitar? 5 <br>
     * Dados da 1a pessoa: <br>
     * Nome: Joao <br>
     * Idade: 16 <br>
     * Dados da 2a pessoa: <br>
     * Nome: Maria <br>
     * Idade: 21 <br>
     * Dados da 3a pessoa: <br>
     * Nome: Teresa <br>
     * Idade: 15 <br>
     * Dados da 4a pessoa: <br>
     * Nome: Carlos <br>
     * Idade: 23 <br>
     * Dados da 5a pessoa: <br>
     * Nome: Paulo <br>
     * Idade: 17 <br>
     * PESSOA MAIS VELHA: Carlos <br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 07/05/2025
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = scanner.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            nome[i] = scanner.next();
            System.out.print("Idade: ");
            idade[i] = scanner.nextInt();
        }
        int maiorIdade = 0;
        int posicaoMaiorIdade = 0;
        for (int i = 0; i < n; i++) {
            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
                posicaoMaiorIdade = i;
            }

        }
        System.out.println("PESSOA MAIS VELHA: " + nome[posicaoMaiorIdade]);
        scanner.close();
    }
}
