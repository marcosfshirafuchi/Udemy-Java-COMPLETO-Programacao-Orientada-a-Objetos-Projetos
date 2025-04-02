package exercicio02.application;

import exercicio02.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

/**
 * <h1> Curso mais didático e completo de Java e OO, UML, JDBC, JavaFX, Spring Boot, JPA, Hibernate, MySQL, MongoDB e muito mais</h1>
 * <br>https://www.udemy.com/course/java-curso-completo/ <br><br>
 * Prof. Dr. Nelio Alves<br><br>
 * Seção 8: Introdução à Programação Orientada a Objetos <br><br>
 * 70. Exercícios de fixação<br><br>
 * Exercício 2<br><br>
 * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
 * seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
 * salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
 * afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
 * projetada abaixo.<br><br>
  * Exemplo: <br><br>
 *  Name: Joao Silva<br>
 *  Gross salary: 6000.00<br>
 *  Tax: 1000.00<br>
 *  Employee: Joao Silva, $ 5000.00<br>
 *  Which percentage to increase salary? 10.0<br>
 *  Updated data: Joao Silva, $ 5600.00<br>
 * <p>
 * <b>Note:</b> Desenvolvido na linguagem Java.
 *
 * @authors
 * Marcos Ferreira Shirafuchi<br>
 * @version 1.0
 * @since 01/04/2025
 */
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = scanner.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();
        System.out.println();
        System.out.printf("Employee: %s, $ %.2f%n",employee.name, employee.grossSalary);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = scanner.nextDouble();
        System.out.println();
        employee.increaseSalary(percentage);
        scanner.close();
    }
}
