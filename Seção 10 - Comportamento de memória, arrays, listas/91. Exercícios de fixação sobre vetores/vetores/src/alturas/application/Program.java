package alturas.application;

import alturas.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
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
