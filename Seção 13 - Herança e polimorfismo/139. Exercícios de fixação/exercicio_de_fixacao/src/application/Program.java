package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();
        List<Pessoa> list = new ArrayList<>();
        for (int i = 1; i <=n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = scanner.nextDouble();
            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = scanner.nextDouble();
                list.add(new PessoaFisica(name, anualIncome, healthExpenditures));
            }else{
                System.out.print("Number of employees: ");
                int numberOfEmployees = scanner.nextInt();
                list.add(new PessoaJuridica(name, anualIncome, numberOfEmployees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for (Pessoa pessoa : list){
            System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f",pessoa.calculaImposto()));
        }
        System.out.println();
        double sum = 0.0;
        for (Pessoa pessoa : list){
            sum += pessoa.calculaImposto();
        }
        System.out.printf("TOTAL TAXES: $ %.2f%n",sum);
        scanner.close();
    }
}
