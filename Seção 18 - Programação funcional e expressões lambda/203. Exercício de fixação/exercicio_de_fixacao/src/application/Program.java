package application;

import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    /**
     * <h1> Udemy Java COMPLETO Programação Orientada a Objetos Projetos:<br><br>
     * Seção 18 - Programação funcional e expressões lambda</h1><br><br>
     * <b>203. Exercício de fixação<br><br></b>
     * Exercício de fixação<br><br>
     * Fazer um programa para ler os dados (nome, email e salário)
     * de funcionários a partir de um arquivo em formato .csv.<br><br>
     * Em seguida mostrar, em ordem alfabética, o email dos
     * funcionários cujo salário seja superior a um dado valor
     * fornecido pelo usuário.<br><br>
     * Mostrar também a soma dos salários dos funcionários cujo
     * nome começa com a letra 'M'.<br><br>
     * Veja exemplo na próxima página.<br><br>
     * Input file:<br>
     * Maria,maria@gmail.com,3200.00<br>
     * Alex,alex@gmail.com,1900.00<br>
     * Marco,marco@gmail.com,1700.00<br>
     * Bob,bob@gmail.com,3500.00<br>
     * Anna,anna@gmail.com,2800.00<br><br>
     * Execution:<br>
     * Enter full file path: c:\temp\in.txt<br>
     * Enter salary: 2000.00<br>
     * Email of people whose salary is more than 2000.00:<br>
     * anna@gmail.com<br>
     * bob@gmail.com<br>
     * maria@gmail.com<br>
     * Sum of salary of people whose name starts with 'M': 4900.00<br>
     * <br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 14/07/2025
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full file path: ");
        String path = scanner.nextLine();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            List<Employee> list = new ArrayList<>();

            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                list.add(new Employee(fields[0],fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();

            }
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary));
            Comparator<String> comp = (s1, s2) -> s1.compareTo(s2);
            List<String> emails = list.stream()
                    .filter(p -> p.getSalary() > salary)
                    .map(p -> p.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            emails.forEach(System.out::println);
            double sum = list.stream()
                    .filter(p -> p.getName().charAt(0) == 'M')
                    .map(p -> p.getSalary())
                    .reduce(0.0, (x,y) -> x + y);
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f",sum));


        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
