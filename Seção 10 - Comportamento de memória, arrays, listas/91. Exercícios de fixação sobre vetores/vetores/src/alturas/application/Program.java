package alturas.application;

import alturas.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    /**
     * <h1> Java e Orientação a Objetos <br>
     * Prof. Dr. Nelio Alves  <br>
     * Exercícios de fixação sobre vetores</h1><br>
     * <b>Problema "alturas"      <br><br></b>
     * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
     * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
     * bem como os nomes dessas pessoas caso houver. <br><br>
     *
     * Exemplo: <br>
     * Quantas pessoas serao digitadas? 5 <br>
     * Dados da 1a pessoa: <br>
     * Nome: Joao <br>
     * Idade: 15 <br>
     * Altura: 1.82 <br>
     * Dados da 2a pessoa: <br>
     * Nome: Maria <br>
     * Idade: 16 <br>
     * Altura: 1.60 <br>
     * Dados da 3a pessoa: <br>
     * Nome: Teresa <br>
     * Idade: 14 <br>
     * Altura: 1.58 <br>
     * Dados da 4a pessoa: <br>
     * Nome: Carlos <br>
     * Idade: 21 <br>
     * Altura: 1.65 <br>
     * Dados da 5a pessoa: <br>
     * Nome: Paulo <br>
     * Idade: 17 <br>
     * Altura: 1.78 <br><br>
     *
     * Altura média: 1.69 <br>
     * Pessoas com menos de 16 anos: 40.0% <br>
     * Joao <br>
     * Teresa <br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 07/05/2025
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();
        Pessoa[] pessoa = new Pessoa[n];
        for (int i = 0; i < pessoa.length; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            pessoa[i] = new Pessoa(nome, idade, altura);
        }
        double soma = 0.0;
        for (int i = 0; i < pessoa.length; i++) {
            soma += pessoa[i].getAltura();
        }
        double media = soma / pessoa.length;
        System.out.printf("Altura média: %.2f%n", media);
        int menorDeIdade = 0;
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) {
                menorDeIdade ++;
            }
        }
        double porcentagemDeMenoresDeIdade =  (double) menorDeIdade / pessoa.length * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",porcentagemDeMenoresDeIdade);
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) {
                System.out.println(pessoa[i].getNome());
            }
        }
        scanner.close();
    }
}
